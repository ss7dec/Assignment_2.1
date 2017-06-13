//Conditional Statements to find out the Highest Value amongst 3 Given Numbers

package answer_2_1_A;


import java.util.Scanner;
public class Finding_Highest_Amongst_Three_Numbers {
	public static void main(String args[])
	   {
	      int m, n, o;
	      System.out.println("Enter three integers ");
	      Scanner in = new Scanner(System.in);
	 
	      m = in.nextInt();
	      n = in.nextInt();
	      o = in.nextInt();
	 
	      if ( m > n && m > o )
	         System.out.println("First number is largest.");
	      else if ( n > m && n > o )
	         System.out.println("Second number is largest.");
	      else if ( o > m && o > n )
	         System.out.println("Third number is largest.");
	      else   
	         System.out.println("Entered numbers are not distinct.");
	   }
	
}
