package sortingTechniques;

public class mergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,3,5,8,10};
		int arr2[]= {2,4,7};
		int l=arr1.length+arr2.length;
        int arr3[]=new int[l];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length)
        {
        	
                if((arr1[i]<=arr2[j]) || (j>=arr2.length)){
                    arr3[k]=arr1[i];
                    i++;
                    k++;
                }
                else{
                    arr3[k]=arr2[j];
                    j++;
                    k++;
                }
            
        }
        while(i<arr1.length) {
        	arr3[k]=arr1[i];
        	k++;
        	i++;
        }
        while(j<arr2.length) {
        	arr3[k]=arr2[j];
        	k++;
        	j++;
        }
        //System.out.println(i+" "+j);
       // System.out.println(arr2.length);
        printArray(arr3);

	}
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
