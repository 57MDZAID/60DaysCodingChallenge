import java.util.*;
public class college4 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		byte b=4;
		char c='a';
		short s=512;
		int i=1000;
		float f=3.14f;
		double d=99.9954;
		double result=(f*b)+(i%c)-(d*s);
		System.out.println(result);
		int $=24;
		System.out.println($);
		System.out.println("Enter the year:");
		int y=sc.nextInt();
		String check=((y%400==0&&y%100!=0)||(y%4==0))?"leap year:":"Not a leap year:";
		System.out.println(check);
		sc.close();
	}
}