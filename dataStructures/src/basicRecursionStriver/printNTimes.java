package basicRecursionStriver;

import java.util.Scanner;

public class printNTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number:");
		n=sc.nextInt();
		printNames(n);
		sc.close();

	}
	public static void printNames(int n) {
		if(n>0) {
			System.out.println("Shree");
			printNames(n-1);
		}
		
	}

}
