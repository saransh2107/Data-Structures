package basicRecursion;

public class RemoveDuplicateStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aabbccd";
		//        0123456
		System.out.println(removeConsecutiveDuplicates(s));

	}
	public static  String removeConsecutiveDuplicates(String s) {
		// Write your code here         s=aabc     length=4
		if(s.length() == 1) {   
			System.out.println("First Return: "+s);   //d
            return s;
        }
        String smallOutput = removeConsecutiveDuplicates(s.substring(1));  //smallOutput=d  cd cd  bcd  bcd  abcd
                                                           //abbccd
                                                           //bbccd
                                                           //bccd
                                                           //ccd
                                                           //cd
                                                           //d
        if(s.charAt(0) == s.charAt(1)) 
        {
        	System.out.println(s.charAt(0)+" "+s.charAt(1));
        	System.out.println(smallOutput);
            return smallOutput;
        }
        else
        {
        	System.out.println(s.charAt(0)+smallOutput);
            return s.charAt(0) + smallOutput;
        }

	}

}
