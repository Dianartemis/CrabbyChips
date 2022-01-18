// Add instance variables to Pokemon.java

import java.util.*;

public class Fire extends Pokemon{

  String _fireName;
  int _fireHp;
  int _fireAttack;
  int _fireDefense;
  int _fireMana;

  public Fire(){
    _fireHp = 7;
    _fireAttack = 8;
    _fireDefense = 7;
    _fireMana = 10;
  }

  public int getHP (){
    _fireHp = _hp * _lvl;
    return _hp;
  }

  public int getAttack(){
    _attack = _attack * _lvl;
    return _attack;
  }

  public int getDefense(){
    _defense = _defense * _lvl;
    return _defense;
  }

  public int getMana(){
    _mana = _mana * _lvl;
    return _mana;
  }

  public boolean isAlive(){
    return _hp >= (7 * _lvl);
  }

  public void display(){
    System.out.println(_name + " / Stats:");
    System.out.println("HP: " + _hp);
    System.out.println("Attack: " + _attack);
    System.out.println("Defense:" + _defense);
    System.out.println("Mana: " + _mana);
  }

  public void move(String moveName, Pokemon name, String type;){
    // Ember
    if
    name = new 
    if(moveName.equals("Ember") || moveName.equals("ember")){
      if(_mana < 20){
        System.out.println("You cannot use " + moveName + ".");
      }
      else{
        _mana = getMana() - 25;
        name._hp = (name.getHP() + name.getDefense()) - (0.4 * getAttack());
        System.out.println(name + " has casted Ember!");
        if(name.isAlive() == false){
          System.out.println("You have defeated your opponent!");
        }
      }
      System.out.println(display());
      System.out.println(name.display());
    }
    // Bulk Up
    if(moveName.equals("Bulk Up") || moveName.equals("bulk up")){
      if(_mana < 20){
        System.out.println("You cannot use " + moveName + ".");
      }
      else{
        _mana = getMana() - 20;
        _defense += 10;
        System.out.println("Defense increased by 10!");
      }
      System.out.println(display());
      System.out.println(name.display());
    }
    // Restore
    if(moveName.equals("Restore") || moveName.equals("restore")){
      _mana += 20;
      System.out.println("Mana increased by 20!");
    }
    System.out.println(display());
    System.out.println(name.display());
  }
}
