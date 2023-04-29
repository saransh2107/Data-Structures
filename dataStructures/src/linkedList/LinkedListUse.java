package linkedList;
public class LinkedListUse {

	public static Node<Integer> createLinkedList() {
		Node<Integer> n1=new Node<>(10);
		Node<Integer> n2=new Node<>(20);
		Node<Integer> n3=new Node<>(30);
		Node<Integer> n4=new Node<>(-1);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		return n1; 
	}
	public static void printLinkedList(Node<Integer> head) {
		int count=0;
		Node<Integer> temp=head; //By this head will stay at first position only!
		while(temp.data!=-1){
			count++;
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
		System.out.println();
		System.out.println("Length of Linked List: "+count);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Node n1;     -- This is only a reference
		//		Node<Integer> n1=new Node<>(10); --This will create a new node
		//		System.out.println(n1);//n1 is having the address of the first node
		//		System.out.println(n1.data);
		//		System.out.println(n1.next);

		Node<Integer> head=createLinkedList();
		printLinkedList(head);
		//printLinkedList(head.next);//start printing from the 2nd node;

	}

}
