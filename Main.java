import java.util.Scanner;

/**
 * Finds out what the users animal type is.
 * @author Thomas Quigley 
 */
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // ask them if they have feathers, if so they are a bird, if not they are either a mammal or a reptile
    System.out.println("Does your animal have feathers?");
    String feather = input.nextLine();

    if (feather.equals("yes")) {
      // is a bird
      // ask what colour the feathers are
      System.out.println("Are the feathers red or blue?");
      String featherColour = input.nextLine();

      if (featherColour.equals("blue")) {
        System.out.println("You have a blue jay");
      } else if (featherColour.equals("red")) { 
        System.out.println("You have a cardinal");
      }
        
    } else {
      // ask them if they have fur or scales. 
      System.out.println("Does the animal have fur or scales?");
      String fluffOrRuff = input.nextLine();

      if (fluffOrRuff.equals("fur")) {
        // mammal, ask if big or not, if big then it's a bear, otherwise it's a mouse
        System.out.println("Is your animal big or small?");
        String size = input.nextLine();

        if (size.equals("big")) {
          System.out.println("You have a bear");
        } else {
          System.out.println("You have a mouse");
        }
      } else {
        // reptile, ask if they have legs, if they do they are an iguana if not they are a snake
        System.out.println("Does your animal have legs?");
        String legs = input.nextLine();

        if (legs.equals("yes")) {
          System.out.println("You have an iguana");
        } else {
          System.out.println("You have a snake");
        }
      }
    }
    
  }
}
