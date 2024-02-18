import java.util.*;
public class nQueensProblem{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the board size n:");
		int n=s.nextInt();
		char[][] board=new char[n][n];
		for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
		board[i][j]=s.next().charAt(0);
		}	
		}
		nQueens(board,0,n);
	}
	public static void printBoard(char board[][],int n){
		System.out.println("--------------board-------------");
		for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
		System.out.print(board[i][j]+" ");
		}
		System.out.println();
		}
	}
	public static boolean isSafe(char board[][],int row,int col){
		//virtical up
		for(int i=row-1;i>=0;i--){
			if(board[i][col]=='Q')
				return false;
		}
		//dig left up
		for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
		if(board[i][j]=='Q')
		return false;
		}
		//dig right up
		for(int i=row-1,j=col+1; i>=0&&j<board.length;i--,j++){
			if(board[i][j]=='Q')
			return false;
		}
		return true;
	}
	public static void nQueens(char board [][],int row,int n){
		if(row==n)
		printBoard(board,n);
		for(int j=0;j<n;j++){
			if(isSafe(board,row,j)){
				board[row][j]='Q';
				nQueens(board,row+1,n);
				board[row][j]='x';
			}
		}
	}
}