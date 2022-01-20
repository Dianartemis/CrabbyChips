import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.io.*;
import java.util.*;

public class Woo {

  static Player player = new Player();
  static Scanner in = new Scanner(System.in);

  public static Pokemon generatePokemon(int type) {
    int random = (int) ((Math.random() * 10) - 5);
    String[] fire = new String[] { "vulpix", "slugma", "numel", "charmander", "cyndaquil", "torchic" };
    String[] water = new String[] { "feebas", "wooper", "lotad", "marill", "wingull", "poliwag" };
    String[] grass = new String[] { "cherubi", "seedot", "bulbasaur", "chikorita", "treecko", "bellsprout" };
    int level = generateLvl(player);

    if (type == 0) {
      String name = fire[random];
      Pokemon pok = new Fire(name, level, 0);
      return pok;
    } else if (type == 1) {
      String name = water[random];
      Pokemon pok = new Water(name, level, 0);
      return pok;
    } else {
      String name = grass[random];
      Pokemon pok = new Grass(name, level, 0);
      return pok;
    }

  }

  public static int generateLvl(Player name) {
    int random = (int) ((Math.random() * 10) + (name._pokedex[0].getLvl() - 3));
    return random;
  }

  public static int generateType() {
    int random = (int) ((Math.random() * 10) - 8);
    if (random == 0) {
      // type is Fire
      return 0;
    } else if (random == 1) {
      // type is Water
      return 1;
    } else {
      // type is Grass
      return 2;
    }
  }

  public static boolean generateGender() {
    int random = (int) (Math.random() * 10);
    if (random <= 5) {
      return true;
    } else {
      return false;
    }
  }

  public static String generateName() {
    String[] name = new String[] { "Dawn", "Lucas", "Barry", "Riley", "Rowen", "Cynthia" };
    int random = (int) (Math.random() * 10 - (10 - name.length));
    return name[random];
  }

