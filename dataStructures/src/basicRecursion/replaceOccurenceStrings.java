package basicRecursion;

public class replaceOccurenceStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Saransh";
		System.out.println("Final Output:   "+replaceChars("Saransh",'a','b'));
		System.out.println("Substring:   "+s.substring(1));

	}
	public static String replaceChars(String s,char x,char y) {
		if(s.length()==0) {
			return s;
		}
		String small=replaceChars(s.substring(1),x,y);
		//System.out.print(s.substring(1)+"   ");
		System.out.println(small);
		if(s.charAt(0)==x) {
			//System.out.println(small);
			return small;
		}
		else {
			return s.charAt(0)+small;
		}
		
	}

}
