package basicRecursion;

public class binarySearchRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,5,10,14};
		int x=14;
		int si=0;
		int ei=a.length-1;
		System.out.println(binarySearch(a,x,si,ei)+1);

	}
	public static int binarySearch(int a[],int x,int si,int ei) {
		if(si>ei) {
			return -1;
		}
		int mid=(si+ei)/2;
		if(x==a[mid]) {
			return mid;
		}
		else if(a[mid]<x) {
			return binarySearch(a,x,mid+1,ei);
		}
		else {
			return binarySearch(a,x,si,mid-1);
		}
	}

}
