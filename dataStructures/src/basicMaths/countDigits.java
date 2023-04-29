package basicMaths;

import java.util.Scanner;

public class countDigits {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in) ;
		int n;
		int count=0;
		System.out.println("Enter the number");
		n=obj.nextInt();
		while(n!=0) {
			int d=n%10;
			count++;
			n=n/10;
			
		}
    System.out.println("Count of Digits is:"+count);
	obj.close();
	}
}
