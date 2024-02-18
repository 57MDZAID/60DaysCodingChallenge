import java.util.Scanner;
public class SafePosition {
	    public static int safePos(int n, int k) {
	        int d=0;
	        if(n%k!=0){
	            while(n!=1){
	                int m=n/k;
	                int r=n%k;
	                d=d+r;
	                n=m+r;
	            }
	        }
	        else if(n%k==0){
	            while(n!=1){
	                n=n/k;
	            }
	            d=n;
	        }
	        return d;
	    }
	    public static void main(String[]args) {
	    	Scanner s=new Scanner(System.in);
	    	int n=s.nextInt();
	    	int k=s.nextInt();
	    	safePos(n,k);
	    	s.close();
	    }
}