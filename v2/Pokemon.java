import java.util.*;

public class Pokemon {
    String _name;
    int _lvl;
    int _exp;
    int _hp;
    int _attack;
    int _defense;
    int _mana;


    public Pokemon(){
      _lvl = 0;
      _exp = 0;
      _name = "Pokemon";
      _hp = 1;
      _attack = 1;
      _defense = 1;
      _mana = 1;
    }

    public Pokemon(String name, int level, int experience){
      _name = name;
      _lvl = level;
      _exp = experience;
    }

    public int getLvl(){
      return _lvl;
    }

    public int getExp(){
      return _exp;
    }

    public boolean runaway(Pokemon opponent){
        if (opponent.getLvl() <= 10){
          return Math.random() * 10 > opponent.getLvl();
        }
        if (opponent.getLvl() <= 100){
          return Math.random() * 100 > opponent.getLvl();
        }
        else{
          return Math.random() * 1000 > opponent.getLvl();
        }
    }
}
