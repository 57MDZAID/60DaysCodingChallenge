import java.util.*;
public class Knapsack{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array length n:");
		int n=s.nextInt();
		int val[]=new int[n];
		int wt[]=new int [n];
		System.out.println("Enter the object value :");
		for(int i=0;i<n;i++){
		val[i]=s.nextInt();
		}
		System.out.println("Enter the object weight :");
		for(int i=0;i<n;i++){
		wt[i]=s.nextInt();
		}
		System.out.println("Enter the total waight capacity:");
		int w=s.nextInt();
		int dp[][]=new int[n+1][w+1];
		for(int i=0;i<=n;i++){
		for(int j=0;j<=w;j++){
		dp[i][j]=-1;
		}
		}
		int ans=knapsack01(val,wt,w,n,dp);
		System.out.println("The maximum profit is :"+ans);
	}
	public static int knapsack01(int val[],int wt[],int w,int n,int dp[][]){
			if(n==0 ||w==0)return 0;
			if(dp[n][w]!=-1){
				return dp[n][w];
			}
			if(wt[n-1]<=w){
				int ans1=val[n-1]+knapsack01(val,wt,w-wt[n-1],n-1,dp);
				int ans2=knapsack01(val,wt,w,n-1,dp);
				dp[n][w]=Math.max(ans1,ans2);
				return dp[n][w];
			}
			else{
			dp[n][w]=knapsack01(val,wt,w,n-1,dp);
			return dp[n][w];
			}
	}
}