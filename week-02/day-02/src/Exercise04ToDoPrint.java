public class Exercise04ToDoPrint {

  public static void main(String... args) {
    String todoText = " - Buy milk\n";

    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText but with indention

    // Expected output:

    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo

    String MyToDo = "My todo:\n";
    todoText = MyToDo + todoText.concat(" - Download games\n").concat("    - Diablo");
    System.out.println(todoText);
  }
}
