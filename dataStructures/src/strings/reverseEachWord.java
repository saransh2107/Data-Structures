package strings;

public class reverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hi My Name is Saransh";
		String temp="";
		String result="";
		for(int i=0;i<s.length();i++) {
			temp=temp+s.charAt(i);
			if(s.charAt(i)==' ') {
				result=result+""+reverse(temp);
				temp="";
			}
			
		} 
		result=result+' '+reverse(temp);
		result=result.trim();
		System.out.println(result);
		System.out.println(result.length());
		System.out.println(s.length());

	}
	public static String reverse(String s) {
		String result="";
		for(int i=0;i<s.length();i++) {
			result=s.charAt(i)+result;
		}
		return result;
	}

}
