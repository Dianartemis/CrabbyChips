import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.io.*;
import java.util.*;

public class Human {
  String _name;
  boolean _gender;
  int _role;

/**
Key:
0 -- pokemon trainer
1 -- gym leader
2 -- nurse
3 -- civilian
4 -- doctor

true -- female
false -- male
**/

  public Human(){
      _gender = true;
      _role = 0;
      _name = "Dawn";
  }

  public Human(boolean gender, int role, String name ){
    _gender = gender;
    _role = role;
    _name = name;
  }


  public boolean getGender(){
    return _gender;
  }

  public String getRole(){
    if (_role == 0) {
      return "Pokemon trainer";
    }
    if (_role == 1) {
      return "gym leader";
    }
    if (_role == 2) {
      return "nurse";
    }
    if (_role == 3) {
      return "citizen of this town";
    }
    else {
      return "doctor";
    }
  }

  public String getName(){
    return _name;
  }

  public static void wait(int s) {
    try {
      Thread.sleep(s * 500);
    }
    catch (InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }

  public void greet(Player name){
    wait(1);
    System.out.println("Hello " + name._name + ", " + "my name is " + _name + ". I am a " + getRole() + ".");
    wait(1);
  }

  public void goodbye(Player name){
    wait(1);
    System.out.println("Goodbye " + name._name + "! See you next time.");
    wait(1);
  }
}
