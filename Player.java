public class Player {
  String _name;
  boolean _gender;
  static int _numPokemon;
  static int _numPokeball;
  static int _numBerries;
  static Pokemon[] _pokedex;
  static int _pokedexSize;

  public Player(){
    _name = "Dawn";
    _gender = true;
    _numPokemon = 0;
    _numPokeball = 0;
    _numBerries = 0;
    _pokedex = new Pokemon[1];
    _pokedexSize = 0;
  }

  public Player(String name, boolean gender){
    this();
    _name = name;
    _gender = gender;
  }

  private static void expand()
  {
    Pokemon[] temp = new Pokemon[ _pokedex.length * 2 ];
    for( int i = 0; i < _pokedex.length; i++ ) {
      temp[i] = _pokedex[i];
    }
    _pokedex = temp;
  }

  public static void add( Pokemon newPokemon )
  {
    if (_pokedexSize + 1 > _pokedex.length) {
    	expand();
    }
    _pokedex[_pokedexSize] = newPokemon;
    _pokedexSize += 1;
  }

  public static void dislayt() {
    System.out.println();
  }

  public static void displayPokedex() {
    System.out.print("\u001b[38;2;64;64;64m");
    System.out.print("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.print("\u001b[38;2;255;204;204m");
    for (int i = 0; i <_pokedexSize; i++) {
      System.out.println(_pokedex[i]);
      System.out.println();
      _pokedex[i].displayt();
    }
    System.out.print("\u001b[38;2;64;64;64m");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
  }

  public static void displayPokemon() {
    for (int i = 0; i <_pokedexSize; i++) {
      System.out.println();
      _pokedex[i].displayt();
    }
  }

  public static void displayInventory() {
    System.out.print("\u001b[38;2;64;64;64m");
    System.out.println("\n===============");
    System.out.print("\u001b[38;2;255;153;153m");
    System.out.println("In your bag...");
    System.out.println("Pokeballs: " + _numPokeball);
    System.out.println("Berries: " + _numBerries);
    System.out.print("\u001b[38;2;64;64;64m");
    System.out.println("===============");
  }
}
