import java.util.Scanner;
public class backTracking {
    static int count=0;
    public static void main(String args[]){
        Scanner s=new Scanner (System.in);
        // int n=s.nextInt();
        // int arr[]=new int[7];
        // changeArray(arr,0,1);
        // printArray(arr);
        // String str=s.nextLine();
        // findSubSets(str,0,"");
        // pattern(4);
        // permutation("zad","");
        // char board[][]=new char[n][n];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         board[i][j]='X';
        //     }
        // }
        // nQueens(board,0);
        // System.out.println("Total number of ways of N Queens :"+count);
        // System.out.println(gridWay(0,0,n,n));
        // System.out.println(gridWayMathTric(n,n));
        int sudoku[][]={{0,0,8,0,0,0,0,0,0},
                        {4,9,0,1,5,7,0,0,2},
                        {0,0,3,0,0,4,1,9,0},
                        {1,8,5,0,6,0,0,2,0},
                        {0,0,0,0,2,0,0,6,0},
                        {9,6,0,4,0,5,3,0,0},
                        {0,3,0,0,7,2,0,0,4},
                        {0,4,9,0,3,0,0,5,7},
                        {8,2,7,0,0,9,0,1,3}};

        if(sudokuSolver(sudoku,0,0)){
            System.out.println("Solution exist :");
            printSudoku(sudoku);
        }else{
            System.out.println("!! Soluton does not Exist !!");
        }
    }
    public static void changeArray(int arr[],int i,int val){
        // base case
        if(i==arr.length){
            printArray(arr);
            return ;
        }
        // recursion
        arr[i]=val;
        changeArray(arr,i+1,val+1);
        // back tracking
        arr[i]=arr[i]-2;
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void findSubSets(String str,int i,String ans){
        // base case
        if(i==str.length()){
            System.out.println(ans);
            return ;
        }
        //recursion
        // yes choise 
        findSubSets(str,i+1,ans+str.charAt(i));
        // no choise
        findSubSets(str,i+1,ans);
    }
    public static void pattern(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n+i-1;j++){
                if(j>i-1){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void permutation(String str,String ans){
        // base case
        if(str.length()==0){
            System.out.println(ans);
            return ;
        }
        // Recursion
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String NewStr=str.substring(0, i)+str.substring(i+1);
            permutation(NewStr,ans+curr);
        }
    }
    public static void nQueens(char board[][],int row){
        if(row==board.length){
            printBoard(board);
            count++;
            return ;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueens(board,row+1); // recursion
                board[row][j]='X';  //backtracking
            }
        }
    }
    public static void printBoard(char board[][]){
        System.out.println("----------chess Board------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char board[][],int row,int col){
        // vertically up
            for(int i=row-1;i>=0;i--){
                if(board[i][col]=='Q'){
                    return false;
                }
            }
        // diagonally up left
            for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
                if(board[i][j]=='Q'){
                    return false;
                }
            }
        // diagonally up right
            for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
                if(board[i][j]=='Q'){
                    return false;
                }
            }
        return true;
    }
    public static int gridWay(int i,int j,int n, int m){
        // base case
        if(i==n-1&&j==m-1){ // boundry cell condition
            return 1;
        }else if(i==n || j==m){ // out of boundry cell condition
            return 0;
        }
        int w1=gridWay(i+1,j,n,m);
        int w2=gridWay(i,j+1,n,m);
        return w1+w2;
    }
    public static int gridWayMathTric(int n,int m){
        int x=factorial(n-1+m-1);
        int y=factorial(n-1);
        int  w=factorial(m-1);
        return (x/(y*w));
    }
    public static int factorial(int z){
        if(z==0||z==1){
            return 1;
        }
        return z*factorial(z-1);
    }
    public static boolean sudokuSolver(int sudoku[][],int row,int col){
        // base case
        if(row==8&&col==8){
            return true;
        }
        // recursion technique
        int nextRow=row,nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }
        if(sudoku[row][col]!=0){
            return sudokuSolver(sudoku,nextRow,nextCol);
        }
        for(int digit=1;digit<=9;digit++){
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if(sudokuSolver(sudoku,nextRow,nextCol)){
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;
    }
    public static boolean isSafe(int sudoku[][],int row,int col,int digit){
        // for row
        for(int i=0;i<=8;i++){
            if(sudoku[row][i]==digit){
                return false;
            }
        }
        //for colomn
        for(int j=0;j<=8;j++){
            if(sudoku[j][col]==digit){
                return false;
            }
        }
        //for grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<(sr+3);i++){
            for(int j=sc;j<(sc+3);j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static void printSudoku(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
}
