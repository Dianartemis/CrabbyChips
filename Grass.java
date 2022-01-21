import java.util.*;

public class Grass extends Pokemon implements Types{


  public Grass(String name, int lvl, int exp){
    _hp = 6* lvl;
    _attack = 8* lvl;
    _defense = 7* lvl;
    _mana = 10* lvl;
    _name = name;
    _lvl = lvl;
    _exp = exp *lvl;
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
    if (_hp >=(6*_lvl)){
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
    System.out.println("Your available moves are: Razor Leaf, Safe Guard, and Rest.");
    System.out.println("Razor Leaf is an attack that sends sharp-edged leaves at the target.");
    System.out.println("Safe Guard is a power that protects the user, increases defense.");
    System.out.println("Rest makes the user take a nap to restore mana.");
  }


  // GRASS
  public void move(String moveName, Pokemon name){
    // Razor Leaf
    if(moveName.equals("Razor Leaf") || moveName.equals("razor leaf")){
      if(_mana < 25){
        System.out.println("You cannot use " + moveName + ".");
      }
      else{
        _mana = getMana() - 25;
        if (name.getDefense() > getAttack()){
          name._defense = (name._defense - (getAttack()));
        } else if (name.getDefense() < getAttack() && name.getDefense() > 0){
          name._defense = 0;
          name._hp = (name._hp - (getAttack()-name.getDefense()));
          if (name._hp > getAttack()){
            name._hp = (name._hp - (getAttack()));
          } else {
            name._hp = 0;
          }
        }
        System.out.println(name + " has casted Razor Leaf!");
        System.out.println("A sharp-edged leaf is launched to slash at the foe.");
        if(name.isAlive() == false){
          System.out.println("You have defeated your opponent!");
        }
      }
      System.out.println();
      displayt();
      System.out.println();
      name.displayt();
      System.out.println();
    }
    // Safe Guard
    if(moveName.equals("Safe Guard") || moveName.equals("safe guard")){
      if(_mana < 20){
        System.out.println("You cannot use " + moveName + ".");
      }
      else{
        _mana = getMana() - 20;
        _defense += 10;
        System.out.println(getName() + " creates a protective field.");
        System.out.println("Defense increased by 10!");
      }
      System.out.println();
      displayt();
      System.out.println();
      name.displayt();
      System.out.println();
    }
    // Rest
    if(moveName.equals("Rest") || moveName.equals("rest")){
      _mana += 20;
      System.out.println(getName() + " takes a nap.");
      System.out.println("Mana increased by 20!");
      System.out.println();
      displayt();
      System.out.println();
      name.displayt();
      System.out.println();
    }
  }
  /*
  public void move(String moveName, Grass name){
    // Razor Leaf
    if(moveName.equals("Razor Leaf") || moveName.equals("razor leaf")){
      if(_mana < 20){
        System.out.println("You cannot use " + moveName + ".");
      }
      else{
        _mana = getMana() - 25;
        name._hp = (int)((name.getHP() + name.getDefense()) - (getAttack() / 2));
        System.out.println(name + " has casted Razor Leaf!");
        System.out.println("A sharp-edged leaf is launched to slash at the foe.");
        if(name.isAlive() == false){
          System.out.println("You have defeated your opponent!");
        }
      }
      displayt();
      System.out.println();
      name.displayt();
    }
    // Safe Guard
    if(moveName.equals("Safe Guard") || moveName.equals("safe guard")){
      if(_mana < 20){
        System.out.println("You cannot use " + moveName + ".");
      }
      else{
        _mana = getMana() - 20;
        _defense += 10;
        System.out.println(name._name + " creates a protective field.");
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

  public void move(String moveName, Fire name){
    // Razor Leaf
    if(moveName.equals("Razor Leaf") || moveName.equals("razor leaf")){
      if(_mana < 20){
        System.out.println("You cannot use " + moveName + ".");
      }
      else{
        _mana = getMana() - 25;
        name._hp = (int)((name.getHP() + name.getDefense()) - (getAttack() / 2));
        System.out.println(name + " has casted Razor Leaf!");
        System.out.println("A sharp-edged leaf is launched to slash at the foe.");
        if(name.isAlive() == false){
          System.out.println("You have defeated your opponent!");
        }
      }
      displayt();
      System.out.println();
      name.displayt();
    }
    // Safe Guard
    if(moveName.equals("Safe Guard") || moveName.equals("safe guard")){
      if(_mana < 20){
        System.out.println("You cannot use " + moveName + ".");
      }
      else{
        _mana = getMana() - 20;
        _defense += 10;
        System.out.println(name._name + " creates a protective field.");
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
