package patterns;

import java.util.Scanner;

public class p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the range of the pattern");
		n=sc.nextInt();
		
	    for(int i=1;i<=n;i++) {
	    	for(int j=1;j<=i;j++) {
	    		System.out.print("*");
	    	}
	    	System.out.println(" ");
	    }
		
		
		
		sc.close();

	}

}
