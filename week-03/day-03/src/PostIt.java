public class PostIt {

  //Create a PostIt class that has
  //      a backgroundColor
  //      a text on it
  //      a textColor
  //      Create a few example post-it objects:
  //an orange with blue text: "Idea 1"
  //a pink with black text: "Awesome"
  //a yellow with green text: "Superb!"

  private String backgroundColor;
  private String text;
  private String textColor;

  public PostIt(String backgroundColor, String text, String textColor) {
    this.backgroundColor = backgroundColor;
    this.text = text;
    this.textColor = textColor;
  }

  public static void main(String[] args) {
    PostIt postIt1 = new PostIt("orange", "Idea 1", "blue");
    PostIt postIt2 = new PostIt("pink", "Awesome", "black");
    PostIt postIt3 = new PostIt("yellow", "Superb!", "green");
  }
}


