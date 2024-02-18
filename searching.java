import java.util.Scanner;
public class searching {
     public static int searchElement(int arr[],int n,int k) { //yahan pe 1 method banaya gya hai q ki aap ne kaha ki mujhe return chahiye aur method me argument pass kiya gya hai
    	 int l=-1;
    	 for(int i=0;i<n;i++) {
    		 if(arr[i]==k) {
    		  l=1;
    		 }
    	 }
	return l;
	}
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the size of array :");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the array element :");
		for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();
		}
		System.out.println("the array element are:");
		for(int i=0;i<n;i++) {
		System.out.println("arr["+i+"] = "+arr[i]);
		}
		System.out.println("enter the search element K:");
		int k=s.nextInt();
		s.close();
		int l=searchElement(arr,n,k);//yahan pe hum ne main method se local method ko call kara diya 
		System.out.println("\nReturn:"+l);//local method ki jo return value thi usko hum ne print kara diya 
	}
}