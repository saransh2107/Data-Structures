package basicRecursion;

public class sortArrayCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,4,7,3};
	    System.out.println(checkSort(a));

	}
	public static boolean checkSort(int a[]) {
		if(a.length==1) {
			return true;
		}
		if(a[0]>a[1]) {
			return false;
		}
		int smallArray[]=new int[a.length-1];
		for(int i=1;i<a.length-1;i++) {
			smallArray[i-1]=a[i];
		}
		boolean result=checkSort(smallArray);
		return result;
	}

}
