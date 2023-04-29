package linkedList;

public class PrintithNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=createLinkedList();
		printIthNode(head,3);

	}
	public static Node<Integer> createLinkedList() {
		Node<Integer> n1=new Node<>(18);
		Node<Integer> n2=new Node<>(24);
		Node<Integer> n3=new Node<>(9);
		Node<Integer> n4=new Node<>(10);
		Node<Integer> n5=new Node<>(15);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		return n1; 
	}
	public static void printIthNode(Node<Integer> head, int i){
		//Your code goes here
		int count=-1;
		Node<Integer> temp=head;
		while(temp!=null){
			++count;
			if(count==i){
				System.out.println(temp.data);
				break;
			}
			temp=temp.next;
		}
	}
	

}
