package Takeinput;

import java.util.Scanner;

public class sub {
   public static void main ( String [] args ) {
	   Scanner sc = new Scanner(System.in);
       int c = sc.nextInt();
       int b = sc.nextInt();
       sub(c,b);
       sub (23 , 89);
	   int    A = c + b ;
       System.out.println("Addition pf two Number " + A);
   }
   public static int sub (int A , int B) {
	   int S = A + B ; 
	   System.out.println("Addition of two number " + S);
	   return S;
   }
}
