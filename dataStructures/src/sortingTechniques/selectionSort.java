package sortingTechniques;

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,0,4,2,7,6};
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			int minIndex=i;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
					
				}
			}
		    temp=arr[i];
		    arr[i]=arr[minIndex];
		    arr[minIndex]=temp;
		
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
