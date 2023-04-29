package linkedList;

import java.util.Scanner;

public class LinkedListInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=optimiseInput();
		printLL(head);
	}
	public static Node<Integer> optimiseInput(){
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		Node<Integer> head=null,tail=null;
		while(data!=-1) {
			Node<Integer> currentNode=new Node<>(data);
			data=sc.nextInt();
			if(head==null) {
				head=currentNode;
				tail=currentNode;
			}
			else {
				tail.next=currentNode;
				tail=tail.next;
			}
		}
		sc.close();
		return head;
	}
	
	public static Node<Integer> takeInput(){
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		Node<Integer> head=null;                             //Set the reference of head to null
		while(data!=-1) {                                    //Take the input till the data is not equal to -1
			Node<Integer> currentNode=new Node<>(data);      
			if(head==null) {
				//make this node as head node
				head=currentNode;
			}
			else {
				Node<Integer> tail=head;
				while(tail.next!=null) {
					tail=tail.next;
				}
				//Now tail will refer to last node
				//Connect current node after last node
				tail.next=currentNode;
			}
			data=sc.nextInt();
		}
		sc.close();
		return head;
	}
	public static void printLL(Node<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}

	public static void printLinkedList(Node<Integer> head,int pos) {
		int count=0;
		Node<Integer> temp=head; //By this head will stay at first position only!
		while(temp!=null){
			count++;
			if(count>=pos) {
			System.out.print(temp.data +" ");
			}
			else {
				
			}
			temp = temp.next;

		}

	}

}
