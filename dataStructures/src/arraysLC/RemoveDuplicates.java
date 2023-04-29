package arraysLC;

import java.util.Arrays;

/*
 Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
 The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 Consider the number of unique elements of nums be k, to get accepted, you need to do the following things:

 Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially.
 The remaining elements of nums are not important as well as the size of nums.
 Return k.
 
 Input={1,1,2}
 Output={1,2} 2 where 2 is the number of elements.
 
 */
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]= {0,0,0,0,1,1,1,2,2,2,2,2,3};          //Arrays is sorted in non decreasing order!
		int a[]= {1,2,5,1,2,7,8,9}; // if array is unsorted then you must sort it before applying this method.
		Arrays.sort(a);
		System.out.println(removeDuplicates(a));
		print(a);
		
		
	}
	//This approach is succesful because array is already sorted in ascending order
	 public static int removeDuplicates(int[] nums) {
	        if(nums.length==0){
	            return 0;
	        }
	        int i=0; //Index to shift the element at start when they are not consecutive duplicates
	        for(int j=1;j<nums.length;j++){
	            if(nums[j]!=nums[i]){
	                i++;
	                nums[i]=nums[j];             //Shifted all the unique elements at starting
	            }
	        }
	        return i+1;
	    }
	 public static void print(int arr[]) {
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
		 }
	 }

}
