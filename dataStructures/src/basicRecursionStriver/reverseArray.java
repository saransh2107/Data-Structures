package basicRecursionStriver;

import java.util.ArrayList;

public class reverseArray {
	 static ArrayList<Integer> marksReverse=new ArrayList<Integer>();
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks= {23,45,34,56};
		int length=marks.length;
		System.out.println(reversedArray(marks,length));
	}
	public static ArrayList<Integer> reversedArray(int[] m,int l) {
		if(l>0) {
			marksReverse.add(m[l-1]);
			reversedArray(m,l-1);
		}
		return marksReverse;
	}

}
