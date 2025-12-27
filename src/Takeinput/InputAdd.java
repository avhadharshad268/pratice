package Takeinput;

import java.util.Scanner;

public class InputAdd {
  public static void main (String [] args) {
	  System.out.println("Entre Value of A");
	  Scanner sc = new Scanner (System.in);	 
	  int a = sc.nextInt();
	  System.out.println("Entre Value of B" );
	  int b = sc.nextInt();  

      int Result =  add (a , b);
	  System.out.println(" Addition value of " + Result );
	  add (27, 27);  

  }

 public static  int  add (int a , int b) {
	 int C = a + b;
	 System.out.println("Addition Of Two number = " + C );
	 return C;
	}
 }