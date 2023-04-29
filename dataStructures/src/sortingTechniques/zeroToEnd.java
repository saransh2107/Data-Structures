package sortingTechniques;

public class zeroToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,0,2,3,0,2,0};
		int l=arr.length-1;
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			temp=0;
			if(arr[i]==0 && arr[l]!=0) {
				temp=arr[i];
				arr[i]=arr[l];
				arr[l]=temp;
				l--;
			}
			else if(arr[i]==0 && arr[l]==0) {
				//System.out.println(i);
				while(arr[l]==0) {
					l--;
				}
				//System.out.println(l);
				temp=arr[i];
				arr[i]=arr[l];
				arr[l]=temp;
				l--;
				printArray(arr);
			}
			}
		//printArray(arr);
		}

	
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
