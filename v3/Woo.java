import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.io.*;
import java.util.*;

public class Woo{


  public static void wait(int s) {
    try {
      Thread.sleep(s*1000);
    }
    catch (InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }

  public static void walk(){
    int random = (int)((Math.random() * 10)
    if (random <= 4){
      System.out.println("A wild pokemon has appeared!");
    }
    if (random > 5)
  }

  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      Player player = new Player();

      System.out.println("Welcome trainer to Pokemon Shining Pearl!");

      System.out.println("\nWhat is your name?");
      String name = "";
        name = in.nextLine();
        player._name = name;

      System.out.println("Hello " + name + ", are you a boy or a girl?" );
      String gender = "";
      boolean isGender = false;
      gender = in.nextLine();
      while (isGender == false) {
      if (gender.equals("girl") || gender.equals("Girl")){
          player._gender = true;
          isGender = true;
      }
      else if (gender.equals("boy") || gender.equals("Boy")){
          player._gender = false;
          isGender = true;
      } else{
          System.out.println("Please input a valid gender");
          gender = in.nextLine();
        }
      }
/**
      System.put another pokemon out.println("\n" + "**RING RING**" + "wake up " + name + "!" + " Make sure you get to Dr. Footstep's clinic to get your first starter pokemon mom said.");
      wait(1);
      System.out.println("You totally forgot. Today is your 10th birthday. You are finally old enough to become a Pokemon trainer");
      wait(1);
      System.out.println("You rush over to the pokemon clinic and luckly the line isn't long.");
      wait(1);
      System.out.println("A");
      wait(2);
      System.out.println("few");
      wait(2);
      System.out.println("minutes");
      wait(2);
      System.out.println("later");
      wait(2);
      System.out.println("...");
      wait(3);
      System.out.println("Its finally your turn!");
      //wake up, go to drs place to pick Pokemon
      wait(1);
**/
      System.out.println("There are three starter Pokemons: Chimchar, Piplup, Turtwig");
      wait(1);

      System.out.println("Input the pokemon that you want to know more about:");
      String pokemonOne = "";

      pokemonOne = in.nextLine();
      if (pokemonOne.equals("Chimchar") || pokemonOne.equals("chimchar")) {
        Fire chimchar = new Fire(5, 40);
        wait(1);
        System.out.println("A Chimp Pokemon.");
        wait(1);
        System.out.println("With a flaming tail, Chimchar is skilled in Fire-type moves.");
        wait(1);
        System.out.println("Its light body affords it the ability to scale steep cliffs and live atop rocky mountains.");
        wait(1);
        System.out.println("Some say that the fiery tail is fueled by gas made in its stomach.");
        wait(1);
        System.out.println("Not even rain can put out the flames, but Chimchar always puts out the fire when asleep.");
        wait(1);
        chimchar.display();
        }
      else if (pokemonOne.equals("Piplup") || pokemonOne.equals("piplup")) {
        Water piplup = new Water(5, 40);
        wait(1);
        System.out.println("A Penguin Pokémon.");
        wait(1);
        System.out.println("It's one of the starter Pokemon received from Professor Rowan when the player departs from the Sinnoh region.");
        wait(1);
        System.out.println("It's a Water type, so it's strong versus Rock and Grounds.");
        wait(1);
        System.out.println("It's very cute but filled with pride--it hates to accept food from people.");
        wait(1);
        piplup.display();
        }
      else if (pokemonOne.equals("Turtwig") || pokemonOne.equals("turtwig")) {
        Grass turtwig = new Grass(5, 40);
        wait(1);
        System.out.println("A Tiny Leaf Pokemon.");
        wait(1);
        System.out.println("Despite its animal appearance, Turtwig actually has vegetation sprouting from its head.");
        wait(1);
        System.out.println("The shell on its back is made of soil and hardens when it drinks water.");
        wait(1);
        System.out.println("Much like a plant, Turtwig performs photosynthesis, absorbing sunlight and making oxygen.");
        wait(1);
        System.out.println("It also relies heavily on water to keep its plant healthy and thus spends a lot of time near lakes.");
        wait(1);
        turtwig.display();
      }else{
        wait(1);
        System.out.println("That's not exactly a Pokemon, but Dr. Footstep wants to show you Chimchar.");
        Fire chimchar = new Fire(5, 40);
        wait(1);
        System.out.println("A Chimp Pokemon.");
        wait(1);
        System.out.println("With a flaming tail, Chimchar is skilled in Fire-type moves.");
        wait(1);
        System.out.println("Its light body affords it the ability to scale steep cliffs and live atop rocky mountains.");
        wait(1);
        System.out.println("Some say that the fiery tail is fueled by gas made in its stomach.");
        wait(1);
        System.out.println("Not even rain can put out the flames, but Chimchar always puts out the fire when asleep.");
        wait(1);
        chimchar.display();
      }

      wait(2);
      System.out.println("Input another pokemon that you want to know more about:");
      String pokemonTwo = "";

      pokemonTwo = in.nextLine();
      if (pokemonTwo.equals("Chimchar") || pokemonTwo.equals("chimchar")) {
        Fire chimchar = new Fire(5, 40);
        wait(1);
        System.out.println("A Chimp Pokemon.");
        wait(1);
        System.out.println("With a flaming tail, Chimchar is skilled in Fire-type moves.");
        wait(1);
        System.out.println("Its light body affords it the ability to scale steep cliffs and live atop rocky mountains.");
        wait(1);
        System.out.println("Some say that the fiery tail is fueled by gas made in its stomach.");
        wait(1);
        System.out.println("Not even rain can put out the flames, but Chimchar always puts out the fire when asleep.");
        wait(1);
        chimchar.display();
      }
      else if (pokemonTwo.equals("Piplup") || pokemonTwo.equals("piplup")) {
        Water piplup = new Water(5, 40);
        wait(1);
        System.out.println("A Penguin Pokémon.");
        wait(1);
        System.out.println("It's one of the starter Pokemon received from Professor Rowan when the player departs from the Sinnoh region.");
        wait(1);
        System.out.println("It's a Water type, so it's strong versus Rock and Grounds.");
        wait(1);
        System.out.println("It's very cute but filled with pride--it hates to accept food from people.");
        wait(1);
      }
    else if (pokemonTwo.equals("Turtwig") || pokemonTwo.equals("turtwig")) {
      Grass turtwig = new Grass(5, 40);
      wait(1);
      System.out.println("A Tiny Leaf Pokemon.");
      wait(1);
      System.out.println("Despite its animal appearance, Turtwig actually has vegetation sprouting from its head.");
      wait(1);
      System.out.println("The shell on its back is made of soil and hardens when it drinks water.");
      wait(1);
      System.out.println("Much like a plant, Turtwig performs photosynthesis, absorbing sunlight and making oxygen.");
      wait(1);
      System.out.println("It also relies heavily on water to keep its plant healthy and thus spends a lot of time near lakes.");
      wait(1);
      turtwig.display();
    }else{
        wait(1);
        System.out.println("That's not exactly a Pokemon, but Dr. Footstep wants to show you Piplup.");
        Water piplup = new Water(5, 40);
        wait(1);
        System.out.println("A Penguin Pokémon.");
        wait(1);
        System.out.println("It's one of the starter Pokemon received from Professor Rowan when the player departs from the Sinnoh region.");
        wait(1);
        System.out.println("It's a Water type, so it's strong versus Rock and Grounds.");
        wait(1);
        System.out.println("It's very cute but filled with pride--it hates to accept food from people.");
        wait(1);
        piplup.display();
      }

      wait(2);
      System.out.println("Input the last pokemon:");
      String pokemonThree = "";


      pokemonThree = in.nextLine();
      if (pokemonThree.equals("Chimchar") || pokemonThree.equals("chimchar")) {
        Fire chimchar = new Fire(5, 40);
        wait(1);
        System.out.println("A Chimp Pokemon.");
        wait(1);
        System.out.println("With a flaming tail, Chimchar is skilled in Fire-type moves.");
        wait(1);
        System.out.println("Its light body affords it the ability to scale steep cliffs and live atop rocky mountains.");
        wait(1);
        System.out.println("Some say that the fiery tail is fueled by gas made in its stomach.");
        wait(1);
        System.out.println("Not even rain can put out the flames, but Chimchar always puts out the fire when asleep.");
        wait(1);
        chimchar.display();
      }
      else if (pokemonThree.equals("Piplup") || pokemonThree.equals("piplup")) {
        Water piplup = new Water(5, 40);
        wait(1);
        System.out.println("A Penguin Pokémon.");
        wait(1);
        System.out.println("It's one of the starter Pokemon received from Professor Rowan when the player departs from the Sinnoh region.");
        wait(1);
        System.out.println("It's a Water type, so it's strong versus Rock and Grounds.");
        wait(1);
        System.out.println("It's very cute but filled with pride--it hates to accept food from people.");
        wait(1);
        piplup.display();
      }
      else if (pokemonThree.equals("Turtwig") || pokemonThree.equals("turtwig")) {
        Grass turtwig = new Grass(5, 40);
        wait(1);
        System.out.println("A Tiny Leaf Pokemon.");
        wait(1);
        System.out.println("Despite its animal appearance, Turtwig actually has vegetation sprouting from its head.");
        wait(1);
        System.out.println("The shell on its back is made of soil and hardens when it drinks water.");
        wait(1);
        System.out.println("Much like a plant, Turtwig performs photosynthesis, absorbing sunlight and making oxygen.");
        wait(1);
        System.out.println("It also relies heavily on water to keep its plant healthy and thus spends a lot of time near lakes.");
        wait(1);
        turtwig.display();
      }else{
        wait(1);
        System.out.println("That's not exactly a Pokemon, but Dr. Footstep wants to show you Turtwig.");
        Grass turtwig = new Grass(5, 40);
        wait(1);
        System.out.println("A Tiny Leaf Pokemon.");
        wait(1);
        System.out.println("Despite its animal appearance, Turtwig actually has vegetation sprouting from its head.");
        wait(1);
        System.out.println("The shell on its back is made of soil and hardens when it drinks water.");
        wait(1);
        System.out.println("Much like a plant, Turtwig performs photosynthesis, absorbing sunlight and making oxygen.");
        wait(1);
        System.out.println("It also relies heavily on water to keep its plant healthy and thus spends a lot of time near lakes.");
        wait(1);
        turtwig.display();
      }
      // Instance of Pokemon

      wait(1);
      System.out.println("Which starter Pokemon do you want?");
      String response = "";

      response = in.nextLine();
      if(response.equals("Chimchar") || response.equals("chimchar")) {
        Fire starter = new Fire(5, 40);
        wait(1);
        System.out.println("Congrats, you got your first Pokemon! It's a Chimchar!");
      }
      else if(response.equals("Piplup") || response.equals("piplup")) {
        Water starter = new Water(5, 40);
        wait(1);
        System.out.println("Congrats, you got your first Pokemon! It's a Piplup!");
      }
      else if(response.equals("Turtwig") || response.equals("turtwig")) {
        Grass starter = new Grass(5, 40);
        wait(1);
        System.out.println("Congrats, you got your first Pokemon! It's a Turtwig!");
      }
      else{
        int random = (int)((Math.random() * 10) - 8);
        if(random == 1) {
          Fire starter = new Fire(5, 40);
          wait(1);
          System.out.println("You responded too late! The only Pokemon left is Chimchar!");
        }
        else if(random == 2) {
          Water starter = new Water(5, 40);
          wait(1);
          System.out.println("You responded too late! The only Pokemon left is Piplup!");
        }
        else if(random == 3) {
          Grass starter = new Grass(5, 40);
          wait(1);
          System.out.println("You responded too late! The only Pokemon left is Turtwig!");
        }
      }

      Player._numPokemon += 1;
      wait(1);
      System.out.println("You also receive 5 Pokeballs and 5 berries from Dr. Footstep.");
      Player._numPokeball += 5;
      Player._numBerries += 5;
      wait(1);
      System.out.println("You thank Dr. Footstep and walk out of the clinic.");

      wait(1);
      System.out.println("Do you want to catch Pokemon or attempt battling a Gym leader? (catch/battle)");
      response = in.nextLine();
      if ( response.equals("Battle")|| response.equals("battle") ){
        if (player._numPokemon < 7){
          System.out.println("You need at least six pokemon to fight a gym");
          System.out.println("You have been transported to the forest to catch pokemon");
          System.out.println("Do you want to walk? (yes/no)");
          if ( response.equals("yes")|| response.equals("Yes") )
            walk();
            //if a pokemon appears, ask Battl
            //if battle, after battle, ask if they want to cont catching, go to th enurse, or while loop until gymm leader defeated(gym leader)
            //wheher the gym leader is defeated is METHODS
            //battle METHODS
            //catch METHODS
            //displayInventory
            //go to nurse
        }
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
}
