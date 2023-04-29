package linkedList;

import java.util.Scanner;

public class InsertNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=optimiseInput();
		Node<Integer> result=insertNode(head,10,0);
		printLinkedList(result);

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
	public static Node<Integer> insertNode(Node<Integer> head,int data,int pos){
		Node<Integer> temp=head;
		int count=0;
		Node<Integer> currentNode=new Node<>(data);
		if(pos==0) {
			currentNode.next=head;
			head=currentNode;
			return currentNode;
		}

		while(temp!=null) {
			++count;
			if(count==pos) {
				currentNode.next=temp.next;
				temp.next=currentNode;
			}
		
			temp=temp.next;
		}
		return head;
	}
	public static void printLinkedList(Node<Integer> head) {
		Node<Integer> temp=head; //By this head will stay at first position only!
		while(temp!=null){
			System.out.print(temp.data +" ");
			temp = temp.next;

		}

	}

}
