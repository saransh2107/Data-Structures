package strings;

//import java.util.Scanner;

public class AllSubstrings {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		String str="abc";
		int i=0;
		while(i<str.length()) 
		{
	    String s=str.substring(i,str.length());
		printStrings(s);
		i++;
		}
	}
	public static void printStrings(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}

}
