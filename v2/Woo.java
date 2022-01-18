import java.util.*;

public class Woo{

  private Pokemon blue;

  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome trainer to Pokemon Shining Pearl!");
      System.out.println("\nWhat is your name?");
      String name = "";
      name = input.nextLine();
      System.out.println("Hello " + name + ", are you a boy or a girl?" );
      String gender = "";
      gender = input.nextLine();
      System.out.println("\n" + "**RING RING**" + "wake up " + name + "!" + "");
      //wake up, go to drs place to pick Pokemon

      System.out.println("What starter Pokemon do you want to choose: Chimchar, Piplup, Turtwig");
      System.out.println("Input the pokemon that you want to know more about");
      String pokemonOne = "";

      pokemonOne = input.nextLine();
      if (pokemonOne.equals("Chimchar") || pokemonOne.equals("chimchar")) {
        blue = new Chimchar();
      }
      //blue = new pokemonOne();

  }
}
