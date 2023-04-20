import java.util.Scanner;

public class Question4
{
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    //Reads integer entered by the user
    int rows = myObj.nextInt();

    for (int i = rows; i >= 1; --i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
