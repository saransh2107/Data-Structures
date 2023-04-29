package timeComplexity;

public class arrIntersection {
	public static void main(String[]args) {
		int a[]= {2,6,1,2,3};  //{1,2,2,6,8,9}
		int b[]= {1,2,3,4,2};  //{2,3,6,8,9}
		a=sort(a);
		b=sort(b);
		int i=0;
		int j=0;
		while(i<a.length && j<b.length) {
			if(a[i]==b[j]) {
				System.out.print(a[i]+" ");
				i++;
				j++;
			}
			else if(a[i]<b[j]) {
				i++;
			}
			else {
				j++;
			}
		}
		
		
	}
	public static int[] sort(int arr[]) {
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
