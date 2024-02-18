import java.util.*;

public class FloydWarshall
{  
    public static int min(int a ,int b)
    {
        return (a<b) ? a : b; 
    }
    public static void path(int d[][],int n)
    {
        for(int k=0;k<n;k++)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    d[i][j]=min(d[i][j], d[i][k] + d[k][j]); 
                }
            }
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of vertices ");
        int n=sc.nextInt();

        int a[][]=new int [n][n];
        int d[][]=new int [n][n];        
        System.out.println("Enter the cost matrix ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt(); 
                d[i][j]=a[i][j];  
            }
        } 
        path(d,n); 
        System.out.println("The Final distance Matrix is : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(" " +d[i][j]); 
            }
            System.out.println(); 
        } 
        
    }
}