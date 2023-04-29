package Stack;

import java.util.Stack;

public class RedundantBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expression="((x*y))";
		Stack<Character> stack=new Stack<>();
		int count=0;
		for(int i=0;i<expression.length();i++) {
			if(expression.charAt(i)=='(') {
				stack.push(expression.charAt(i));
			}
			else if(expression.charAt(i)==')') {
				if(count>0) {
					stack.pop();
					count=0;
				}
				else {
					stack.push(expression.charAt(i));
				}
			}
			else {
				count++;
			}
		}
		if(stack.empty()==true) {
			System.out.println("False");
		}
		else {
			System.out.println("True");
		}
		

	}

}
