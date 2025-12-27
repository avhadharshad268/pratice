package login;

import java.util.Scanner;

public class loginmain {
   public static void main (String [] args ) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println ("###### Welcome To E-commerence ####### \n \n " );
	  
	   System.out.println ("\t**** Entre You User_Name :-  \n \n ");
	  
	   String User = sc.next();
	   System.out.println (" \t ***Entre your Password***");
	   String Pass = sc.next();  
	  
	
	   
	      if (User.equals(LoginDate.User_Name)) {
		   if (Pass.equals(LoginDate.Password)) {
		    System.out.println("Login Sucessful ");
           return;
		   }
	      }
		   System.out.println("Login unscessful  ");
	   
	   }
}
