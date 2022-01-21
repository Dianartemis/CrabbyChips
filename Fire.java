public class Fire extends Pokemon implements Types{


  public Fire(String name, int lvl, int exp){
    _hp = 7* lvl;
    _attack = 8* lvl;
    _defense = 7* lvl;
    _mana = 10* lvl;
    _name = name;
    _lvl = lvl;
    _exp = exp*lvl;
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
    System.out.println("Your available moves are: Ember, Bulk Up, and Restore.");
    System.out.println("Ember deals damage and inflicts Burn.");
    System.out.println("Bulk Up bulks up your defense.");
    System.out.println("Restore restores your mana.");
  }

  // FIRE
  public void move(String moveName, Pokemon name){
    // Ember
    if(moveName.equals("Ember") || moveName.equals("ember")){
      if(_mana < 25){
        System.out.println("You cannot use " + moveName + ".");
      }
      else{
        _mana = getMana() - 25;
        if (name.getDefense() > getAttack()){
          System.out.print("defense greater");
          name._defense = (name._defense - (getAttack()));
        } else{
          System.out.println("defense lower");
          if (name._hp > getAttack()){
            name._hp = (name._hp - (getAttack()));
          } else {
            name._hp = 0;
          }
        }
        System.out.println(name + " has casted Ember!");
        System.out.println("The target is attacked with small flames.");
        if(name.isAlive() == false){
          System.out.println("You have defeated your opponent!");
          increaseExp();
          lvlUp();
        }
      }
      displayt();
      name.displayt();
    }
    // Bulk Up
    if(moveName.equals("Bulk Up") || moveName.equals("bulk up")){
      if(_mana < 20){
        System.out.println("You cannot use " + moveName + ".");
      }
      else{
        _mana = getMana() - 20;
        _defense += 10;
        System.out.println(name._name + " tenses its muscles.");
        System.out.println("Defense increased by 10!");
      }
      displayt();
      name.displayt();
    }
    // Restore
    if(moveName.equals("Restore") || moveName.equals("restore")){
      _mana += 20;
      System.out.println(name._name + " restores its own cells.");
      System.out.println("Mana increased by 20!");
    }
    displayt();
    System.out.println();
    name.displayt();
  }
/*
  public void move(String moveName, Water name){
    // Ember
    if(moveName.equals("Ember") || moveName.equals("ember")){
      if(_mana < 20){
        System.out.println("You cannot use " + moveName + ".");
      }
      else{
        _mana = getMana() - 25;
        name._hp = (int)((name.getHP() + name.getDefense()) - (getAttack() / 2));
        System.out.println(name + " has casted Ember!");
        System.out.println("The target is attacked with small flames.");
        if(name.isAlive() == false){
          System.out.println("You have defeated your opponent!");
          increaseExp();
          lvlUp();
        }
      }
      displayt();
      name.displayt();
    }
    // Bulk Up
    if(moveName.equals("Bulk Up") || moveName.equals("bulk up")){
      if(_mana < 20){
        System.out.println("You cannot use " + moveName + ".");
      }
      else{
        _mana = getMana() - 20;
        _defense += 10;
        System.out.println(name._name + " tenses its muscles.");
        System.out.println("Defense increased by 10!");
      }
      displayt();
      name.displayt();
    }
    // Restore
    if(moveName.equals("Restore") || moveName.equals("restore")){
      _mana += 20;
      System.out.println(name._name + " restores its own cells.");
      System.out.println("Mana increased by 20!");
    }
    displayt();
    System.out.println();
    name.displayt();
  }
  public void move(String moveName, Grass name){
    // Ember
    if(moveName.equals("Ember") || moveName.equals("ember")){
      if(_mana < 20){
        System.out.println("You cannot use " + moveName + ".");
      }
      else{
        _mana = getMana() - 25;
        name._hp = (int)((name.getHP() + name.getDefense()) - (getAttack() / 2));
        System.out.println(name + " has casted Ember!");
        System.out.println("The target is attacked with small flames.");
        if(name.isAlive() == false){
          System.out.println("You have defeated your opponent!");
          increaseExp();
          lvlUp();
        }
      }
      displayt();
      System.out.println();
      name.displayt();
    }
    // Bulk Up
    if(moveName.equals("Bulk Up") || moveName.equals("bulk up")){
      if(_mana < 20){
        System.out.println("You cannot use " + moveName + ".");
      }
      else{
        _mana = getMana() - 20;
        _defense += 10;
        System.out.println(name._name + " tenses its muscles.");
        System.out.println("Defense increased by 10!");
      }
      displayt();
      System.out.println();
      name.displayt();
    }
    // Restore
    if(moveName.equals("Restore") || moveName.equals("restore")){
      _mana += 20;
      System.out.println(name._name + " restores its own cells.");
      System.out.println("Mana increased by 20!");
    }
    displayt();
    System.out.println();
    name.displayt();
  }
*/

}
