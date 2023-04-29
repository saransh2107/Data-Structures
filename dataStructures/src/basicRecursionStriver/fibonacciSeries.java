package basicRecursionStriver;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int fib[] = new int[n];
	    if (n == 0) {
	      System.out.println(0);
	    } 
	    else if(n==1) {
	    	fib[0]=1;
	    }
	    else {
	     
	      fib[0] = 1;
	      fib[1] = 1;
	      for (int i = 2; i < n; i++) {
	        fib[i] = fib[i - 1] + fib[i - 2];
	      }
	      System.out.println("The Fibonacci Series up to "+n+"th term:");
	      for (int i = 0; i < n; i++) {
	        System.out.print(fib[i] + " ");
	      }
	    }
	}

}
