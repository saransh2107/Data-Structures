package Stack;

public class StackUseLL {

	public static void main(String[] args) throws StackEmptyException {
		// TODO Auto-generated method stub
		StackUsingLL stack=new StackUsingLL();
		stack.push(2);
		stack.push(4);
		stack.push(7);
		stack.push(9);
		stack.pop();
		System.out.println("Stack Top: "+stack.top());
		System.out.println("Stack Size: "+stack.size());
		System.out.println("Stack Empty: "+stack.isEmpty());
		

	}

}
