package arraysLC;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={0,1,0,3,12};
		int index=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=0){
				nums[index]=nums[i];
				index++;
			}
		}
		while(index<nums.length) {
			nums[index]=0;
			index++;
		}
		print(nums);

	}
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
