package twoDArr;

public class boundariesSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int mat[][]= {{6,9,8,5},{9,2,4,1},{8,3,9,3},{8,7,8,6}};
		//int mat[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int mat[][]= {{6,9,8,5,9},{2,4,1,8,3},{9,3,8,7,8},{6,8,9,4,1},{1,7,6,1,5}};
		// 6 9 8 5
		// 9 2 4 1
		// 8 3 9 3
		// 8 7 8 6

		// 1 2 3
		// 4 5 6
		// 7 8 9

		//		6 9 8 5 9 
		//		2 4 1 8 3 
		//		9 3 8 7 8 
		//		6 8 9 4 1 
		//		1 7 6 1 5 


		// n=3 it is 11  n=5 it is 22
		// In 3*3 matrix it will create an error!  The diagonals!!!!!!!!!!!


		int row=mat.length;
		int col=mat[0].length;
		int rowSum=0;
		int colSum=0;
		int diagSum=0;
		int secondDSum=0;
		//Calculating the sum of first and last row and principal diagonal
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0 || i==mat.length-1)
					rowSum=rowSum+mat[i][j];
				else if(i==j) {
					diagSum=mat[i][j]+diagSum;
				}
			}

		}
		//Calculating the sum of first and last column
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				if(i==0 || i==col-1) {
					colSum=colSum+mat[j][i];
				}

			}
		}

		//Subtracting the elements which are added twice
		colSum=colSum-(mat[0][0]+mat[0][col-1]+mat[row-1][0]+mat[row-1][col-1]);


		//Calculating the sum of secondary diagonal
		int k = row - 1;  
		for (int i=0;i<row;i++)
		{ 
			secondDSum=mat[i][k--]+secondDSum;

		}
		// Only if matrix is of order odd.
		if(row%2!=0 && col%2!=0){
			secondDSum=secondDSum-(mat[0][col-1]+mat[row-1][0]+mat[row/2][col/2]);
		}
		else{
			secondDSum=secondDSum-(mat[0][col-1]+mat[row-1][0]);

		}
		int result=diagSum+secondDSum+colSum+rowSum;


		System.out.println("Row Sum: "+rowSum);
		System.out.println("Col Sum: "+colSum);
		System.out.println("Diagonal Sum: "+diagSum);
		System.out.println("Secondary Diagonal Sum: "+secondDSum);
		System.out.println("Total: "+result);


	}

}
