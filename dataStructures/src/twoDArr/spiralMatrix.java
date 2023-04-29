package twoDArr;

public class spiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][]= {{1,2,3},{4,5,6},{7,8,9}};
		//  1 2 3 4
		//  5 6 7 8
		//  9 10 11 12
		//  13 14 15 16
		 int rows = mat.length; //gives the total length of rows
	        if(rows == 0){
	            return;
	        }
	        int cols = mat[0].length;
	        int i, rowStart=0, colStart=0;
	        int numberOfElements = rows*cols, count = 0;
	        while(count<numberOfElements){
	            //Section 1
	            for(i=colStart;count<numberOfElements && i<cols;i++){
	                System.out.print(mat[rowStart][i]+ " ");
	                count++; //always increase count when you print one element.
	            }
	            rowStart++;

	            //Section 2
	            for(i=rowStart;count<numberOfElements && i<rows;i++){
	                System.out.print(mat[i][cols-1]+ " ");
	                count++;
	            }
	            cols--;

	            //Section 3
	            for(i=cols-1;count<numberOfElements && i>=colStart;i--){
	                System.out.print(mat[rows-1][i]+ " ");
	                count++;
	            }
	            rows--;

	            //Section 4
	            for(i=rows-1;count<numberOfElements && i>=rowStart;i--){
	                System.out.print(mat[i][colStart]+ " ");
	                count++;
	            }
	            colStart++;
	        }
		
		
		
		
	}

}
