package linkedList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrrayListDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(3);
		arr.add(7);
		arr.add(8);
		arr.add(9);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		Collections.sort(arr);
		
		for(int i=0;i<arr.size();i++) {
			if(i+1<arr.size() && arr.get(i)==arr.get(i+1)) {
				arr.remove(i+1);
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
