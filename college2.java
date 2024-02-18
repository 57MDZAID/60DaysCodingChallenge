import java.util.*;
public class college2 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the price of all items one by one:");
		float aPencil=s.nextFloat();
		float aPen=s.nextFloat();
		float aEraser=s.nextFloat();
		float total=(aPencil+aPen+aEraser);
		System.out.println("bil:"+total);
		total=total+total*18/100;
		System.out.println("Grand total :"+total);
		s.close();
	}
}