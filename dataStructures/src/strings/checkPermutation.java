package strings;

public class checkPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuffer str1=new StringBuffer("aab");                                        //Approach 1
//		StringBuffer str2=new StringBuffer("aba");
//		boolean result=false;
//
//		for(int i=0;i<str1.length();i++) {
//			for(int j=0;j<str2.length();j++) {
//				if(str1.charAt(i)==str2.charAt(j)) {
//					result=true;
//					str2.setCharAt(j, '0');
//					break;
//				}
//				else {
//					result=false;
//				}
//			}
//			if(result==false) {
//				break;
//			}
//		}
//		System.out.println(result);
		String a="race";                                                                 //Approach 2
		String b="rate";
		int freqa[]=new int[256];
		int freqb[]=new int[256];
		boolean res=false;
		
		for(int i=0;i<a.length();i++) {
			int value=(int)a.charAt(i);
			freqa[value]++;
		}
		for(int j=0;j<b.length();j++) {
			int v=(int)b.charAt(j);
			freqb[v]++;
		}
		
		for(int i=0;i<freqa.length;i++) {
			if(freqa[i]==freqb[i]) {
				res=true;
			}
			else {
				res=false;
				break;
			}
		}
		
		System.out.println(res);
		
		
	}}