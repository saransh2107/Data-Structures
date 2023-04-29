package patterns;

import java.util.*;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the range of the pattern");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {   //For rows
			
			for(int j=0;j<n;j++) {  //For Columns
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		sc.close();
	}

}
