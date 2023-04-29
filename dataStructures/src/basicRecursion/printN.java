package basicRecursion;

public class printN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		printNumber(n);

	}
	public static void printNumber(int n) {
		if(n==0) {
			return;
		}
		
		printNumber(n-1);
		System.out.print(n+" ");
	   
	}
	

}
