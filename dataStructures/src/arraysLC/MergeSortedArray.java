package arraysLC;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num1= {1,2,3,0,0,0};
		int [] num2= {2,4,6};
		int n1=3;
		int n2=3;
		merge(num1,n1,num2,n2);

	}

	public static  void merge(int[] num1, int m, int[] num2, int n) {
		int []num3=new int[m+n];
	    int i=0,j=0,k=0;
	    while(i<m && j<n) {
	    	if(num1[i]<=num2[j]) {
	    		num3[k]=num1[i];
	    		i++;
	    		k++;
	    	}
	    	else {
	    		num3[k]=num2[j];
	    		j++;
	    		k++;
	    	}
	    }
	    while(i<m) {
	    	num3[k]=num1[i];
	    	i++;
	    	k++;
	    }
	    while(j<n) {
	    	num3[k]=num2[j];
	    	j++;
	    	k++;
	    }
	    System.out.println(i);
	    System.out.println(j);
	    for(int q=0;q<num1.length;q++) {
	    	num1[q]=num3[q];
	    }
	    print(num3);
	    print(num1);

	}
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
