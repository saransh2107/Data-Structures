package sortingTechniques;

public class rotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,6,11,12,17};
		int d=4;
		int temp=0;
		int result[]=new int[arr.length];
		//System.out.println(result[0]);
		for(int i=0;i<arr.length;i++) {
			if(d<arr.length) {
			result[i]=arr[d];
			d++;
			}
			else {
				result[i]=arr[temp];
				temp++;
			}
		}
		for(int i=0;i<result.length;i++) {
			arr[i]=result[i];
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
