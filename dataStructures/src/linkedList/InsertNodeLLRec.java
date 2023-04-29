package linkedList;

import java.util.Scanner;

public class InsertNodeLLRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=optimiseInput();
		Node<Integer> result=insertNode(head,10,5);
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

	public static Node<Integer> insertNode(Node<Integer> head,int data,int pos){
		if(head==null && pos>0) {
			return head;
		}
		Node<Integer> newNode=new Node<Integer>(data);
		if(pos==0) {
			newNode.next=head;
			head=newNode;
			return newNode;
		}
		else {
			head.next=insertNode(head.next,data,pos-1);
			return head;
		}
		
//		while(temp!=null) {
//			if(pos-1==count) {
//				newNode.next=temp.next;
//				temp.next=newNode;
//			}
//			
//			System.out.println(count+" "+temp.data);
//			count++;
//			temp=temp.next;
//		}
		
	}
	public static void printNode(Node<Integer> head) {
		if(head==null) {
			return;
		}
		System.out.print(head.data+" ");
		printNode(head.next);
	}
}
