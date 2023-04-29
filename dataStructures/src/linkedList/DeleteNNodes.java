package linkedList;

import java.util.Scanner;

public class DeleteNNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=input();
		print(head);

	}
	// 10>20>30>40>50>60>70>80>90
	
	//M=2
	//N=3
	
	
	
	public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
		//Your code goes here
		return head;
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
