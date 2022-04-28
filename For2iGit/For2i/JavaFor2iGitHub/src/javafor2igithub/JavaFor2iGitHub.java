
package javafor2igithub;
import java.util.Scanner;

/*
 Author: Bartosz Jakubowski
 Location: Edinburgh
 * Date: 28.04.2022
 * Version: 1.0
 * Notes: n/a
 */
public class JavaFor2iGitHub 
{
    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name if you'd like to see some numbers: ");
        String name;
        name = scan.nextLine();
        
      int X = 16;                                                                // assuming that X is 16
      int A = 2;                                                                 // assuming that A is 2
      System.out.println("              ***   Hello " + name +  "!   ***" + "\nHere is the list of multiples of 2 that are less or equal to 16: ");
      for(int i=A; i<=X; i+=A)
      {
          System.out.println(i);
      }
      System.out.println("Here is the list of multiples of 3 that are less or equal to 32: ");
      for(int i=(A+1); i<=2*X; i+=(A+1))
      {
          System.out.println(i);
      }
      System.out.println("Here is the list of multiples of 4 that are less or equal to 48: ");
      for(int i=(A+2); i<=3*X; i+=(A+2))
      {
          System.out.println(i);
      }
     
    }
    
}
