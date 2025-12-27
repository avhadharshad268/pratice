package product;

import java.util.Scanner;

public class Productmain {
     public static void main (String [] args ) {
    	 
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("*****Welcome Add User*****");
     	ProductName s1 = new ProductName () ;
    	System.out.println("*****Entre Product Name *****");
    	String Product_Name = sc.next();
    	s1.Product_Name = Product_Name;
    	
    	int Product_quantity = sc.nextInt();
    	s1.Product_quantity  = Product_quantity;
    	
    	ProductName s2 = new ProductName () ;
    	ProductName s3 = new ProductName () ;
        
    	System.out.println("\t Product Name is = "+ " " +s1.Product_Name );
    	System.out.println("\t Product_quantity is = "+ " " +s1.Product_quantity );

    	

    	
    	 
     }

	 private static int Product_quantity() {
		// TODO Auto-generated method stub
		return 0;
	 }
}  
