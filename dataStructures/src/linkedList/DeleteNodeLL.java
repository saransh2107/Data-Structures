package linkedList;

import java.util.Scanner;

public class DeleteNodeLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=optimiseInput();
		Node<Integer> result=deleteNode(head,3);
		printLinkedList(result);

	}

	public static Node<Integer> deleteNode(Node<Integer> head,int pos){
		if(pos==0) {                                              //If pos is 0 then head will point to head.next
			return head.next;                                     //If pos is greater than 0 and less than linked list length then temp.next 
			                                                       //will point to temp.next.next;
		} 
		int length=length(head);    
		System.out.println(length);                                      //What if the pos is last then what will happen?
		if(pos>=length) {
			return head;
		}
		Node<Integer> temp=head;
		int count=0;

		while(temp!=null) {
			count++;
			if(pos==count) {
				temp.next=temp.next.next;
			}
			temp=temp.next;
		}
		return head;
	}


	public static Node<Integer> optimiseInput(){
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
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
	public static void printLinkedList(Node<Integer> head) {
		Node<Integer> temp=head; //By this head will stay at first position only!
		while(temp!=null){
			System.out.print(temp.data +" ");
			temp = temp.next;

		}

	}
	public static int length(Node<Integer> head) {
		int count=0;
		while(head!=null) {
			count++;
			head=head.next;
		}
		return count;
	}
}
