import java.util.*;
public class college1 {
	public static void main(String args []) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter the :");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		double result=(double)(a+b+c)/3;
		System.out.println(result);
		s.close();
	}
}