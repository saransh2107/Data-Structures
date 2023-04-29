package basicRecursion;

public class powerRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=2;
		int power=3;
		System.out.println(power(number,power));

	}
	public static int power(int number,int power) {
	 if(power==0) {
		 return 1;
	 }
	 int small=power(number,power-1);
	 int result=small*number;
	 System.out.println("Small: "+small +"Result: "+result+"Number: "+ number  +"Power: "+power);
	 return result;
	}
	
}
