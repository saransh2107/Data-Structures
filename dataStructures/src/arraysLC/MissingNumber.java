package arraysLC;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,3,4,5,9};
		System.out.println(missingNumber(arr));

	}
	 public static int missingNumber(int[] nums) {
		 int currentMax=0;
		 for(int i=0;i<nums.length;i++) {
			 currentMax=Math.max(currentMax, nums[i]);
		 }
		 for(int j=0;j<=currentMax;j++) {
			 if(nums[j]==j) {
				 
			 }
			 else {
				 return j;
			 }
		 }
		 return -1;
		 
	        
	    }

}
