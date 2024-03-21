import java.util.Scanner;
public class strings{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String firstname="zaid";
        System.out.println("Enter the last name:");
        String lastname=s.next();
        String fullname=firstname+" "+lastname;
        System.out.println("Enter the sir name:");
        String sirname=s.nextLine();
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(fullname);
        System.out.println(sirname);
        s.close();
    }
}