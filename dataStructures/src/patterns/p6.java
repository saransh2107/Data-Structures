package patterns;

import java.util.Scanner;

public class p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the range of the pattern");
		n=sc.nextInt();
		//int count;
		for(int i=n;i>0;i--) {
			//count=1;
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
		sc.close();

	}

}
