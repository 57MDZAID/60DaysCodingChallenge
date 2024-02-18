import java.util.*;
public class Main
{
	public static void main (String[] args)
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		//System.out.print("Enter a Month Number");
		int month = sc.nextInt();
		int year = sc.nextInt();
		if(month ==4 || month == 6 || month==9 || month==11 )
			System.out.println("30");
		else if (month == 2){
			if((year % 4==0) && ((year % 100 !=0 ) || (year % 100 ==0 && year % 400==0))){
				System.out.println("29");
			}
			else{
				System.out.println("28");
			}
		}
		else
			System.out.println("31");
	}
}