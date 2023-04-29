package basicRecursionStriver;

import java.util.Scanner;

public class printNTimesBackward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number of times:");
		n=sc.nextInt();
		sc.close();
		printBack(n);
	}
	public static void printBack(int n) {
		if(n>0) {
			System.out.print(n+" ");
			printBack(n-1);
		}
		
	}

}
