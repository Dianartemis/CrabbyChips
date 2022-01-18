import java.util.Scanner;
import java.util.concurrent.TimeUnit;

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
      System.out.println("\n" + "**RING RING**" + "wake up " + name + "!" + " Make sure you get to Dr. Footstep's clinic to get your first starter pokemon mom said.");
      try{
        TimeUnit.SECONDS.sleep(2);
      } catch(InterruptedException ex){
        ex.printStackTrace();
      }
      System.out.println("You totally forgot. Today is your 10th birthday. You are finally old enough to become a Pokemon trainer");
      try{
        TimeUnit.SECONDS.sleep(2);
      } catch(InterruptedException ex){
        ex.printStackTrace();
      }
      System.out.println("You rush over to the pokemon clinic and luckly the line isn't long.");
      try{
        TimeUnit.SECONDS.sleep(2);
      } catch(InterruptedException ex){
        ex.printStackTrace();
      }
      System.out.println("A");
      try{
        TimeUnit.SECONDS.sleep(3);
      } catch(InterruptedException ex){
        ex.printStackTrace();
      }
      System.out.println("few");
      try{
        TimeUnit.SECONDS.sleep(3);
      } catch(InterruptedException ex){
        ex.printStackTrace();
      }
      System.out.println("minutes");
      try{
        TimeUnit.SECONDS.sleep(3);
      } catch(InterruptedException ex){
        ex.printStackTrace();
      }
      System.out.println("later");
      try{
        TimeUnit.SECONDS.sleep(3);
      } catch(InterruptedException ex){
        ex.printStackTrace();
      }
      System.out.println("...");
      try{
        TimeUnit.SECONDS.sleep(7);
      } catch(InterruptedException ex){
        ex.printStackTrace();
      }
      System.out.println("Its finally your turn!");
      //wake up, go to drs place to pick Pokemon
      try{
        TimeUnit.SECONDS.sleep(2);
      } catch(InterruptedException ex){
        ex.printStackTrace();
      }
      System.out.println("What starter Pokemon do you want to choose: Chimchar, Piplup, Turtwig");
      try{
        TimeUnit.SECONDS.sleep(2);
      } catch(InterruptedException ex){
        ex.printStackTrace();
      }
      System.out.println("Input the pokemon that you want to know more about");
      String pokemonOne = "";
      pokemonOne = input.nextLine();
      /**
      if (pokemonOne.equals("Chimchar") || pokemonOne.equals("chimchar")) {
        blue = new Chimchar();
      }
      **/
      //blue = new pokemonOne();

  }
}
