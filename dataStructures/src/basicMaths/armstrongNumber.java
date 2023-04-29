package basicMaths;

import java.util.Scanner;

public class armstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		int sum=0,num=0;
		System.out.println("Enter the number");
		n=sc.nextInt();
		num=n;
		while(n!=0) {
			
			int d=n%10;
			sum=sum+(int) Math.pow(d, 3);
			n=n/10;
		}
		if(num==sum) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not");
		}
		
		sc.close();
		

	}

}
