import java.util.Scanner;

public class Question5
{

  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    //Reads integer entered by the user
    int rows = myObj.nextInt();
    int compareBase = 0;

 while(rows -- > 0)
    {       
    //Reads integer entered by the user
    int compareNum = myObj.nextInt();
      
          if (compareNum > compareBase)
          {
            compareBase = compareNum;
          }  
    }
          System.out.println(compareBase);
    
  }
}
