package linkedList;

import java.util.Scanner;

public class AppendLastN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=optimiseInput();
		Node<Integer> result=appendList(head);
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
	public static Node<Integer> appendList(Node<Integer> head){   
		int n=3;
		Node<Integer> node=head,checkNode=null,newHead=null;
		if (n==0)                                //Checking for the 0th postion
		{
			return head;
		}

		int count=0;
		while(node!=null)
		{
			node=node.next;
			count=count+1;
		}
		if (count<n)
		{
			return head;
		}

		n=count-n;
		node=head;
		for (int i=0;i<n-1;i++)
		{
			node=node.next;
		}
		checkNode=node.next;
		node.next=null;
		newHead=checkNode;

		while(checkNode.next!=null)
		{
			checkNode=checkNode.next;
		}
		checkNode.next=head;
		head=newHead;
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
