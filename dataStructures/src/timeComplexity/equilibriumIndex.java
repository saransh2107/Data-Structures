package timeComplexity;

public class equilibriumIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,10,-10,4,2,9};
		for(int i=0;i<arr.length;i++) {
			int sum1=0,sum2=0,count=0,count2=i+1;
			while(count<i) {
				sum1=sum1+arr[count];
				count++;
			}
			while(count2<arr.length) {
				sum2=sum2+arr[count2];
				count2++;
			}
			if(sum1==sum2) {
				System.out.println(i);
				break;
			}
		}
	}
}
