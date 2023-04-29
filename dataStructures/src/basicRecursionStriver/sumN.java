package basicRecursionStriver;

import java.util.Scanner;

public class sumN {
	static int s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number of times:");
		n=sc.nextInt();
		sc.close();
		int z=sum(n);
		System.out.println(z);

	}
	public static int sum(int n) {
		if(n>0) {
			s=(int) (s+Math.pow(n, 3));
			sum(n-1);
			return s;
		}
		return 0;
	}

}


//class Solution {
//    long sumOfSeries(long N) {
//        // code here
//        if(N>0){
//            return ((long)(Math.pow(N,3))+sumOfSeries(N-1));
//        }
//        return 0L;
//    }
//}
