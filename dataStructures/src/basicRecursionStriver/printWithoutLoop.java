package basicRecursionStriver;

import java.util.Scanner;

public class printWithoutLoop {
	static int i=1;
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		sc.close();
		int n=5;
		print(n);	
	}
	public static void print(int number) {
		
		if(number>=i) {
		System.out.println(i);
		i=i+1;
		print(number);
		}
	}

}
//Optimized And Best Approach

//class Solution
//{
//   
//  public void printNos(int N)
//    {
//        //Your code here
//         if(N>0){
//           printNos(N-1);
//           System.out.print(N+" ");
//       }
//
//    }
//}
