package recursionAss;

public class PairStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaaabbb";                //hel*lo*o*o  If two adjacent strings are equal then place a star
		System.out.println(addStars(s));

	}
	public static String addStars(String s) {
		// Write your code here          Approach without recursion
		String temp="";
		for(int i=0;i<s.length();i++) {
			if((i+1)<s.length()) {
			if(s.charAt(i)==s.charAt(i+1)) {
				temp=temp+s.charAt(i)+"*";
			}
			else {
				temp=temp+s.charAt(i);
			}
			}
			
		}
		return temp+s.charAt(s.length()-1);
		
	}

}
