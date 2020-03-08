import java.util.Scanner; // import scanner

public class CountA // start of class 
{

  public static void main(String [] args) // start main method
  {
     
     Scanner sc = new Scanner(System.in); 
     System.out.print("Enter string to count total: ");
     int count =0;
     int i=0;
     String str=sc.nextLine();
     int stringLength= str.length();
  
      while(i<str.length())    
      {
          if (str.charAt(i)=='A')
          {
         
           count++;
          }
           
           i++;
    }
      
      System.out.println("The number of character 'A' found :" + count);   // Print it out and we're done
       } // End of main method
  } //End of class