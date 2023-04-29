package linkedList;
import java.util.Scanner;

public class PrintReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=optimiseInput();
		printLinkedList(head);

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
	public static void printLinkedList(Node<Integer> root) {
//		ArrayList<Integer> arr=new ArrayList<>();
//		Node<Integer> temp=head; //By this head will stay at first position only!
//		while(temp!=null){
//			arr.add(temp.data);
//			System.out.print(temp.data +" ");
//			temp = temp.next;
//		}
//		System.out.println();
//		for(int i=arr.size()-1;i>=0;i--) {
//			System.out.print(arr.get(i)+" ");
//		}
		if(root==null){
			return;
		}
		printLinkedList(root.next);
		System.out.print(root.data+" ");

	}

}
