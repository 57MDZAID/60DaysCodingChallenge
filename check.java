import java.util.Scanner; 
public class check
{
    public static String displayLongestName(String names[],int n)
    {
        String longest_name="";
        for(int i=0;i<n;i++)
        {
            if(names[i].length() > longest_name.length())
            {
                longest_name=names[i]; 
            } 

        } 
            return longest_name; 

    }

  public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of Strings ");
        int n=sc.nextInt();
  
        String names[]=new String[n];   
        System.out.println("enter the names "); 
        for(int i=0;i<n;i++)
        {
           names[i]=sc.next();
        }  
        System.out.println(displayLongestName(names,n)); 

    }
}