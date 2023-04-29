package sortingTechniques;

public class rotateArrByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,1,2,6,7};
		int value=1;
		int d=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==value) {
				d=i;
			}
		}
		int temp=0;
		int result[]=new int[arr.length];
		for(int i=0;i<result.length;i++) {
			if(d<arr.length) {
			result[i]=arr[d];
			d++;
			}
			else {
				result[i]=arr[temp];
				temp++;
			}
			
		}
		printArray(result);

	}
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}


}
