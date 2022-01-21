import java.util.*;

public class Water extends Pokemon implements Types{

  String _name;
  int _hp;
  int _attack;
  int _defense;
  int _mana;

  public Water(String name, int lvl, int exp){
    _hp = 7* lvl;
    _attack = 7* lvl;
    _defense = 7* lvl;
    _mana = 10* lvl;
    _name = name;
    _lvl = lvl;
    _exp = exp;
  }
  public void setName(String name){
    _name = name;
  }
  public int getHP(){
    return _hp;
  }

  public int getAttack(){
    return _attack;
  }

  public int getDefense(){
    return _defense;
  }

  public int getMana(){
    return _mana;
  }

  public boolean isAlive(){
    if (_hp >=(7*_lvl)){
      return true;
    }else {
      return false;
    }
  }
  public void displayt(){
    System.out.println(_name + " / Stats:");
    System.out.println("HP: " + _hp);
    System.out.println("Attack: " + _attack);
    System.out.println("Defense:" + _defense);
    System.out.println("Mana: " + _mana);
  }

  public void displayMove() {
    System.out.println("Your available moves are: Water Gun, Rain Dance, and Rest.");
    System.out.println("Water Gun squirts water to attack.");
    System.out.println("Rain Dance summons rain to increase defense.");
    System.out.println("Rest makes the user take a nap to restore mana.");
  }


  // WATER
  public void move(String moveName, Pokemon name){
    // Water Gun
    displayt();
    if(moveName.equals("Water Gun") || moveName.equals("water gun")){
      if(_mana < 20){
        System.out.println("You cannot use " + moveName + ".");
      }
      else{
        _mana = getMana() - 25;
        name._hp = (int)((name.getHP() + name.getDefense()) - 3);
        System.out.println(name + " has casted Water Gun!");
        System.out.println("The foe is blasted with a forceful shot of water.");
        if(name.isAlive() == false){
          System.out.println("You have defeated your opponent!");
        }
      }
      displayt();
      name.displayt();
    }
    // Rain Dance
    if(moveName.equals("Rain Dance") || moveName.equals("rain dance")){
      if(_mana < 20){
        System.out.println("You cannot use " + moveName + ".");
      }
      else{
        _mana = getMana() - 20;
        _defense += 10;
        System.out.println("Rain starts to fall.");
        System.out.println("Defense increased by 10!");
      }
      displayt();
      name.displayt();
    }
    // Rest
    if(moveName.equals("Rest") || moveName.equals("rest")){
      _mana += 20;
      System.out.println(name._name + " takes a nap.");
      System.out.println("Mana increased by 20!");
    }
    displayt();
    System.out.println();
    name.displayt();
  }
/*
  public void move(String moveName, Fire name){
    // Water Gun
    if(moveName.equals("Water Gun") || moveName.equals("water gun")){
      if(_mana < 20){
        System.out.println("You cannot use " + moveName + ".");
      }
      else{
        _mana = getMana() - 25;
        name._hp = (int)((name.getHP() + name.getDefense()) - (getAttack() / 2));
        System.out.println(name + " has casted Water Gun!");
        System.out.println("The foe is blasted with a forceful shot of water.");
        if(name.isAlive() == false){
          System.out.println("You have defeated your opponent!");
        }
      }
      displayt();
      System.out.println();
      name.displayt();
    }
    // Rain Dance
    if(moveName.equals("Rain Dance") || moveName.equals("rain dance")){
      if(_mana < 20){
        System.out.println("You cannot use " + moveName + ".");
      }
      else{
        _mana = getMana() - 20;
        _defense += 10;
        System.out.println("Rain starts to fall.");
        System.out.println("Defense increased by 10!");
      }
      displayt();
      System.out.println();
      name.displayt();
    }
    // Rest
    if(moveName.equals("Rest") || moveName.equals("rest")){
      _mana += 20;
      System.out.println(name._name + " takes a nap.");
      System.out.println("Mana increased by 20!");
    }
    displayt();
    System.out.println();
    name.displayt();
  }
  public void move(String moveName, Grass name){
    // Water Gun
    if(moveName.equals("Water Gun") || moveName.equals("water gun")){
      if(_mana < 20){
        System.out.println("You cannot use " + moveName + ".");
      }
      else{
        _mana = getMana() - 25;
        name._hp = (int)((name.getHP() + name.getDefense()) - (getAttack() / 2));
        System.out.println(name + " has casted Water Gun!");
        System.out.println("The foe is blasted with a forceful shot of water.");
        if(name.isAlive() == false){
          System.out.println("You have defeated your opponent!");
        }
      }
      displayt();
      System.out.println();
      name.displayt();
    }
    // Rain Dance
    if(moveName.equals("Rain Dance") || moveName.equals("rain dance")){
      if(_mana < 20){
        System.out.println("You cannot use " + moveName + ".");
      }
      else{
        _mana = getMana() - 20;
        _defense += 10;
        System.out.println("Rain starts to fall.");
        System.out.println("Defense increased by 10!");
      }
      displayt();
      System.out.println();
      name.displayt();
    }
    // Rest
    if(moveName.equals("Rest") || moveName.equals("rest")){
      _mana += 20;
      System.out.println(name._name + " takes a nap.");
      System.out.println("Mana increased by 20!");
    }
    displayt();
    System.out.println();
    name.displayt();
  }
  */

}
