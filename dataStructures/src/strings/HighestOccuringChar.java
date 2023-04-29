package strings;

public class HighestOccuringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaabbbbccccccccccccccddddd";
//		int count=0;
//		int maxCount=0;
//		char m=' ';
//		for(int i=0;i<str.length();i++) {
//			count=0;
//			if(str.charAt(i)!=m) {
//			for(int j=0;j<str.length();j++) {
//				if(str.charAt(j)==str.charAt(i)) {
//					count++;
//				}
//			}
//			}
//			if(count>maxCount) {
//				maxCount=count;
//				m=str.charAt(i);
//			
//			
//			}
//			
//		}
//		System.out.println(m);
		
		
		//Second Approach
		
		
		int freq[]=new int[256];
		for(int i=0;i<str.length();i++) {
			int value=(int)str.charAt(i);
			freq[value]++;
		}
		int max=0,index=0;
		for(int i=95;i<freq.length;i++) {
			if(freq[i]>max) {
				max=freq[i];
				index=i;
			}
		}
        char c=(char)index;
        System.out.println(c);
		
		
		

	}

}
