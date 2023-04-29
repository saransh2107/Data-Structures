package strings;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String result=reverse(str);
		System.out.println(result);
		System.out.println(str);
		if(result.equals(str)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		sc.close();
		
		

	}
	public static String reverse(String s) {
		String result="";
		for(int i=0;i<s.length();i++) {
			result=s.charAt(i)+result;
		}
		return result;
	}

}
