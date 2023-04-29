package Stack;

public class StackArrayUse {
	private int data[];
	private int topIndex=-1; //Index of topmost element of stack
	StackArrayUse(){
		data=new int[10];
	}

	public void push(int element) throws StackFullException {
		// TODO Auto-generated method stub
		//If stack is full
		
		if(topIndex==data.length-1) {
			//StackFullException s=new StackFullException();
			throw new StackFullException();
		}
		
		this.data[++topIndex]=element;
		
	}

	public int pop() throws StackEmptyException {
		// TODO Auto-generated method stub
		if(topIndex==-1) {
			throw new StackEmptyException();
		}
		int x=data[topIndex];
		topIndex=topIndex-1;
		return x;
	}

	public int size() {
		// TODO Auto-generated method stub
		return topIndex+1;
		
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(topIndex==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	public int top() throws StackEmptyException {
		if(topIndex!=-1) {
		return data[topIndex];
		}
		else {
			throw new StackEmptyException();
		}
	}

}
