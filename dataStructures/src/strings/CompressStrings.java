package strings;

public class CompressStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaabbccdsaa";
//		StringBuffer st=new StringBuffer(str);
//		
//		int count=0;
//		char m=' ';
//		for(int i=0;i<st.length();i++) {
//			count=0;
//			if(str.charAt(i)!=m) {
//			for(int j=0;j<st.length();j++) {
//				if(str.charAt(j)==st.charAt(i)) {
//					//st.setCharAt(j, '0');
//					count++;
//				}
//			}
//			}
//			if(st.charAt(i)!=m) {
//				m=st.charAt(i);
//				System.out.print(m);
//				st.setCharAt(i, ' ');
//				if(count>1) {
//					System.out.print(count);
//				}
//			
//			}	
//		}
		int j=1;
		int count=0;
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==str.charAt(j)) {
				count++;
				j++;
			}
			else {
				System.out.print(str.charAt(i));
				System.out.print(count);
				j=i+1;
				count=0;
				
			}
			
		}
	}

}
