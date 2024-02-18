import java.util.*;
public class college5 {
	public static void main(String args[]){
		Scanner s=new Scanner (System.in);
		int x=2,y=5;
		int exp1=(x*y/x);//5
		int exp2=(x*(y/x));//4.5
		System.out.print(exp1+","+exp2);
		int z;
		x=y=z=2;
		x+=y;
		y-=z;
		z/=(x+y);
		System.out.println(x+":"+y+":"+z);
		x=9;y=12;
		int a=2,b=4,c=6;
		int exp=4/3*(x+34)+9*(a+b*c)+(3+y*(2+a))/(a+b*y);
		System.out.println(exp);
		System.out.println("Enter the number x:");
		x=s.nextInt();
		String result=(x>=0)?"positive":"negative";
		System.out.println(result);
		a=63;b=36;
		boolean T=(a<b)?true:false;
		y=(a>b)?a:b;
		System.out.println(T+"\n"+y);
		s.close();
	}
}
