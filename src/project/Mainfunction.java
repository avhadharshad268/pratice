package project;

import java.util.Scanner;

public class Mainfunction {
   public static void main (String [] args ) {
	   
	   Student s1  = new Student();
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Please Entre student No  ' user keep in mind entre value no char accepted ' ");
	    int Number   = sc.nextInt ();
	    s1.Number = Number ;
	    
		   System.out.println("Please Entre student Name ");
		    String  Name   = sc.next ();
	       s1.Name = Name ;
	    
		   System.out.println("Please Entre student Last_Name ");
		   String Last_Name   = sc.next ();
	      s1.Last_Name = Last_Name;
	    
		  System.out.println("Please Entre student Age ");
		  int Age   = sc.nextInt ();
	      s1.Age = Age;
	    
		   System.out.println("Please Entre student Address ");
		   String  Address   = sc.next ();
	       s1.Address = Address;  
	     s1.printName();
	       
	     System.out.println(s1.Number);
	     System.out.println(s1.Name);
	     System.out.println(s1.Last_Name);
	     System.out.println(s1.Age);
	     System.out.println(s1.Address);

	     
	   

   }
}
