package linkedList;

import java.util.Scanner;

public class DeleteNodeRecLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=optimiseInput();
		Node<Integer> result=deleteNode(head,2);
		printRecursive(result);

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

	public static void printRecursive(Node<Integer> head) {

		if(head==null) {
			return;
		}
		System.out.print(head.data+" ");
		printRecursive(head.next);
		
	
	}
	
	public static Node<Integer> deleteNode(Node<Integer> head,int pos){ 
		int len=countLength(head);
		if(pos>=len) {
			return head;
		}
		Node<Integer> temp=head;
		int count=0;
		if(count==pos) {
			head=temp.next;
			return head;
		}
		else {
			head.next=deleteNode(head.next,pos-1);
			return head;
		}
		
		
//		while(temp!=null) {
//			if(pos-1==count) {
//				temp.next=temp.next.next;
//			}
//			count++;
//			temp=temp.next;
//		}
//		return head;
	}
	public static int countLength(Node<Integer> head) {
		int count=0;
		while(head!=null) {
			count++;
			head=head.next;
		}
		return count;
	}
}
