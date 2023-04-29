package recursionAss;

public class CountZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		System.out.println(countZerosRec(n));

	}
	public static int countZerosRec(int input){
		// Write your code here
		if(input<=1) {
			if(input==0) {
				return 1;
			}
			else {
				return 0;
			}
		}
		int small=input%10;
		int count=1;
		if(small==0) {
			return count+countZerosRec(input/10);
		}
		else {
			return countZerosRec(input/10);
		}
	}

}
