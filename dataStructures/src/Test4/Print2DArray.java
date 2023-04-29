package Test4;

public class Print2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[][]= {{1,2,3},{4,5,6},{7,8,9}};
        int p=2*(n.length)-1;
		while(p>1)
		{
		for(int i=0;i<n.length;i++) {          //For row
			for(int j=0;j<n[0].length;j++) {   //For Col
				System.out.print(n[i][j]);
			}
			System.out.println();
			if(i==0 && p>n.length) {
				i--;
				p--;
			}
			else if(p>n.length-1 && i==1) {
				i--;
				p--;
			}
		}
		p--;
		}

	}

}
