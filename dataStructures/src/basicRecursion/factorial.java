package basicRecursion;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(fact(n));

	}
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		int small=fact(n-1);
		int output=n*small;
		System.out.println(small+" "+output);
		return output;
	}

}
