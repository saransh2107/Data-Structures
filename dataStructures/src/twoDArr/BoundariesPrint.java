package twoDArr;

public class BoundariesPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 2 3 
		// 4 5 6
		// 7 8 9
		
		int mat[][]= {{1,2,3},{4,5,6},{7,8,9}};  
	//	int mat[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};  
		int row=mat.length;
		int col=mat[0].length;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0 || j==col-1) {
					System.out.print(mat[i][j]+" ");
				}
				if(i==row-1 || j==0) {
					if(mat[i][j]!=mat[row-1][col-1] && mat[i][j]!=mat[0][0]) {
					System.out.print(mat[i][j]+" ");
					}
				}
			}
		}

	}

}
