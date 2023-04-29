package linkedList;

import java.util.Scanner;

public class MidPointLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=optimiseInput();
		System.out.println(middleElement(head));

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
		//System.out.println(count);
		sc.close();
		return head;
	}
	public static int middleElement(Node<Integer> head) {
		
		int m=linkedlistLength(head);
		if(m%2==0) {
			m=m/2;
			m=m-1;
		}
		else {
			m=m/2;
		}
		int count=0;
		while(head!=null) {
			if(count==m) {
				return head.data;
			}
			count++;
			head=head.next;
		}
		return m;
		
	}
	public static int linkedlistLength(Node<Integer> head) {
		int count=0;
		while(head!=null) {
			count++;
			head=head.next;
		}
		return count;
	}

}
