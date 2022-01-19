import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.io.*;
import java.util.*;

public class Woo{


  public static void wait(int s) {
    try {
      Thread.sleep(s * 1000);
    }
    catch (InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }

  public static void walk(){
    int random = (int)((Math.random() * 10)
    if (random <= 4){
      System.out.println("Nothing has appeared");
      System.out.println("Walk again?");
      String response = "";
      response = in.nextLine().toLowerCase();
      if (response.equals("yes")){
        walk();
      } else if (response.equals("no")){
        System.out.println("Do you want to go to a gym or the nurse? (gym/nurse)");
        String reponse = "";
        response = in.nextLine().toLowerCase();
        if (response.equals("gym")){
            if (player._numPokemon < 7){
              System.out.println("You need at least six pokemon to go to the gym. Do you want to talk to catch pokemon?");
              String response = "";
              response = in.nextLine().toLowerCase();
              if (response.equals("yes")){
                walk();
              } else if (response.equals("no")){
                System.out.println("Do you want to go to the nurse?");
                String response = "";
                response = in.nextline().toLowerCase();
                if (response.equals("yes")){
                  gotoNurse();
                } else if (response.equals("no")){
                  System.out.println("You will have to catch pokemon.");
                  System.out.println("You walked");
                  walk();
                } else {
                  System.out.println("input a valid response (yes/no)");
                  //while
                }
              } else {
                System.out.println("input a valid response (yes/no)");
                //while
              }
            } else{
              goToGym();
            }
      } else if response.equals("nurse"){
        goToNurse();
      } else {
        System.out.println("input a valid response");
        //while

  public static void battle() {
    System.out.println();
  }

  public static void gymBattle(String region, String gymLeader) {
    String answer = "";
    wait(1);
    System.out.println("You enter the gym and prepare to fight " + gymLeader ".");
    wait(1);
    System.out.println("Do you wish to visit the Nurse before battling " + gymLeader "?");
    answer = in.nextLine();
    if (answer.equals("yes") || answer.equals("Yes")) {
      System.out.println("You take a quick visit to the Nurse...");
    }
    else if (answer.equals("yes") || answer.equals("Yes")) {
      System.out.println("Are you ready to fight " + gymLeader + "?");
    }
  }

  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      Player player = new Player();

      wait(1);
      System.out.println("Welcome, Trainer, to Pokemon Shining Pearl!");
      wait(1);
      System.out.println("\nWhat is your name?");
      String name = "";
      name = in.nextLine();
      player._name = name;
      wait(1);
      System.out.println("\nHello " + name + ", are you a boy or a girl?");
      String gender = "";
      boolean isGender = false;
      gender = in.nextLine();
      while (isGender == false) {
      if (gender.equals("girl") || gender.equals("Girl")) {
          player._gender = true;
          isGender = true;
      }
      else if (gender.equals("boy") || gender.equals("Boy")) {
          player._gender = false;
          isGender = true;
      } else {
          System.out.println("\nPlease input a valid gender:");
          gender = in.nextLine();
        }
      }
      wait(2);
      System.out.println("\nRING RING! Wake up " + name + "!" + " Your mom told you to go to Dr. Footstep's clinic to get your first starter Pokemon.");
      wait(2);
      System.out.println("\nYou totally forgot. Today is your 10th birthday. You're finally old enough to become a Pokemon trainer!");
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
      //wake up, go to drs place to pick Pokemon
      wait(1);

      System.out.println("\nThere are three starter Pokemons: Chimchar, Piplup, and Turtwig.");
      wait(1);

      System.out.println("\nInput the pokemon that you want to know more about:");
      String pokemonOne = "";


      // POKEMON DESCRIPTIONS
      pokemonOne = in.nextLine();
      if (pokemonOne.equals("Chimchar") || pokemonOne.equals("chimchar")) {
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
      }
      else if (pokemonOne.equals("Piplup") || pokemonOne.equals("piplup")) {
        Water piplup = new Water("Piplup", 5, 40);
        wait(1);
        System.out.println("\nA Penguin Pokémon.");
        wait(2);
        System.out.println("It's one of the starter Pokemon received from Professor Rowan when the player departs from the Sinnoh region.");
        wait(2);
        System.out.println("It's a Water type, so it's strong versus Rock and Grounds.");
        wait(2);
        System.out.println("It's very cute but filled with pride--it hates to accept food from people.");
        wait(2);
        System.out.println();
        piplup.display();
      }
      else if (pokemonOne.equals("Turtwig") || pokemonOne.equals("turtwig")) {
        Grass turtwig = new Grass("Turtwig", 5, 40);
        wait(1);
        System.out.println("\nA Tiny Leaf Pokemon.");
        wait(2);
        System.out.println("Despite its animal appearance, Turtwig actually has vegetation sprouting from its head.");
        wait(2);
        System.out.println("The shell on its back is made of soil and hardens when it drinks water.");
        wait(2);
        System.out.println("Much like a plant, Turtwig performs photosynthesis, absorbing sunlight and making oxygen.");
        wait(2);
        System.out.println("It also relies heavily on water to keep its plant healthy and thus spends a lot of time near lakes.");
        wait(2);
        System.out.println();
        turtwig.display();
      }
      else {
        wait(1);
        System.out.println("\nThat's not exactly a Pokemon, but Dr. Footstep wants to show you Chimchar.");
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
      }

      wait(2);
      System.out.println("\nInput another pokemon that you want to know more about:");
      String pokemonTwo = "";

      pokemonTwo = in.nextLine();
      if (pokemonTwo.equals("Chimchar") || pokemonTwo.equals("chimchar")) {
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
      }
      else if (pokemonTwo.equals("Piplup") || pokemonTwo.equals("piplup")) {
        Water piplup = new Water("Piplup", 5, 40);
        wait(1);
        System.out.println("\nA Penguin Pokémon.");
        wait(1);
        System.out.println("It's one of the starter Pokemon received from Professor Rowan when the player departs from the Sinnoh region.");
        wait(1);
        System.out.println("It's a Water type, so it's strong versus Rock and Grounds.");
        wait(1);
        System.out.println("It's very cute but filled with pride--it hates to accept food from people.");
        wait(1);
        System.out.println();
        piplup.display();
      }
        else if (pokemonTwo.equals("Turtwig") || pokemonTwo.equals("turtwig")) {
        Grass turtwig = new Grass("Turtwig", 5, 40);
        wait(1);
        System.out.println("\nA Tiny Leaf Pokemon.");
        wait(1);
        System.out.println("Despite its animal appearance, Turtwig actually has vegetation sprouting from its head.");
        wait(1);
        System.out.println("The shell on its back is made of soil and hardens when it drinks water.");
        wait(1);
        System.out.println("Much like a plant, Turtwig performs photosynthesis, absorbing sunlight and making oxygen.");
        wait(1);
        System.out.println("It also relies heavily on water to keep its plant healthy and thus spends a lot of time near lakes.");
        wait(1);
        System.out.println();
        turtwig.display();
      }
      else {
        wait(1);
        System.out.println("\nThat's not exactly a Pokemon, but Dr. Footstep wants to show you Piplup.");
        Water piplup = new Water("Piplup", 5, 40);
        wait(1);
        System.out.println("A Penguin Pokémon.");
        wait(1);
        System.out.println("It's one of the starter Pokemon received from Professor Rowan when the player departs from the Sinnoh region.");
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

      pokemonThree = in.nextLine();
      if (pokemonThree.equals("Chimchar") || pokemonThree.equals("chimchar")) {
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
      }
      else if (pokemonThree.equals("Piplup") || pokemonThree.equals("piplup")) {
        Water piplup = new Water("Piplup", 5, 40);
        wait(1);
        System.out.println("\nA Penguin Pokémon.");
        wait(1);
        System.out.println("It's one of the starter Pokemon received from Professor Rowan when the player departs from the Sinnoh region.");
        wait(1);
        System.out.println("It's a Water type, so it's strong versus Rock and Grounds.");
        wait(1);
        System.out.println("It's very cute but filled with pride--it hates to accept food from people.");
        wait(1);
        System.out.println();
        piplup.display();
      }
      else if (pokemonThree.equals("Turtwig") || pokemonThree.equals("turtwig")) {
        Grass turtwig = new Grass("Turtwig", 5, 40);
        wait(1);
        System.out.println("\nA Tiny Leaf Pokemon.");
        wait(1);
        System.out.println("Despite its animal appearance, Turtwig actually has vegetation sprouting from its head.");
        wait(1);
        System.out.println("The shell on its back is made of soil and hardens when it drinks water.");
        wait(1);
        System.out.println("Much like a plant, Turtwig performs photosynthesis, absorbing sunlight and making oxygen.");
        wait(1);
        System.out.println("It also relies heavily on water to keep its plant healthy and thus spends a lot of time near lakes.");
        wait(1);
        System.out.println();
        turtwig.display();
      }else{
        wait(1);
        System.out.println("\nThat's not exactly a Pokemon, but Dr. Footstep wants to show you Turtwig.");
        Grass turtwig = new Grass("Turtwig", 5, 40);
        wait(1);
        System.out.println("\nA Tiny Leaf Pokemon.");
        wait(1);
        System.out.println("Despite its animal appearance, Turtwig actually has vegetation sprouting from its head.");
        wait(1);
        System.out.println("The shell on its back is made of soil and hardens when it drinks water.");
        wait(1);
        System.out.println("Much like a plant, Turtwig performs photosynthesis, absorbing sunlight and making oxygen.");
        wait(1);
        System.out.println("It also relies heavily on water to keep its plant healthy and thus spends a lot of time near lakes.");
        wait(1);
        System.out.println();
        turtwig.display();
      }
      // Instance of Pokemon


      // CHOOSING POKEMON
      wait(1);
      System.out.println("\nWhich starter Pokemon do you want?");
      String response = "";

      response = in.nextLine();
      if(response.equals("Chimchar") || response.equals("chimchar")) {
        Fire starter = new Fire("Chimchar", 5, 40);
        wait(1);
        System.out.println("\nCongrats, you got your first Pokemon! It's a Chimchar!");
      }
      else if(response.equals("Piplup") || response.equals("piplup")) {
        Water starter = new Water("Piplup", 5, 40);
        wait(1);
        System.out.println("\nCongrats, you got your first Pokemon! It's a Piplup!");
      }
      else if(response.equals("Turtwig") || response.equals("turtwig")) {
        Grass starter = new Grass("Turtwig", 5, 40);
        wait(1);
        System.out.println("\nCongrats, you got your first Pokemon! It's a Turtwig!");
      }
      else {
        int random = (int)((Math.random() * 10) - 8);
        if(random == 1) {
          Fire starter = new Fire("Chimchar", 5, 40);
          wait(1);
          System.out.println("\nYou responded too late! The only Pokemon left is Chimchar!");
        }
        else if(random == 2) {
          Water starter = new Water("Piplup", 5, 40);
          wait(1);
          System.out.println("\nYou responded too late! The only Pokemon left is Piplup!");
        }
        else if(random == 3) {
          Grass starter = new Grass("Turtwig", 5, 40);
          wait(1);
          System.out.println("\nYou responded too late! The only Pokemon left is Turtwig!");
        }
      }

      Player._numPokemon += 1;
      wait(1);
      System.out.println("\nYou also receive 5 Pokeballs and 5 berries from Dr. Footstep.");
      Player._numPokeball += 5;
      Player._numBerries += 5;
      wait(1);
      System.out.println("\nYou thank Dr. Footstep and walk out of the clinic.");


      // CATCH OR BATTLE
      wait(1);
      System.out.println("\nDo you want to catch Pokemon or attempt battling a Gym leader? (catch/battle)");
      response = in.nextLine();
      if (response.equals("Battle")|| response.equals("battle")) {
        if (player._numPokemon < 7){
          wait(1);
          System.out.println("\nYou need at least six pokemon to fight a gym.");
          wait(1);
          System.out.println("\nYou have been transported to the forest to catch Pokemon.");
          wait(1);
          System.out.println("\nDo you want to walk? (yes/no)");
          response = in.nextLine();
          if (response.equals("yes") || response.equals("Yes")) {
            walk();
          }
          else {
            wait(1);
            System.out.println("You hesitate a bit, but still decide to venture deeper.");
            walk();
          }
        }
        if (player._numPokemon >= 6) {
          wait(1);
          System.out.println("\nYimport java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.io.*;
import java.util.*;

public class Woo{


  public static void wait(int s) {
    try {
      Thread.sleep(s * 1000);
    }
    catch (InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }

  public static void walk() {
    int random = (int)(Math.random() * 10);
    if (random <= 6) {
      wait(1);
      System.out.println("\nA wild pokemon has appeared!");
      battle();
    }
    if (random >= 7 && random <= 8) {
      wait(1);
      System.out.println("\nA Pokemon Trainer appeared out of the bushes!");
      wait(1);
      System.out.println("\nDo you wish to engage in a Pokemon battle against them?");
    }
    if (random >= 9 && random <= 10) {
      wait(1);
      System.out.println("\nSomeone tapped you on the shoulder!");
    }
  }

  public static void battle() {
    System.out.println();
  }

  public static void gymBattle(String region, String gymLeader) {
    String answer = "";
    wait(1);
    System.out.println("You enter the gym and prepare to fight " + gymLeader ".");
    wait(1);
    System.out.println("Do you wish to visit the Nurse before battling " + gymLeader "?");
    answer = in.nextLine();
    if (answer.equals("yes") || answer.equals("Yes")) {
      System.out.println("You take a quick visit to the Nurse...");
    }
    else if (answer.equals("yes") || answer.equals("Yes")) {
      System.out.println("Are you ready to fight " + gymLeader + "?");
    }
  }

  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      Player player = new Player();

      wait(1);
      System.out.println("Welcome, Trainer, to Pokemon Shining Pearl!");
      wait(1);
      System.out.println("\nWhat is your name?");
      String name = "";
      name = in.nextLine();
      player._name = name;
      wait(1);
      System.out.println("\nHello " + name + ", are you a boy or a girl?");
      String gender = "";
      boolean isGender = false;
      gender = in.nextLine();
      while (isGender == false) {
      if (gender.equals("girl") || gender.equals("Girl")) {
          player._gender = true;
          isGender = true;
      }
      else if (gender.equals("boy") || gender.equals("Boy")) {
          player._gender = false;
          isGender = true;
      } else {
          System.out.println("\nPlease input a valid gender:");
          gender = in.nextLine();
        }
      }
      wait(2);
      System.out.println("\nRING RING! Wake up " + name + "!" + " Your mom told you to go to Dr. Footstep's clinic to get your first starter Pokemon.");
      wait(2);
      System.out.println("\nYou totally forgot. Today is your 10th birthday. You're finally old enough to become a Pokemon trainer!");
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
      //wake up, go to drs place to pick Pokemon
      wait(1);

      System.out.println("\nThere are three starter Pokemons: Chimchar, Piplup, and Turtwig.");
      wait(1);

      System.out.println("\nInput the pokemon that you want to know more about:");
      String pokemonOne = "";


      // POKEMON DESCRIPTIONS
      pokemonOne = in.nextLine();
      if (pokemonOne.equals("Chimchar") || pokemonOne.equals("chimchar")) {
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
      }
      else if (pokemonOne.equals("Piplup") || pokemonOne.equals("piplup")) {
        Water piplup = new Water("Piplup", 5, 40);
        wait(1);
        System.out.println("\nA Penguin Pokémon.");
        wait(2);
        System.out.println("It's one of the starter Pokemon received from Professor Rowan when the player departs from the Sinnoh region.");
        wait(2);
        System.out.println("It's a Water type, so it's strong versus Rock and Grounds.");
        wait(2);
        System.out.println("It's very cute but filled with pride--it hates to accept food from people.");
        wait(2);
        System.out.println();
        piplup.display();
      }
      else if (pokemonOne.equals("Turtwig") || pokemonOne.equals("turtwig")) {
        Grass turtwig = new Grass("Turtwig", 5, 40);
        wait(1);
        System.out.println("\nA Tiny Leaf Pokemon.");
        wait(2);
        System.out.println("Despite its animal appearance, Turtwig actually has vegetation sprouting from its head.");
        wait(2);
        System.out.println("The shell on its back is made of soil and hardens when it drinks water.");
        wait(2);
        System.out.println("Much like a plant, Turtwig performs photosynthesis, absorbing sunlight and making oxygen.");
        wait(2);
        System.out.println("It also relies heavily on water to keep its plant healthy and thus spends a lot of time near lakes.");
        wait(2);
        System.out.println();
        turtwig.display();
      }
      else {
        wait(1);
        System.out.println("\nThat's not exactly a Pokemon, but Dr. Footstep wants to show you Chimchar.");
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
      }

      wait(2);
      System.out.println("\nInput another pokemon that you want to know more about:");
      String pokemonTwo = "";

      pokemonTwo = in.nextLine();
      if (pokemonTwo.equals("Chimchar") || pokemonTwo.equals("chimchar")) {
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
      }
      else if (pokemonTwo.equals("Piplup") || pokemonTwo.equals("piplup")) {
        Water piplup = new Water("Piplup", 5, 40);
        wait(1);
        System.out.println("\nA Penguin Pokémon.");
        wait(1);
        System.out.println("It's one of the starter Pokemon received from Professor Rowan when the player departs from the Sinnoh region.");
        wait(1);
        System.out.println("It's a Water type, so it's strong versus Rock and Grounds.");
        wait(1);
        System.out.println("It's very cute but filled with pride--it hates to accept food from people.");
        wait(1);
        System.out.println();
        piplup.display();
      }
        else if (pokemonTwo.equals("Turtwig") || pokemonTwo.equals("turtwig")) {
        Grass turtwig = new Grass("Turtwig", 5, 40);
        wait(1);
        System.out.println("\nA Tiny Leaf Pokemon.");
        wait(1);
        System.out.println("Despite its animal appearance, Turtwig actually has vegetation sprouting from its head.");
        wait(1);
        System.out.println("The shell on its back is made of soil and hardens when it drinks water.");
        wait(1);
        System.out.println("Much like a plant, Turtwig performs photosynthesis, absorbing sunlight and making oxygen.");
        wait(1);
        System.out.println("It also relies heavily on water to keep its plant healthy and thus spends a lot of time near lakes.");
        wait(1);
        System.out.println();
        turtwig.display();
      }
      else {
        wait(1);
        System.out.println("\nThat's not exactly a Pokemon, but Dr. Footstep wants to show you Piplup.");
        Water piplup = new Water("Piplup", 5, 40);
        wait(1);
        System.out.println("A Penguin Pokémon.");
        wait(1);
        System.out.println("It's one of the starter Pokemon received from Professor Rowan when the player departs from the Sinnoh region.");
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

      pokemonThree = in.nextLine();
      if (pokemonThree.equals("Chimchar") || pokemonThree.equals("chimchar")) {
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
      }
      else if (pokemonThree.equals("Piplup") || pokemonThree.equals("piplup")) {
        Water piplup = new Water("Piplup", 5, 40);
        wait(1);
        System.out.println("\nA Penguin Pokémon.");
        wait(1);
        System.out.println("It's one of the starter Pokemon received from Professor Rowan when the player departs from the Sinnoh region.");
        wait(1);
        System.out.println("It's a Water type, so it's strong versus Rock and Grounds.");
        wait(1);
        System.out.println("It's very cute but filled with pride--it hates to accept food from people.");
        wait(1);
        System.out.println();
        piplup.display();
      }
      else if (pokemonThree.equals("Turtwig") || pokemonThree.equals("turtwig")) {
        Grass turtwig = new Grass("Turtwig", 5, 40);
        wait(1);
        System.out.println("\nA Tiny Leaf Pokemon.");
        wait(1);
        System.out.println("Despite its animal appearance, Turtwig actually has vegetation sprouting from its head.");
        wait(1);
        System.out.println("The shell on its back is made of soil and hardens when it drinks water.");
        wait(1);
        System.out.println("Much like a plant, Turtwig performs photosynthesis, absorbing sunlight and making oxygen.");
        wait(1);
        System.out.println("It also relies heavily on water to keep its plant healthy and thus spends a lot of time near lakes.");
        wait(1);
        System.out.println();
        turtwig.display();
      }else{
        wait(1);
        System.out.println("\nThat's not exactly a Pokemon, but Dr. Footstep wants to show you Turtwig.");
        Grass turtwig = new Grass("Turtwig", 5, 40);
        wait(1);
        System.out.println("\nA Tiny Leaf Pokemon.");
        wait(1);
        System.out.println("Despite its animal appearance, Turtwig actually has vegetation sprouting from its head.");
        wait(1);
        System.out.println("The shell on its back is made of soil and hardens when it drinks water.");
        wait(1);
        System.out.println("Much like a plant, Turtwig performs photosynthesis, absorbing sunlight and making oxygen.");
        wait(1);
        System.out.println("It also relies heavily on water to keep its plant healthy and thus spends a lot of time near lakes.");
        wait(1);
        System.out.println();
        turtwig.display();
      }
      // Instance of Pokemon


      // CHOOSING POKEMON
      wait(1);
      System.out.println("\nWhich starter Pokemon do you want?");
      String response = "";

      response = in.nextLine();
      if(response.equals("Chimchar") || response.equals("chimchar")) {
        Fire starter = new Fire("Chimchar", 5, 40);
        wait(1);
        System.out.println("\nCongrats, you got your first Pokemon! It's a Chimchar!");
      }
      else if(response.equals("Piplup") || response.equals("piplup")) {
        Water starter = new Water("Piplup", 5, 40);
        wait(1);
        System.out.println("\nCongrats, you got your first Pokemon! It's a Piplup!");
      }
      else if(response.equals("Turtwig") || response.equals("turtwig")) {
        Grass starter = new Grass("Turtwig", 5, 40);
        wait(1);
        System.out.println("\nCongrats, you got your first Pokemon! It's a Turtwig!");
      }
      else {
        int random = (int)((Math.random() * 10) - 8);
        if(random == 1) {
          Fire starter = new Fire("Chimchar", 5, 40);
          wait(1);
          System.out.println("\nYou responded too late! The only Pokemon left is Chimchar!");
        }
        else if(random == 2) {
          Water starter = new Water("Piplup", 5, 40);
          wait(1);
          System.out.println("\nYou responded too late! The only Pokemon left is Piplup!");
        }
        else if(random == 3) {
          Grass starter = new Grass("Turtwig", 5, 40);
          wait(1);
          System.out.println("\nYou responded too late! The only Pokemon left is Turtwig!");
        }
      }

      Player._numPokemon += 1;
      wait(1);
      System.out.println("\nYou also receive 5 Pokeballs and 5 berries from Dr. Footstep.");
      Player._numPokeball += 5;
      Player._numBerries += 5;
      wait(1);
      System.out.println("\nYou thank Dr. Footstep and walk out of the clinic.");


      // CATCH OR BATTLE
      wait(1);
      System.out.println("\nDo you want to catch Pokemon or attempt battling a Gym leader? (catch/battle)");
      response = in.nextLine();
      if (response.equals("Battle")|| response.equals("battle")) {
        if (player._numPokemon < 7){
          wait(1);
          System.out.println("\nYou need at least six pokemon to fight a gym.");
          wait(1);
          System.out.println("\nYou have been transported to the forest to catch Pokemon.");
          wait(1);
          System.out.println("\nDo you want to walk? (yes/no)");
          response = in.nextLine();
          if (response.equals("yes") || response.equals("Yes")) {
            walk();
          }
          else {
            wait(1);
            System.out.println("You hesitate a bit, but still decide to venture deeper.");
            walk();
          }
        }
        if (player._numPokemon >= 6) {
          wait(1);
          System.out.println("\nYou think that you're ready to battle the Sinnoh region's Gym Leader.");
          wait(1);
          System.out.println("\nYou walk to the gym...");
          gymBattle("Sinnoh", "Gardenia");
        }
            //if a pokemon appears, ask Battl
            //if battle, after battle, ask if they want to cont catching, go to th enurse, or while loop until gymm leader defeated(gym leader)
            //wheher the gym leader is defeated is METHODS
            //battle METHODS
            //catch METHODS
            //displayInventory
            //go to nurse

      }
      //method for capitalization
      // if gym leader, check if you have 6 pokemon in pokedex, if not say you need 6 pokemon (dont ask question again)
      // if catch pokemon, prompts you to walk (say yes/no)
      // random num generated based on whether you meet pokemon
      // random probability to catch pokemon
      // when 6 pokemon, ask question above again
      // if go to gym, battle gym leader
      // if lose, back to grassy area, prompted to walk
      // everytime new pokemon is catched, question above is asked again
      // if win, congrats for badge, go to different region
      // add story after each gym battle
      // if pokemon die, transported to clinic to heal pokemon, back to grassy area
      // everytime you finish battle, ask if you wanna go to clinic

            //if a pokemon appears, ask Battl
            //if battle, after battle, ask if they want to cont catching, go to th enurse, or while loop until gymm leader defeated(gym leader)
            //wheher the gym leader is defeated is METHODS
            //battle METHODS
            //catch METHODS
            //displayInventory
            //go to nurse

    }
      //method for capitalization
      // if gym leader, check if you have 6 pokemon in pokedex, if not say you need 6 pokemon (dont ask question again)
      // if catch pokemon, prompts you to walk (say yes/no)
      // random num generated based on whether you meet pokemon
      // random probability to catch pokemon
      // when 6 pokemon, ask question above again
      // if go to gym, battle gym leader
      // if lose, back to grassy area, prompted to walk
      // everytime new pokemon is catched, question above is asked again
      // if win, congrats for badge, go to different region
      // add story after each gym battle
      // if pokemon die, transported to clinic to heal pokemon, back to grassy area
      // everytime you finish battle, ask if you wanna go to clinic

}
