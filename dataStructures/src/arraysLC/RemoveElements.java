package arraysLC;

public class RemoveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,1,5,3,1};
		int x=3;
		System.out.println(remove(arr,x));
		print(arr);
		
		

	}
	public static int remove(int arr[],int x) {
		int i=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]!=x) {
				arr[i]=arr[j];
				i++;
				
			}
		}
		return i;
		
	}
	 public static void print(int arr[]) {
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
		 }
	 }

}
