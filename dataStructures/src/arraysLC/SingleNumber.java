package arraysLC;
import java.util.Arrays;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,2,1};
		System.out.println(singleCount(arr));

	}
	public static int singleCount(int[]arr) {
		Arrays.sort(arr);
		print(arr);
		for(int i=0;i<arr.length;i+=2) {
			if(i+1<arr.length && arr[i]!=arr[i+1]) {
				System.out.println(arr[i]+" "+arr[i+1]);
				return arr[i];
			}
		}
		return arr[arr.length-1];
		
	}
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
