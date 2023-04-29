package basicRecursion;

public class countDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=542;
		System.out.println(countDigit(n));
		

	}
	public static int countDigit(int n) {
		if(n==0) {
			return 0;
		}
		n=countDigit(n/10);
		int count=n+1;
		System.out.println("Number: "+n+"Count: "+count);
		return count;
		
	}

}
