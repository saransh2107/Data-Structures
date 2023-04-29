package arraysLC;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9};
		int re[]=plusOne(arr);
		print(re);
	}
	public static int[] plusOne(int[] digits) {
//		if(digits.length==1 && digits[0]>=9) {            // Checking the array for {9};
//			int re[]=new int[digits.length+1];            //{9,8,9}={9,9,0}
//			int sum=digits[0]+1;
//			re[0]=sum/10;
//			re[1]=sum%10;
//			return re;
//		}
		int pdig[];
		boolean res=false;
		for(int i=0;i<digits.length;i++) {               // Checking if all the elements are greater than or equal to 9
			if(digits[i]<9) {
				res=true;
				break;
			}
		}
		if(res==false) {
		 pdig=new int[digits.length+1];                // If yes then the array length will be +1; {9,9}={1,0,0} 
		}
		else {
			 pdig=new int[digits.length];             // if not then array length will be same ; {8,9} ={9,0};
		}
		int carry=0,sum=0;
		
		digits[digits.length-1]=digits[digits.length-1]+1;   // Adding +1 to the last index of the array!
		if(digits[digits.length-1]>9)                         // if the last index is greater than 10 after adding the perform carry operation
		{	
			for(int i=digits.length-1;i>=0;i--) { //{8,9,9,9}
				sum=digits[i]+carry;   //sum=10 10
				carry=0;
				if(sum>=10) {    
				carry=sum/10;    //carry=1    0      
				pdig[i]=sum%10; 
				//System.out.println("Sum: "+sum  +"Carry: "+carry +"Index: "+i);
				}                          //{,0}
				else {
				pdig[i]=sum%10;  
				}                       //{,0}
			}
		
			if(pdig.length>digits.length) {
				pdig[0]=1;
			}
			return pdig;
		}
		else {
			return digits;                    // If not then simply return the array
		}
	}
	//	 public static int[] plusOne(int[] digits) {  
	//		 if(digits[digits.length-1]>=9) {
	//			int newDig[]=new int[digits.length+1]; 
	//			int sum=digits[digits.length-1]+1;
	//			for(int i=0;i<digits.length-1;i++) {
	//				newDig[i]=digits[i];
	//			}
	//			newDig[newDig.length-2]=sum/10;
	//			newDig[newDig.length-1]=sum%10;
	//			return newDig;
	//		 }
	//		 else {
	//			 digits[digits.length-1]=digits[digits.length-1]+1;
	//			 return digits;
	//		 }
	//		
	//	  }
	//	public static int[] plusOne(int[] digits) {
	//		int sum=0;
	//		int index=0;
	//		int re[]=new int[digits.length+1];
	//		for(int i=0;i<digits.length;i++) {
	//			if(digits[i]>=9) {
	//				sum=digits[i]+1;
	//				re[index]=sum/10;
	//				re[index+1]=sum%10;
	//				return re;
	//			}
	//			else {
	//				re[index]=digits[i];
	//				index++;
	//			}
	//		}
	//		digits[digits.length-1]=digits[digits.length-1]+1;
	//		return digits;

	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
