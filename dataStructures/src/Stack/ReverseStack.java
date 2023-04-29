package Stack;

import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack=new Stack<Integer>();
		Stack<Integer> result=new Stack<Integer>();
		int arr[]= {2,4,6,10};
		for(int i=0;i<arr.length;i++) {
			stack.push(arr[i]);
		}
		reverseStack(stack,result);
		//We will use implicit stack:Recursion
	}
	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		//Your code goes here
		if(input.isEmpty()) {
			return;
		}
		int item=input.pop();
		reverseStack(input,extra);
	}

}
