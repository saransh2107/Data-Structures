
package strings;
import java.util.Scanner;

public class Countwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(countWords(str));
		sc.close();

	}
	public static int countWords(String s) {
		int count=1;
		s=s.trim();
		if(s.isBlank()) {
			return 0;
		}
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		return count;
		
	}

}
