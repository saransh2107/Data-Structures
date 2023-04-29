package linkedList;

import java.util.Scanner;

public class ReverseLLRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=optimiseInput();
		Node<Integer> result=reverseList(head);
		printNode(result);

	}
	public static Node<Integer> optimiseInput(){
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		//int count=0;
		Node<Integer> head=null,tail=null;
		while(data!=-1) {
			Node<Integer> currentNode=new Node<>(data);
			if(head==null) {
				head=currentNode;
				tail=currentNode;
			}
			else {
				tail.next=currentNode;
				tail=tail.next;
			}
			data=sc.nextInt();
		}
		sc.close();
		return head;
	}

	public static void printNode(Node<Integer> head) {
		if(head==null) {
			return;
		}
		System.out.print(head.data+" ");
		printNode(head.next);
	}

	public static Node<Integer> reverseList(Node<Integer> head){  //1 2 3 4 5
//		Node<Integer> prev = null;
//		Node<Integer> current = head;   
//		Node<Integer> next = null;
//		while (current != null) {
//			next = current.next;       
//			current.next = prev;       
//			prev = current;
//			current = next;
//		}
//		head = prev;
//		return head;
		//Reverse Through Recursion
		
		
		if (head == null || head.next == null) { return head; }
		Node<Integer> smallHead=reverseList(head.next);
		head.next.next=head;
		head.next=null;
		return smallHead;

	}
}
