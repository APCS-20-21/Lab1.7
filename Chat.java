import java.util.Scanner;

public class Chat
{
  /** The starting point of this program.
   *
   *  @param String[] args Commandline arguments.
   */
  public static void main(String[] args)
  {
    // WRITE YOUR STARTUP CODE BELOW THIS LINE
    System.out.println("Hello.");
    Scanner input = new Scanner(System.in);

    String message = input.nextLine();
    String response = process(message);

    System.out.println(response);

    // WRITE YOUR STARTUP CODE ABOVE THIS LINE
  }

  /** Given an input from the user, determine an appropriate response and return it
   *
   *  @param String input The input from the user
   *  @return String The response to output to the user
   */
  public static String process(String message)
  {
    return "That's interesting.";
  }

  /** Identify the index of keyword in input. Do not match keyword if it is inside another word.
   *  If keyword is not in the input, return -1.
   *
   *  Examples:
   *    findKeyword("abc taco xyz", "taco")   ->  4
   *    findKeyword("abc xyz taco")           ->  8
   *    findKeyword("taco taco taco", "taco") ->  0
   *
   *    findKeyword("xxxCATxxx", "CAT") -> -1
   *    findKeyword("xxxCAT", "CAT")    -> -1
   *    findKeyword("CATxxx", "CAT")    -> -1
   *
   *  @param String input The input from the user
   *  @param String keyword The keyword to search the input for
   *  @return int The index of keyword in message
   */
  public static int findKeyword(String message, String keyword)
  {
    return -1;
  }

}
