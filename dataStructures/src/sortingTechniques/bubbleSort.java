package sortingTechniques;

public class bubbleSort {
	public static void main(String[] args) {
		int arr[]= {5,1,4,2,8};
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
		printArray(arr);
	
	}
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
