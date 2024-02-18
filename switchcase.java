import java.util.*;
public class switchcase {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the day number:");
		int daynum=s.nextInt();
		switch(daynum) {
		case 1:System.out.println("Sunday");break;
		case 2:System.out.println("Monday");break;
		case 3:System.out.println("Tuesday");break;
		case 4:System.out.println("Wednesday");break;
		case 5:System.out.println("Thursday");break;
		case 6:System.out.println("Friday");break;
		case 7:System.out.println("Satusday");break;
		default :System.out.println("Please enter the number in range 1 to 7!");
		s.close();
		}
	}
}