package arraysLC;
import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,2,1,2,2,2,1,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4};
		System.out.println(majorityElement(a));

	}
	 public static int majorityElement(int[] nums) {
		 Arrays.sort(nums);
		 int maxCount=0;
		 int maxIndex=0;
		 int index=0;
		 for(int i=0;i<nums.length;i++) {
			 int count=0;
			 for(int j=1;j<nums.length;j++) {
				 if(nums[i]==nums[j]) {
					 count++;
					 index=j;
				 }
			 }
			 if(count>maxCount) {
				 maxCount=count;
				 maxIndex=index;
			 }
				
			 }
		 return nums[maxIndex];
		 }

}
