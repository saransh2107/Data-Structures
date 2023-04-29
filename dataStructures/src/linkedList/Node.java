package linkedList;

public class Node<T> {
	
	T data;             //value store in linked list where T is the type of data
	Node<T> next;
	
	Node(T data){
		this.data=data;
		//next=null;       //The default value of next will be null. Default value of any reference in an object is null
		//(Not required to write it)
	}


}
