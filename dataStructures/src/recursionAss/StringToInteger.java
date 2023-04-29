package recursionAss;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1234";
		System.out.println(convertStringToInt(s));

	}
	public static int convertStringToInt(String input){
		int s=Integer.parseInt(input);
		return s;

	}

}
