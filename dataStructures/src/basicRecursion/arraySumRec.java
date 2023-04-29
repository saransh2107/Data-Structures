package basicRecursion;

public class arraySumRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,23,2,3,1};
		//System.out.println(arrSum(a,a.length));
		System.out.println(arraySum(a));

	}
//	public static int arrSum(int a[],int N) {           //Copied From GFG
//		if (N <= 0)
//			return 0;
//		return (arrSum(a, N - 1) + a[N - 1]);
//	    
//	}
	public static int arraySum(int input[]) {
		if (input.length==1)
        {
            return input[0];
        }
        
        int[] smallOutput = new int[input.length-1];
        for (int i=0;i<input.length-1;i++)
        {
            smallOutput[i]=input[i];
        }
        
        int output=input[input.length-1]+arraySum(smallOutput);
        return output;
	}

}
