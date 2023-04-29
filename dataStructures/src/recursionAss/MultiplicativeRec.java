package recursionAss;

public class MultiplicativeRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int m=3;
		System.out.println(multiplyTwoIntegers(n,m));

	}
	public static int multiplyTwoIntegers(int n, int m){
		// Write your code here
		if(m==0) {
			return 0;
		}
		return n+multiplyTwoIntegers(n,m-1);
	
	}

}
