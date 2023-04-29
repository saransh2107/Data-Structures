package OOPS;
public class Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]= {1,94,93,9999,5,92,73};
//		List<Integer> list=Arrays.asList(1,5,92,4,78,6,7);
//		System.out.println(countConsecutive(list));
//		System.out.println(sumEvenFibonacci(20000));
//		System.out.println(compress("aabcca"));
//		System.out.println(countPrime(20));
//		String a="abc";
//		String b="abc";
//		System.out.println("a==b:"+a==b);
//	    final List<Integer> numbers=List.of(1,2,3,4,5);
		
	}
}
class One extends Thread{
	public void run() {
		for(int i=0;i<2;i++) {
			System.out.println(i);
		}
	}
}
class A{
	public A() {
		System.out.println("A");
	}
	public A(int i) {
		this();
		System.out.println(i);
	}
}
class B extends A{
	public B() {
		System.out.println("B");
	}
	public B(int i) {
		this();
		System.out.println(i+3);
	}
}
//public static int countPrime(int n) {
//
//int count=0;int c=0;
//for(int i=2;i<=n;i++) {
//	c=0;
//	for(int j=2;j<=i/2;j++) {
//		if(i%j==0) {
//			c=1;
//			break;
//		}
//	}
//	if(c==0) {
//		count++;
//	}
//}
//return count;
//}
//public static int countConsecutive(List<Integer> list) {
//boolean flag=false;
//int arr[]=new int[list.size()];
//for(int i=0;i<list.size();i++) {
//	arr[i]=list.get(i);
//}
//Arrays.sort(arr);
//int count=1;
//for(int i=0;i<arr.length;i++) {
//	if((i+1)<arr.length && arr[i]==(arr[i+1]-1)) {
//		flag=true;
//		count++;
//	}
//}
//if(arr[arr.length-2]==arr[arr.length-1]-1) {
//	count++;
//}
//if(flag==false) {
//	return -1;
//}
//return count;
//
//
//}
//public static int sumEvenFibonacci(int maxLimit) {
//int sum = 0;
//int num1 = 0;
//int num2 = 1;
//
//while (num2 <= maxLimit) {
//    if (num2 % 2 == 0) { // if current value is even
//        sum += num2;
//    }
//    int next = num1 + num2; // calculate the next value in the Fibonacci sequence
//    num1 = num2;
//    num2 = next;
//}
//
//return sum;
//}
//public static String compress(String str) {
//String ans="";
//int count=1;
//for(int i=0;i<str.length()-1;i++) {
//	if(str.charAt(i)==str.charAt(i+1)) {
//		count++;
//	}
//	else {
//		ans=ans+""+count+str.charAt(i);
//		count=1;
//	}
//}
//if(str.charAt(str.length()-1)==str.charAt(str.length()-2)) {
//	ans=ans+(count)+str.charAt(str.length()-1);				
//}
//else {
//	ans=ans+'1'+str.charAt(str.length()-1);
//}
//return ans;
//
//}


