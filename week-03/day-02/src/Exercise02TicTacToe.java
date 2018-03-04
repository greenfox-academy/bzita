import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class Exercise02TicTacToe {

  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // open and read it. The file data represents a tic-tac-toe
    // game result. Return 'X'/'O'/'draw' based on which player
    // has winning situation.

    System.out.println(ticTacResult("win-o.txt"));
    // should print O

    System.out.println(ticTacResult("win-x.txt"));
    // should print X

    System.out.println(ticTacResult("draw.txt"));
    // should print draw
  }
  public static String ticTacResult (String fileTicTacToe){
    try {
      Path ticTacToePath1 = Paths.get(fileTicTacToe);

    } catch (exception e) {
      System.out.println("The file could not be opened");
    }
  }
}






















  /*public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // open and read it. The file data represents a tic-tac-toe
    // game result. Return 'X'/'O'/'draw' based on which player
    // has winning situation.

    System.out.println(ticTacResult("win-o.txt"))
    // should print O

    System.out.println(ticTacResult("win-x.txt"))
    // should print X

    System.out.println(ticTacResult("draw.txt"))
    // should print draw
  }*/

