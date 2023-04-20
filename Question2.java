import java.util.Scanner;

public class Question2
{
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    // Numerical input
    double height = myObj.nextDouble();
    double weight = myObj.nextDouble();

    //Calculate BMI and print
    System.out.println(weight / (height * height));
  }
}
