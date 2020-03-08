import java.util.Scanner;
import java.util.Random;

public class RandomInRange // Start of class
{
     public static void main(String[] args) // start of main method
     {
        Scanner sc = new Scanner(System.in); // create scanner object to eccept input called in
        
        System.out.print("Enter the lower limit : ");
        int lower = sc.nextInt();
        sc.nextLine(); // remove the new row
        System.out.print("Enter the upper limit : ");
        int upper = sc.nextInt();
        sc.nextLine(); // remove the new row

        
        new RandomInRange(lower, upper); // call the RandomInRange constructor that accepts two int
     } // End of main method
     
     public RandomInRange(int lower, int upper) // start of RandomInRange constructor
     {
     
           int rng = (lower > upper) ? 0 : lower + new Random(System.currentTimeMillis()).nextInt((upper - lower) + 1);
           
           System.out.println("The Random Number is : " + rng); // display random number
     } // end of constructor
    } // end of class