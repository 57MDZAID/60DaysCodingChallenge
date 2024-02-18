import java.util.Scanner;
public class QuickSorting{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array n:");
		int n=s.nextInt();
		int arr[]=new int [n];
		System.out.println("Enter the array element:");
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		QuickSort(arr,0,n-1);
		PrintArray(arr,n);	
	}
	public static void PrintArray(int arr[],int n){
		System.out.println("The Sorted element are:");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void QuickSort(int arr[],int si,int ei){
		if(si>=ei)return;
		int pIdx=partition(arr,si,ei);
		QuickSort(arr,si,pIdx-1);
		QuickSort(arr,pIdx+1,ei);
	}
	public static int partition(int arr[],int si,int ei){
		int pivot=arr[ei];
		int i=si-1;
		for(int j=si;j<ei;j++){
			if(arr[j]<pivot){
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
				i++;
				int temp=pivot;
				arr[ei]=arr[i];
				arr[i]=temp;
		return i;
	}
}