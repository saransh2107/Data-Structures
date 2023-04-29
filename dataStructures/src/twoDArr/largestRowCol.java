package twoDArr;

public class largestRowCol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][]= {{6,9,8,5},{9,2,4,1},{8,3,9,3},{8,7,8,6}};
		int row=mat.length;
		if(row==0){
			System.out.println("row 0 -2147483648");
			return;
		}
		int col=mat[0].length;
        int rowSum=0;
		int colSum=0;
		int maxRowSum=0;
		int rowIndex=0;
		int maxColSum=0;
		int colIndex=0;
		for(int i=0;i<row;i++)
		{
			rowSum=0;
			for(int j=0;j<col;j++)
			{
				rowSum=rowSum+mat[i][j];
			}
			if(rowSum>maxRowSum)
			{
				maxRowSum=rowSum;
				rowIndex=i;
			}
		}
		for(int p=0;p<col;p++)
		{
			colSum=0;
			for(int q=0;q<row;q++){
				colSum=colSum+mat[q][p];
			}
			//System.out.println("Column"+" "+p+" "+colSum);
			if(colSum>maxColSum){
				maxColSum=colSum;
				colIndex=p;

			}

		}
		if(maxRowSum>maxColSum){
			System.out.println("row"+" "+rowIndex+" "+maxRowSum);
		}
		else{
			System.out.println("column"+" "+colIndex+" "+maxColSum);
		}

	}

}
