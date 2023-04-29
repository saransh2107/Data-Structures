package basicRecursionStriver;

import java.util.ArrayList;
import java.util.Scanner;

public class factorialN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		sc.close();
		System.out.println(factorialNumbers(n));
	}
	static ArrayList<Long> factorialNumbers(long N){
        // code here
		long f=1;
        ArrayList<Long> store=new ArrayList<Long>();
		for(int i=1;i<=N;i++) {
			f=1;
			for(int j=1;j<=i;j++) {
				f=f*j;
			}
			if(f<=N) {
			store.add(f);
			}
		}
        
        return store;
    }

}



//Optimized Code 
//class Solution{
//  static ArrayList<Long> factorialNumbers(long N){
//      // code here
//      ArrayList<Long> fact=new ArrayList<Long>();
//      long facto=1;           
//      for(int i=1;i<=N;i++)   //i=1          //2            //3
//      {
//          facto*=i;           //facto=1      facto=2*1=2    facto=3*2=6
//          if(facto>N)
//              break;
//          fact.add(facto);//[1,] [1,2]  [1,2]
//      }
//      return fact;
//  }
//}




