import java.util.*;
public class hello{
	public static void main(String args[]){
		// Scanner s=new Scanner(System.in);	
		// System.out.println("enter the name :");
		// String name=s.nextLine();
		// System.out.println("enter the age :");
		// int age=s.nextInt();
		// System.out.println("enter the address :");
		// s.nextLine();
		// String add=s.nextLine();
		// System.out.println(name+"\n"+age+"\n"+add);
		Scanner s = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = s.nextLine();
        System.out.println("Enter your address :");
        String add = s.nextLine();
        System.out.println("Enter your age :");
        int age = s.nextInt();
        // System.out.println("Enter your address :");
        // String add = s.nextLine();
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        System.out.println("Your address:" + add);

	}
}
