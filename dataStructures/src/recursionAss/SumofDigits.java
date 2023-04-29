package recursionAss;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=345;
		System.out.println(sumOfDigits(n));

	}
	public static int sumOfDigits(int input){
		// Write your code here
		if(input==0) {
			return 0;
		}
		int rem=input%10;
		int small=sumOfDigits(input/10)+rem;
		return small;
		

	}

}
