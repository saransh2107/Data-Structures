package timeComplexity;

public class pairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,6,2,5,4,3,2,4};
		int sum=7;
		arr=sortArray(arr);
		int i=0,j=arr.length-1,count=0;
		while(i<j) {
			if(arr[i]+arr[j]<sum) {
				i++;
			}
			else if(arr[i]+arr[j]>sum) {
				j--;
			}
			else if(arr[i]+arr[j]==sum) {
				i++;
				j--;
				count++;
			}
		}
		System.out.println(count);
		

	}
	public static int[] sortArray(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				int temp=0;
				if(arr[j]>arr[j+1]) {
				    temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			
			}
		}
		return arr;
	}

}
