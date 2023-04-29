package strings;
import java.util.Scanner;

public class printAllChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		printChars(str);
		sc.close();
		

	}
	public static void printChars(String s) {
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i)+" ");
		}
	}

}
