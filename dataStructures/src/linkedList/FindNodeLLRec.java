package linkedList;

import java.util.Scanner;

public class FindNodeLLRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data=3;
		Node<Integer> head=input();
		//print(head);
		System.out.println(findNodeRec(head,data));

	}
	public static int findNodeRec(Node<Integer> head, int data) {
//		int count=0;
//		while(head.next!=null) {
//			if(head.data==data) {
//				return count;
//			}
//			count++;
//			head=head.next;
//		}
//		return -1

		// Recursive Approach
		
		
		if(head.data==data) {
			return 0;
		}
		if(head.data==null) {
			return -1;
		}
		int smallAns=findNodeRec(head.next,data);
		if(smallAns==-1) {
			return -1;
		}
		return smallAns+1;
	}
	public static Node<Integer> input(){
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		Node<Integer> head=null;
		Node<Integer> tail=null;
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
	public static void print(Node<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}

}