  public static void wait(int s) {
    try {
      Thread.sleep(s * 1000);
    } catch (InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }

  public boolean runaway() {
    int random = (int) (Math.random() * 10);
    if (random <= 5) {
      return true;
    } else {
      return false;
    }
  }

  public static void walk(Player name, String region) {
    int random = (int) (Math.random() * 10);
    if (random <= 2) {
      System.out.println("Nothing has appeared");
      System.out.println("Walk again?");
      String response = "";
      response = in.nextLine().toLowerCase();
      while (response.equals("yes") == false && response.equals("no") == false) {
        if (response.equals("yes")) {
          walk(name, region);
        } else if (response.equals("no")) {
          System.out.println("Do you want to go to a gym or the nurse? (gym/nurse)");
          String gymOrNurse = "";
          gymOrNurse = in.nextLine().toLowerCase();
          while (gymOrNurse.equals("gym") == false && gymOrNurse.equals("nurse") == false) {
            if (response.equals("gym")) {
              if (player._numPokemon < 7) {
                System.out
                    .println("You need at least six pokemon to go to the gym. Do you want to talk to catch pokemon?");
                String yOrN = "";
                yOrN = in.nextLine().toLowerCase();
                while (yOrN.equals("yes") == false && yOrN.equals("no") == false) {
                  if (response.equals("yes")) {
                    walk(name, region);
                  } else if (response.equals("no")) {
                    System.out.println("Do you want to go to the nurse?");
                    String nurse = "";
                    nurse = in.nextLine().toLowerCase();
                    while (nurse.equals("yes") == false && nurse.equals("no") == false) {
                      if (response.equals("yes")) {
                        goToNurse(name, region);
                      } else if (response.equals("no")) {
                        System.out.println("You will have to catch pokemon.");
                        System.out.println("You walked");
                        walk(name, region);
                      } else {
                        System.out.println("input a valid response (yes/no)");
                        nurse = in.nextLine().toLowerCase();
                      }
                    }
                  } else {
                    System.out.println("input a valid response (yes/no)");
                    yOrN = in.nextLine().toLowerCase();
                    // while
                  }

                }
              } else {
                goToGym(region);
              }
            } else if (response.equals("nurse")) {
              goToNurse(name, region);
            } else {
              System.out.println("input a valid response");
              gymOrNurse = in.nextLine().toLowerCase();
              // while
            }
          }
        } else {
          System.out.println("input a valid response");
          response = in.nextLine().toLowerCase();
        }
      }
    } else if (random >= 3 && random <= 4) {
      // meet someone battle
      System.out.println("A fellow pokemon trainer has appeared. They challenge you to a pokemon battle.");
      System.out.println("Do you want to battle or runaway? (battle/runaway)");
      String runawayOr = "";
      runawayOr = in.nextLine().toLowerCase();
      while (runawayOr.equals("runaway") == false && runawayOr.equals("battle") == false) {
        if (runawayOr.equals("runaway")) {
          boolean run = runaway();
          if (run == false) {
            System.out.println("running away failed. You must engage in battle");
            int type = generateType();
            int level = generateLvl(name);
            Pokemon pok = generatePokemon(type);
            battle(name, pok, region);
          } else {
            System.out.println("You've sucessfullly runaway");
            System.out.println("You walked");
            // ask
          }
        } else if (runawayOr.equals("battle")) {
          System.out.println("You accept the challenge and engage in battle");
          int type = generateType();
          int level = generateLvl(name);
          Pokemon pok = generatePokemon(type);
          battle(name, pok, region);
        } else {
          System.out.println("input a valid response (runaway/battle)");
          runawayOr = in.nextLine().toLowerCase();
        }
      }

    } else if (random >= 5 && random <= 6) {
      // civilian
      Human civilian = new Human(generateGender(), 3, generateName());
      System.out.println("You have encountered a civilian");
      civilian.greet(name);
      System.out.println(civilian._name + " gives you a Berry and a Pokeball for your efforts!");
      Player._numBerries += 1;
      Player._numPokeball += 1;
      civilian.goodbye(name);
      // add extra talking functionality
    } else {
      System.out.println("A pokemon has appeared!");
      System.out.println("Would you like to battle or run away? (battle/runaway)");
      String encounterPokemon = "";
      encounterPokemon = in.nextLine().toLowerCase();
      while (encounterPokemon.equals("runaway") == false && encounterPokemon.equals("battle") == false) {
        if (encounterPokemon.equals("runaway")) {
          boolean run = runaway();
          if (run == false) {
            System.out.println("running away failed. You must engage in battle");
            int type = generateType();
            int level = generateLvl(name);
            Pokemon pok = generatePokemon(type);
            battle(name, pok, region);
          } else {
            System.out.println("You've sucessfully runaway");
            System.out.println("You walked");
            // ask them
          }
        } else if (encounterPokemon.equals("battle")) {
          System.out.println("You accept the challenge and engage in battle");
          int type = generateType();
          int level = generateLvl(name);
          Pokemon pok = generatePokemon(type);
          battle(name, pok, region);
        } else {
          System.out.println("input a valid response (runaway/battle)");
          String runawayOr = "";
          runawayOr = in.nextLine().toLowerCase();
        }
      }
    }
  }

  public static String generateMove(Pokemon name) {
    String[] fireMoves = new String[] { "ember", "bulk up", "restore" };
    String[] waterMoves = new String[] { "water gun", "rain dance", "rest" };
    String[] grassMoves = new String[] { "razor leaf", "safe guard", "rest" };
    int randMove = (int) (((Math.random()) * 10) - 8);
    if (name instanceof Fire) {
      return fireMoves[randMove];
    } else if (name instanceof Water) {
      return waterMoves[randMove];
    } else {
      return grassMoves[randMove];
    }
  }

  public boolean battle(Player name, Pokemon opponent, String region) {
    System.out.println("You begin your battle with " + opponent._name + "...");
    System.out.println("Here are the Stats of your Pokemon:");
    name.displayPokedex();
    System.out.println("Here are the Stats of your opponent's Pokemon:");
    opponent.display();
    while (opponent.isAlive()) {
      for (Pokemon p : name._pokedex) {
        while (p.isAlive()) {
          System.out.println("You take out " + p._name + "!");
          System.out.print("Choose a move...");
          p.displayMove();
          String answer = "";
          answer = in.nextLine().toLowerCase();
          while (!answer.equals("ember") && !answer.equals("bulk up") && !answer.equals("restore")
              && !answer.equals("water gun") && !answer.equals("rain dance") && !answer.equals("rest")
              && !answer.equals("razor leaf") && !answer.equals("safe guard")) {
            System.out.println("Input a valid move:");
            answer = in.nextLine().toLowerCase();
          }
          p.move(answer, opponent);
          p._exp = p._exp + 20;
          p.lvlUp();
          opponent.move(generateMove(opponent), p);
          System.out.println("Do you want to use a Berry? (yes/no)");
          String berry = "";
          berry = in.nextLine().toLowerCase();
          while (!berry.equals("yes") && !berry.equals("no")) {
            if (berry.equals("yes")) {
              if (Player._numBerries <= 0) {
                System.out.println("You cannot use a Berry.");
                System.out.println("You have no Berries left!");
              } else {
                Player._numBerries -= 1;
                p._hp += 20;
                // probably overrides
                System.out.println(p._name + "'s HP has been restored by 20!");
                System.out.println("Here is your inventory:");
                Player.displayInventory();
              }
            }
            if (!berry.equals("yes") && !berry.equals("no")) {
              System.out.println("Input a valid answer:");
              berry = in.nextLine();
            }
          }
        }
      }
      System.out.println("All of your Pokemon have fainted!");
      System.out.println("Your Pokemon are rushed to the Nurse...");
      goToNurse(name, region);
      return false;
    }
    return true;
  }

  public void goToNurse(Player name, String region) {
    System.out.println("You have arrived at the clinic.");
    System.out.println("The Nurse has restored all of your Pokemon's health.");
    for (Pokemon p : name._pokedex) {
      p._hp = p._lvl * 100;
    }
    name.displayPokedex();
    System.out.println("You went on a walk.");
    walk(name, region);
  }

  public void catchP(Player name, Pokemon pokName, String region) {
    int random = (int) ((Math.random() * 10));
    if (name._numPokeball <= 0) {
      System.out.println("You do not have enough pokeballs");
      System.out.println("You go on a walk");
      walk(name, region);
    } else {
      if (random <= 7) {
        System.out.println("Congratulations, you have successfullly caught a " + pokName._name);
        name.add(pokName);
        name._numPokemon = name._numPokemon + 1;
        name._numPokeball = name._numPokeball - 1;
        name.displayPokedex();
        name.displayInventory();
      } else {
        System.out.println("The pokemon got away");
        name._numPokeball = name._numPokeball - 1;
        name.displayInventory();
        System.out.println("You walk away");
        walk(name, region);
      }
    }
  }
  public void gotoGym(String region){
    if (region.equals("Eterna City")) {
      gymBattleGrass();
    } else if (region.equals("Pastria City")){
      gymBattleWater();
    } else {
      gymBattleFire();
    }
  }

  public void gymBattleFire(Player name, String region) {
    String answer = "";
    wait(1);
    System.out.println("You enter the gym and prepare to fight Flint.");
    wait(1);
    System.out.println("Do you wish to visit the Nurse before battling Flint?");
    answer = in.nextLine().toLowerCase();
    while (answer.equals("yes") == false && answer.equals("no") == false) {
      if (answer.equals("yes")) {
        System.out.println("You take a quick visit to the Nurse...");
        goToNurse(name, region);
      } else if (answer.equals("no")) {
        System.out.println("You enter the gym and prepare to battle Flint.");
        Pokemon infernape = new Fire("Infernape", 25, 3818);
        boolean firstBattle = battle(name, infernape, region);
        if (firstBattle == true) {
          System.out.println("Prepare to fight Flint's next Pokemon!");
          Pokemon rapidash = new Fire("Rapidash", 27, 2739);
          boolean secondBattle = battle(name, rapidash, region);
          if (secondBattle == true) {
            System.out.println("Congratulations! You have successfully defeated Flint!");
            System.out.println("You have earned the Fire Badge!");
          }
        }
      } else {
        System.out.println("Please input a valid response (yes/no):");
        answer = in.nextLine();
      }
    }
  }

  public void gymBattleWater(Player name, String region) {
    String answer = "";
    wait(1);
    System.out.println("You enter the gym and prepare to fight Crasher Wake.");
    wait(1);
    System.out.println("Do you wish to visit the Nurse before battling CrasherWake?");
    answer = in.nextLine().toLowerCase();
    while (answer.equals("yes") == false && answer.equals("no") == false) {
      if (answer.equals("yes")) {
        System.out.println("You take a quick visit to the Nurse...");
        goToNurse(name, region);
      } else if (answer.equals("no")) {
        System.out.println("You enter the gym and prepare to battle Crasher Wake.");
        Pokemon gyarados = new Water("Gyarados", 27, 2690);
        boolean firstBattle = battle(name, gyarados, region);
        if (firstBattle == true) {
          System.out.println("Prepare to fight Crasher Wake's next Pokemon!");
          Pokemon quagsire = new Water("Quagsire", 27, 2630);
          boolean secondBattle = battle(name, quagsire, region);
          if (secondBattle == true) {
            System.out.println("Prepare to fight Crasher Wake's next Pokemon");
            Pokemon floatzel = new Water("floatzel", 30, 2950);
            boolean thirdBattle = battle(name, floatzel, region);
            if (thirdBattle == true){
              System.out.println("Congratulations! You have successfully defeated Crasher Wake!");
              System.out.println("You have earned the Water Badge!");
          }
        }
      }
    } else {
        System.out.println("Please input a valid response (yes/no):");
        answer = in.nextLine();
    }
  }
}
    public void gymBattleGrass(Player name, String region) {
      String answer = "";
      wait(1);
      System.out.println("You enter the gym and prepare to fight Gardeniae.");
      wait(1);
      System.out.println("Do you wish to visit the Nurse before battling Gardenia?");
      answer = in.nextLine().toLowerCase();
      while (answer.equals("yes") == false && answer.equals("no") == false) {
        if (answer.equals("yes")) {
          System.out.println("You take a quick visit to the Nurse...");
          goToNurse(name, region);
        } else if (answer.equals("no")) {
          System.out.println("You enter the gym and prepare to battle Gardenia.");
          Pokemon cherubi = new Water("cherubi", 19, 1990);
          boolean firstBattle = battle(name, cherubi, region);
          if (firstBattle == true) {
            System.out.println("Prepare to fight Gardenia's next Pokemon!");
            Pokemon turtwig = new Water("turtwig", 27, 1930);
            boolean secondBattle = battle(name, turtwig, region);
            if (secondBattle == true) {
              System.out.println("Prepare to fight Gardenia's next Pokemon");
              Pokemon roserade = new Water("roserade",22, 2250);
              boolean thirdBattle = battle(name, roserade, region);
              if (thirdBattle == true){
                System.out.println("Congratulations! You have successfully defeated Gardenia!");
                System.out.println("You have earned the Water Badge!");
            }
          }
        }
      } else {
          System.out.println("Please input a valid response (yes/no):");
          answer = in.nextLine();
      }
    }
  }
  public static void gameSetup(){
    System.out.println("Welcome, Trainer, to Pokemon Shining Pearl!");
    wait(1);
    System.out.println("\nWhat is your name?");
    String name = "";
    name = in.nextLine();
    player._name = name;
    wait(1);
  }

  public static void chooseStarter(){
    wait(2);
    System.out.println("\nRING RING! Wake up " + player._name + "!"
        + " Your mom told you to go to Dr. Footstep's clinic to get your first starter Pokemon.");
    wait(2);
    System.out.println(
        "\nYou totally forgot. Today is your 10th birthday. You're finally old enough to become a Pokemon trainer!");
    wait(2);
    System.out.println("\nYou rush over to the pokemon clinic and luckily the line isn't long.");
    wait(2);
    System.out.print("\nA");
    wait(2);
    System.out.print(" few");
    wait(2);
    System.out.print(" minutes");
    wait(2);
    System.out.print(" later");
    wait(2);
    System.out.println("...");
    wait(3);
    System.out.println("\nIt's finally your turn!");
    // wake up, go to drs place to pick Pokemon
    wait(1);

    System.out.println("\nThere are three starter Pokemons: Chimchar, Piplup, and Turtwig.");
    wait(1);

    System.out.println("\nInput the pokemon that you want to know more about:");
    String pokemonOne = "";

    // POKEMON DESCRIPTIONS
    pokemonOne = in.nextLine().toLowerCase();
    if (pokemonOne.equals("chimchar")) {
      Fire chimchar = new Fire("Chimchar", 5, 40);
      wait(1);
      System.out.println("\nA Chimp Pokemon.");
      wait(1);
      System.out.println("With a flaming tail, Chimchar is skilled in Fire-type moves.");
      wait(1);
      System.out.println("Its light body affords it the ability to scale steep cliffs and live atop rocky mountains.");
      wait(1);
      System.out.println("Some say that the fiery tail is fueled by gas made in its stomach.");
      wait(1);
      System.out.println("Not even rain can put out the flames, but Chimchar always puts out the fire when asleep.");
      wait(1);
      System.out.println();
      chimchar.display();
    } else if (pokemonOne.equals("piplup")) {
      Pokemon piplup = new Water("Piplup", 5, 40);
      wait(1);
      System.out.println("\nA Penguin Pokémon.");
      wait(2);
      System.out.println(
          "It's one of the starter Pokemon received from Professor Rowan when the player departs from the Sinnoh region.");
      wait(2);
      System.out.println("It's a Water type, so it's strong versus Rock and Grounds.");
      wait(2);
      System.out.println("It's very cute but filled with pride--it hates to accept food from people.");
      wait(2);
      System.out.println();
      piplup.display();
    } else if (pokemonOne.equals("turtwig")) {
      Pokemon turtwig = new Grass("Turtwig", 5, 40);
      wait(1);
      System.out.println("\nA Tiny Leaf Pokemon.");
      wait(2);
      System.out.println("Despite its animal appearance, Turtwig actually has vegetation sprouting from its head.");
      wait(2);
      System.out.println("The shell on its back is made of soil and hardens when it drinks water.");
      wait(2);
      System.out.println("Much like a plant, Turtwig performs photosynthesis, absorbing sunlight and making oxygen.");
      wait(2);
      System.out.println(
          "It also relies heavily on water to keep its plant healthy and thus spends a lot of time near lakes.");
      wait(2);
      System.out.println();
      turtwig.display();
    } else {
      wait(1);
      System.out.println("\nThat's not exactly a Pokemon, but Dr. Footstep wants to show you Chimchar.");
      Pokemon chimchar = new Fire("Chimchar", 5, 40);
      wait(1);
      System.out.println("\nA Chimp Pokemon.");
      wait(1);
      System.out.println("With a flaming tail, Chimchar is skilled in Fire-type moves.");
      wait(1);
      System.out.println("Its light body affords it the ability to scale steep cliffs and live atop rocky mountains.");
      wait(1);
      System.out.println("Some say that the fiery tail is fueled by gas made in its stomach.");
      wait(1);
      System.out.println("Not even rain can put out the flames, but Chimchar always puts out the fire when asleep.");
      wait(1);
      System.out.println();
      chimchar.display();
    }

    wait(2);
    System.out.println("\nInput another pokemon that you want to know more about:");
    String pokemonTwo = "";

    pokemonTwo = in.nextLine().toLowerCase();
    if (pokemonTwo.equals("chimchar")) {
      Pokemon chimchar = new Fire("Chimchar", 5, 40);
      wait(1);
      System.out.println("\nA Chimp Pokemon.");
      wait(1);
      System.out.println("With a flaming tail, Chimchar is skilled in Fire-type moves.");
      wait(1);
      System.out.println("Its light body affords it the ability to scale steep cliffs and live atop rocky mountains.");
      wait(1);
      System.out.println("Some say that the fiery tail is fueled by gas made in its stomach.");
      wait(1);
      System.out.println("Not even rain can put out the flames, but Chimchar always puts out the fire when asleep.");
      wait(1);
      System.out.println();
      chimchar.display();
    } else if (pokemonTwo.equals("piplup")) {
      Pokemon piplup = new Water("Piplup", 5, 40);
      wait(1);
      System.out.println("\nA Penguin Pokémon.");
      wait(1);
      System.out.println(
          "It's one of the starter Pokemon received from Professor Rowan when the player departs from the Sinnoh region.");
      wait(1);
      System.out.println("It's a Water type, so it's strong versus Rock and Grounds.");
      wait(1);
      System.out.println("It's very cute but filled with pride--it hates to accept food from people.");
      wait(1);
      System.out.println();
      piplup.display();
    } else if (pokemonTwo.equals("turtwig")) {
      Pokemon turtwig = new Grass("Turtwig", 5, 40);
      wait(1);
      System.out.println("\nA Tiny Leaf Pokemon.");
      wait(1);
      System.out.println("Despite its animal appearance, Turtwig actually has vegetation sprouting from its head.");
      wait(1);
      System.out.println("The shell on its back is made of soil and hardens when it drinks water.");
      wait(1);
      System.out.println("Much like a plant, Turtwig performs photosynthesis, absorbing sunlight and making oxygen.");
      wait(1);
      System.out.println(
          "It also relies heavily on water to keep its plant healthy and thus spends a lot of time near lakes.");
      wait(1);
      System.out.println();
      turtwig.display();
    } else {
      wait(1);
      System.out.println("\nThat's not exactly a Pokemon, but Dr. Footstep wants to show you Piplup.");
      Pokemon piplup = new Water("Piplup", 5, 40);
      wait(1);
      System.out.println("A Penguin Pokémon.");
      wait(1);
      System.out.println(
          "It's one of the starter Pokemon received from Professor Rowan when the player departs from the Sinnoh region.");
      wait(1);
      System.out.println("It's a Water type, so it's strong versus Rock and Grounds.");
      wait(1);
      System.out.println("It's very cute but filled with pride--it hates to accept food from people.");
      wait(1);
      System.out.println();
      piplup.display();
    }

    wait(2);
    System.out.println("\nInput the last pokemon:");
    String pokemonThree = "";

    pokemonThree = in.nextLine().toLowerCase();
    if (pokemonThree.equals("chimchar")) {
      Pokemon chimchar = new Fire("Chimchar", 5, 40);
      wait(1);
      System.out.println("\nA Chimp Pokemon.");
      wait(1);
      System.out.println("With a flaming tail, Chimchar is skilled in Fire-type moves.");
      wait(1);
      System.out.println("Its light body affords it the ability to scale steep cliffs and live atop rocky mountains.");
      wait(1);
      System.out.println("Some say that the fiery tail is fueled by gas made in its stomach.");
      wait(1);
      System.out.println("Not even rain can put out the flames, but Chimchar always puts out the fire when asleep.");
      wait(1);
      System.out.println();
      chimchar.display();
    } else if (pokemonThree.equals("piplup")) {
      Pokemon piplup = new Water("Piplup", 5, 40);
      wait(1);
      System.out.println("\nA Penguin Pokémon.");
      wait(1);
      System.out.println(
          "It's one of the starter Pokemon received from Professor Rowan when the player departs from the Sinnoh region.");
      wait(1);
      System.out.println("It's a Water type, so it's strong versus Rock and Grounds.");
      wait(1);
      System.out.println("It's very cute but filled with pride--it hates to accept food from people.");
      wait(1);
      System.out.println();
      piplup.display();
    } else if (pokemonThree.equals("turtwig")) {
      Pokemon turtwig = new Grass("Turtwig", 5, 40);
      wait(1);
      System.out.println("\nA Tiny Leaf Pokemon.");
      wait(1);
      System.out.println("Despite its animal appearance, Turtwig actually has vegetation sprouting from its head.");
      wait(1);
      System.out.println("The shell on its back is made of soil and hardens when it drinks water.");
      wait(1);
      System.out.println("Much like a plant, Turtwig performs photosynthesis, absorbing sunlight and making oxygen.");
      wait(1);
      System.out.println(
          "It also relies heavily on water to keep its plant healthy and thus spends a lot of time near lakes.");
      wait(1);
      System.out.println();
      turtwig.display();
    } else {
      wait(1);
      System.out.println("\nThat's not exactly a Pokemon, but Dr. Footstep wants to show you Turtwig.");
      Pokemon turtwig = new Grass("Turtwig", 5, 40);
      wait(1);
      System.out.println("\nA Tiny Leaf Pokemon.");
      wait(1);
      System.out.println("Despite its animal appearance, Turtwig actually has vegetation sprouting from its head.");
      wait(1);
      System.out.println("The shell on its back is made of soil and hardens when it drinks water.");
      wait(1);
      System.out.println("Much like a plant, Turtwig performs photosynthesis, absorbing sunlight and making oxygen.");
      wait(1);
      System.out.println(
          "It also relies heavily on water to keep its plant healthy and thus spends a lot of time near lakes.");
      wait(1);
      System.out.println();
      turtwig.display();
    }
    // Instance of Pokemon

    // CHOOSING POKEMON

    wait(1);
    System.out.println("\nWhich starter Pokemon do you want?");
    String response = "";

    response = in.nextLine().toLowerCase();
    if (response.equals("chimchar")) {
      Fire starter = new Fire("Chimchar", 5, 40);
      Player.add(starter);
      wait(1);
      System.out.println("\nCongrats, you got your first Pokemon! It's a Chimchar!");
    } else if (response.equals("piplup")) {
      Water starter = new Water("Piplup", 5, 40);
      Player.add(starter);
      wait(1);
      System.out.println("\nCongrats, you got your first Pokemon! It's a Piplup!");
    } else if (response.equals("turtwig")) {
      Grass starter = new Grass("Turtwig", 5, 40);
      Player.add(starter);
      wait(1);
      System.out.println("\nCongrats, you got your first Pokemon! It's a Turtwig!");
    } else if (!response.equals("chimchar") && !response.equals("piplup") && !response.equals("turtwig")) {
      int random = (int) ((Math.random() * 10) - 8);
      if (random == 1) {
        Fire starter = new Fire("Chimchar", 5, 40);
        Player.add(starter);
        wait(1);
        System.out.println("\nYou responded too late! The only Pokemon left is Chimchar!");
      } else if (random == 2) {
        Water starter = new Water("Piplup", 5, 40);
        Player.add(starter);
        wait(1);
        System.out.println("\nYou responded too late! The only Pokemon left is Piplup!");
      } else if (random == 3) {
        Grass starter = new Grass("Turtwig", 5, 40);
        Player.add(starter);
        wait(1);
        System.out.println("\nYou responded too late! The only Pokemon left is Turtwig!");
      }
    }

    Player._numPokemon += 1;
    wait(1);
    System.out.println("\nYou also receive 5 Pokeballs and 5 berries from Dr. Footstep.");
    Player._numPokeball += 5;
    Player._numBerries += 5;
    Player.displayInventory();
    wait(1);
    System.out.println("\nYou thank Dr. Footstep and walk out of the clinic.");
  }

  Woo game = new Woo();

  public static void main(String[] args) {
    gameSetup();
    chooseStarter();
    String[] regions = new String[] {"Eterna City", "Pastoria City", "Sunyshore City"};
    for(String n : regions){
      System.out.println("\nYou go on a walk");
      walk(player, n);
    //response = in.nextLine().toLowerCase();
    }
  }
}
