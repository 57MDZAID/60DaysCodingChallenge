import java.util.Scanner;
public class array {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the size of array :");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the array element :");
		for(int i=0;i<n;i++) { 
			arr[i]=s.nextInt();
		}
		System.out.println("the array element are before swapping:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		s.close();
		swap(arr,0,2);
		swap(arr,3,n-1);
		System.out.println("\nthe array element are after swapping:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void swap(int arr[],int i,int k){
		while(i<=k){
		int temp=arr[i];
		arr[i]=arr[k];
		arr[k]=temp;
		i++;
		k--;
		}
	}
}
