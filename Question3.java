import java.util.Scanner;

public class Question3
{
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    //Reads integer entered by the user
    int integer = myObj.nextInt();

    //multiplies the integer by itself and print out the result
    System.out.println(integer * integer);
  }
}
