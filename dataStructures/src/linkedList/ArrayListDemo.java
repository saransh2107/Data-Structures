package linkedList;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String args[]) {
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(5);
		arr.add(2);
		arr.add(3);
		arr.add(2);
//		Integer i=2;
//		arr.remove(i);  //Remove the element
//		arr.set(0, 9);  //To update the value
//		System.out.println(arr.size());
//		for(int i=0;i<arr.size();i++) {
//			System.out.print(arr.get(i)+" ");
//		}
		
        //Emhanced For Loop-For each loop
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
