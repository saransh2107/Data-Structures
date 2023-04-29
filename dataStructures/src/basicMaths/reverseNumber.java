package basicMaths;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in) ;
		int n,d,rev=0;
		System.out.println("Enter the number");
		n=obj.nextInt();
		
		while(n!=0) {
		    d=n%10;      
			System.out.println("Digit:"+d);
			rev=rev*10+d;
			System.out.println("Reverse:"+rev);
			n=n/10;
		}
		obj.close(); 
	}

}
