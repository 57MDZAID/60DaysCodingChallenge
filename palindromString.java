import java.util.Scanner;
public class palindrom {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String str="zaiz";
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		int comp = Character.compare(str.charAt(0),str.charAt(3));
		if(str.charAt(0)==str.charAt(3)) {
			System.out.println("yes");
		}
		else 
			System.out.println("no");
		System.out.println(comp);
		String newStr=str.substring(1, 3);
		System.out.println(newStr);
		s.close();
}  
}