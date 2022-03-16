//Mary Kochmanski
//CIS 221, Tuesdays and Thursdays at 2:10PM

//superclass
class Type {
  //private variable
  private String genre = "Horror";
  //passes information to another class through get method
  public String getGenre() {
  	return genre;
  }
}

//subclass extends the superclass
class Game extends Type {
  //private variable can only be used in the subclass
  private String name = "Phasmophobia";
  public static void main(String[] args) {
    Game myGame = new Game();
    System.out.println(myGame.getGenre() + " Game: " + myGame.name);
  }
}
