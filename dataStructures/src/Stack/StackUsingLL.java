package Stack;

public class StackUsingLL {
	
	private Node<Integer> head;
	private int size;
	
	StackUsingLL(){
		head=null;
		size=0;
	}
	
	public void push(int data) {
		Node<Integer> currentNode=new Node<Integer>(data);
		if(head==null) {
			head=currentNode;
			
		}
		else {
			currentNode.next=head;
			head=currentNode;
		}
		size=size+1;
	}
	public int top() throws StackEmptyException {
		if(head==null) {
			return -1;
		}
		else {
			return head.data;
		}
	}
	public int size() {
		return size;
	}
	public void pop() throws StackEmptyException {
		if(head==null) {
			size=0;
			
		}
//		int count=0;
//		while(temp!=null) {
//			count++;
//			if(count==size()-1) {
//				System.out.println(temp.data);
//				temp.next=null;
//				size=size-1;
//			}
//			temp=temp.next;
		else {
		head=head.next;
		size=size-1;
		}
			
		}
	
	public boolean isEmpty() {
		if(size()==0) {
			return true;
		}
		else {
			return false;
		}
	}

}
