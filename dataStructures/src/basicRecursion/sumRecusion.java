package basicRecursion;

public class sumRecusion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(sum(n));

	}
	public static int sum(int n) {
		if(n==0) {
			return 0;             //Base case
		}
		int smallOutput=sum(n-1);
		int result=smallOutput+n;
		System.out.println(smallOutput+"    "+result+"    "+n);
		return result;
	}

}
