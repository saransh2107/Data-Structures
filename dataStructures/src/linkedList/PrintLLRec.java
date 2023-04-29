package linkedList;

import java.util.Scanner;

public class PrintLLRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> root=optimiseInput();
		printRecursive(root);

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
		printRecursive(head.next);
		System.out.print(head.data+" ");
	
	}
}
