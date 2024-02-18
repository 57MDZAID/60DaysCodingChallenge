import java.util.Scanner;
public class sortSearch {
     public static int searchElement(int arr[],int n,int k) {
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
		for(int i=1;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("the sorted array element are:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		int l=searchElement(arr,n,k);
		System.out.println("\nReturn:"+l);
	}
}
