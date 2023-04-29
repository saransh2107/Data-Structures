package arraysLC;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,5,6,9};
		int s=4;
		System.out.println(searchInsert(arr,s));

	}
	
	 public static int searchInsert(int[] nums, int target) {
		 int x=0;
		 int l=nums.length-1;
	   	 int result=binarySearch(nums,x,l,target);
		 return result;
	        
	    }
	 public static int binarySearch(int nums[],int s,int l,int target) {
		 int mid=0;
		 while(l>=s) {
		 mid=(s+l)/2;
		 if(nums[mid]==target) {
			 return mid;
		 }
		 
		 if(target>nums[mid]) {
			return binarySearch(nums,s+1,l,target);
		 }
		 else{
			 return binarySearch(nums,s,l-1,target);
		 }
		 }
		 return l+1;
	 }
	 public static void print(int arr[]) {
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
		 }
	 }


}
