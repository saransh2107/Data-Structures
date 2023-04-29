package sortingTechniques;

public class addTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {6,2,5};
		int arr2[]= {1,5,6};
        int nc;
        if(arr1.length > arr2.length){
            nc = arr1.length + 1;
        }else{
            nc = arr2.length + 1;
        }
        int[] c = new int[nc];
        int sum = 0;
        int carry = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = nc - 1;
        while(i >= 0 && j>=0){
            sum  = arr1[i] + arr2[j] + carry;
            i--;
            j--;
            c[k] = sum % 10;
            sum = sum / 10;
            carry = sum % 10;
            k--;        
        }//end of while loop

        while(i >= 0){          //n2 has exhausted
            sum  = arr1[i] + carry;
            c[k] = sum % 10;
            sum = sum / 10;
            carry = sum % 10;
            i--;
            k--;
        }

        while(j >= 0){        //n1 has exhausted  
            sum  = arr2[j] + carry;
            c[k] = sum % 10;
            sum = sum / 10;
            carry = sum % 10;
            k--;        
            j--;
        }
        c[k] = carry;
		printArray(c);
		
		

	}
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
