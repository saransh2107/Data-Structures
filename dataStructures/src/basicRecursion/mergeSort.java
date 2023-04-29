package basicRecursion;

public class mergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,1,5,0,3};
		mergeSorting(a);
		for(int z=0;z<a.length;z++) {
        	System.out.print(a[z]+" ");
        }
        System.out.println();

	}

	public static void mergeSorting(int[] input){
		if(input.length <=1){
            return;
        }
        int mid = input.length / 2;
        int part1[] = new int[mid];
        int part2[] = new int[input.length - mid];
        for(int i=0; i<mid;i++){
            part1[i] = input[i];
        }
        int k=0;
        for(int i=mid;i<input.length;i++){
            part2[k] = input[i];
            k++;
        }
        mergeSorting(part1);
        mergeSorting(part2);
        merge(part1, part2, input);
        
        
	}
	public static void merge(int[] input1, int input2[], int[] output){
        int i=0, j=0, k=0;
        while(i < input1.length && j < input2.length){
            if(input1[i] < input2[j]){
                output[k] = input1[i];
                k++;
                i++;
            }
            else{
                output[k] = input2[j];
                j++;
                k++;
            }
        }
        while(i < input1.length){
            output[k] = input1[i];
            k++;
            i++;
        }
        while(j < input2.length){
            output[k] = input2[j];
            j++;
            k++;
            
        }
       
    }

}
