import java.util.*;
public class MergeSorting{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size  n:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array element :");
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
		mergeSort(arr,0,n-1);
		printarray(arr,n);
	}
	public static void printarray(int arr[],int n){
		System.out.println("The sorted element are:");
			for(int i=0;i<n;i++){
				System.out.print(arr[i]+" ");
			}
	}
	public static void mergeSort(int arr[],int si,int ei){
		if(si>=ei)
		return;
		int mid=si+(ei-si)/2;
		mergeSort(arr,si,mid);
		mergeSort(arr,mid+1,ei);
		merge(arr,si,mid,ei);

	}
	public static void merge(int arr[],int si,int mid,int ei){
		int temp[]=new int[ei-si+1];
		int i=si;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=ei){
			if(arr[i]<arr[j]){
				temp[k]=arr[i];
				i++;
			}
			else{
				temp[k]=arr[j];
				j++;
			}
			k++;
		}
		while(j<=ei){
			temp[k++]=arr[j++];
		}
		while(i<=mid){
		temp[k++]=arr[i++];
		}
		for(k=0,i=si; k<temp.length;k++,i++){
			arr[i]=temp[k];
		}
	}
}