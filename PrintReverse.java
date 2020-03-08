import java.util.Scanner;

public class PrintReverse //start of class //call the constructor that accepts a line of String to reverse
{
   public static void main (String[]args) //start of main method
   {
      Scanner sc =new Scanner(System.in);
      System.out.print("Enter a string to be reversed: ");
      String a=sc.nextLine();
      int stringLength=a.length();
      char reverse;
      
      for(int i=0;i<a.length();i++) // start for looping
      {
         reverse=a.charAt(a.length()-i-1);
         System.out.print(reverse);
      } //end for loop
    } //end of main method
  } //end of class