package linkedList;

import java.util.Scanner;

public class OddAfterEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=optimiseInput();
		Node<Integer> result=evenAfterOdd(head);
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
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	public static Node<Integer> evenAfterOdd(Node<Integer> head) {
		Node<Integer> temp=head;
		Node<Integer> oddHead=null;
		Node<Integer> oddTail=null;
		while(temp!=null) {
		int x=temp.data; 
		if(x%2!=0) 
		{
		Node<Integer> currentNode=new Node<Integer>(x);	
		if(oddHead==null) {
			oddHead=currentNode;
			oddTail=currentNode;
		}
		else {
			oddTail.next=currentNode;
			oddTail=oddTail.next;
		}
		temp=temp.next;
		}
		else {
		temp=temp.next;
		}
		}
		while(head!=null) {
			int x=head.data;
			if(head.data%2==0) {
				Node<Integer> currentNode=new Node<Integer>(x);
				if(oddHead==null) {
					oddHead=currentNode;
					oddTail=currentNode;
				}
				oddTail.next=currentNode;
				oddTail=oddTail.next;
				head=head.next;
			}
			else {
			head=head.next;
			}
		}
		return oddHead;
	}

}
