import java.util.Scanner;
public class pattern {
	public static void main(String args[]) {
		Scanner s=new Scanner (System.in);
		System.out.println("Please Enter the even number n:");
		int n=s.nextInt();
		s.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((i>1 && j>1) && (i<n && j<n)) {
					System.out.print("  ");
				}
				else
					System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j<=n-i) {
					System.out.print("  ");
				}
				else System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n+1-i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		int c=1;
		for(int i=1;i<=n; ) {
			for(int j=1;j<=c;j++) {
				System.out.print(i);
				i++;
			}
			System.out.println();
			c++;
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if((i+j)%2==0) {
					System.out.print("1");
				}
				else System.out.print("0");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((j>i&&j<=n-i)||j<=i&&j>n-i) {
					System.out.print("  ");
				}
				else System.out.print(" *");
			}
			System.out.println(); 
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(2*n-i);j++) {
				if(j<=n-i) {
					System.out.print("  ");
				}
				else System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(2*n-1);j++) {
				if((i==1&&j>=n)||(i==n&&j<=n)||i+j==n+1||i+j==2*n) {
					System.out.print(" *");
				}
				else System.out.print("  ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(2*n-1);j++) {
				if(j<=(n-i)||j>=(n+i)||(j+i)%2==0) {
					System.out.print(" ");
				}
				else System.out.print(i);
			}
			System.out.println();
		}
		for (int i=1;i<=2*n-1;i++) {
			for(int j=1;j<=2*n-1;j++) {
				if((i<=n&&(j<=n-i||j>=n+i))||(i>n&&(j<=i-n||j>3*n-i-1))) {
					System.out.print(" ");
				}
				else System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=n;j>0;j--) {
				if(j>i){
					System.out.print(" ");
				}
				else System.out.print(j);
			}
			for(int k=2;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
