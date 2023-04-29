package Stack;

import java.util.Stack;

public class BracketsBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> s=new Stack<Character>();
		String expression=")()()(";
		for(int i=0;i<expression.length();i++) {
			//System.out.println(expression.charAt(i));
			if(expression.charAt(i)==('(')) {
				s.push(expression.charAt(i));
			}
			else if(expression.charAt(i)==(')') && s.isEmpty()==false) {
				s.pop();
			}
		}
		System.out.println(s.empty());
		
		

	}

}
