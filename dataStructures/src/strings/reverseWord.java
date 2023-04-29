package strings;

public class reverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hi My Name is Saransh";
		String temp="";
		String result="";
		for(int i=0;i<s.length();i++) {
			temp=temp+s.charAt(i);
			if(s.charAt(i)==' ') {
				result=temp+""+result;
				temp="";
			}
			
		} 
		result=temp+' '+result;
		result=result.trim();
		System.out.println(result);
		System.out.println(result.length());
		System.out.println(s.length());

	}

}
