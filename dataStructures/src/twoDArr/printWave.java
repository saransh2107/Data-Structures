package twoDArr;

public class printWave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][]= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int row=mat.length;
		int col=mat[0].length;
		
		// 1 2 3
		// 4 5 6
		// 7 8 9
		// 10 11 12
		int temp=row-1;
		
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				
				//System.out.print(i+""+j+" ");
			//	System.out.print(j+""+i+" ");
			if(i%2!=0) {
				System.out.print(mat[temp][i]);
				temp--;
			}
			else {
			System.out.print(mat[j][i]);
			}
			}
			//System.out.println();
		}

	}

}
