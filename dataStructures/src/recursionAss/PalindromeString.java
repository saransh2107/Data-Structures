package recursionAss;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Madam";
		System.out.println(isStringPalindrome(s));

	}
	public static boolean isStringPalindrome(String input) {
		// Write your code here
		String x=input;
		if(reverseString(x).equalsIgnoreCase(input)) {
			return true;
		}
		else {
			return false;
		}

	}
	public static String reverseString(String s) {
		if(s.length()==1) {
			return s;
		}
		String small=reverseString(s.substring(1));
		return small+s.charAt(0);
		
		
	}

}
