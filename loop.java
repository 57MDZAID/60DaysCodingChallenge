import java.util.*;
public class loop {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("hello");
			i+=2;
		}
		int n=s.nextInt();
		int fctrl=1;
		while(n>0) {
			fctrl=fctrl*n;
			n-=1;
		}
		System.out.println(fctrl);
		s.close();
	}
}
