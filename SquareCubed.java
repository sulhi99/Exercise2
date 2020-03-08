import java.util.Scanner;

public class SquareCubed // Start of class
{
  public static void main(String[] args) // start of main method
  { 
      int num;
		int square;
		int cube;  
      
      System.out.printf("%-15s%-15s%-15s%n","Number","Square","Cube");//display string
      //System.out.println("Number\t\tSquare\t\tCube"); 
      //System.out.printf("\n");
 
     for (int i=0; i<=10; i++) // process from numbers 0 to 10
     {
        System.out.println(i+"t\t" + (int)Math.pow(i,2)+"\t\t"+(int)Math.pow(i,3)); // calculate cube and square of the numbers
          
     } // end of loop

   } // end of main method
 } // end of class
  