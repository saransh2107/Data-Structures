package recursionAss;

public class GeometricSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		System.out.println(findGeometricSum(n));

	}
	public static double findGeometricSum(int k){
		// Write your code here
		if(k==0){
			return 1;
		}
		double small=1/Math.pow(2,k);
		System.out.println(small);
		double ans=small+findGeometricSum(k-1);
		return ans;

	}

}
