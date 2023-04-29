package basicRecursionStriver;

public class palindromeString {
    static int counter=0;
    static String rev="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="madam";
        String x=S;
        String reverse=reverseString(S);
        if(x.equals(reverse)){
            System.out.println("Yes");
        }
        else {
        System.out.println("No");
        }
        }
    public static String reverseString(String S) {
    	if(S.length()>counter) {
    		char c=S.charAt(counter);
    		rev=c+rev;
    		counter++;
    		reverseString(S);
    	}
    	return rev;
    }
	}


