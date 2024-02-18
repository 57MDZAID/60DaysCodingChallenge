import java.util.Scanner;
public class Recursion {
	public static void PrintDec(int n) {
		if(n==1) {
			System.out.print(n+" ");
			return;
		}
		System.out.print(n+" ");
		PrintDec(n-1);
	}
	public static void PrintInc(int n) {
		if(n==1) {
			System.out.print(n+" ");
			return;
		}
		PrintInc(n-1);
		System.out.print(n+" ");
	}
	public static int fact(int n){
		if(n==0){
			return 1;
		}
		int fnm1=fact(n-1);
		int fon=n*fnm1;
		return fon;
	}
	public static int sum(int n){
		if(n==1)return 1;
		int Son=n+sum(n-1);
		return Son;
	}
	public static int fib(int n){
		if(n==1 || n==0)return n;
		int fibon=fib(n-1)+fib(n-2);
		return fibon;
	}
	public static boolean isSorted(int arr[],int i){
		if(i==arr.length-1)return true;
		if (arr[i]>arr[i+1])return false;
		return isSorted(arr,i+1);
	}
	public static int firstOccurence(int arr[],int key,int i){
		if(i==arr.length-1)return -1;
		if(arr[i]==key)return i;
		return firstOccurence(arr,key,i+1);
	}
	public static int lastOccurence(int arr[],int key,int i){
		if(i==0 && arr[i]!=key)return -1;
		if(arr[i]==key)return i;
		return lastOccurence(arr,key,i-1);
	}
	public static int power(int x,int n){
		if(n==1)return x;
		int xpn=x*power(x,n-1);
		return xpn;
	}
	public static int powerOptimize(int x,int n){
		if(n==0)return 1;
		int hxpn=powerOptimize(x,n/2);
		int xpn=hxpn*hxpn;
		if(n%2!=0){
			xpn=x*xpn;
		}
		return xpn;
	}
	public static int tilingProblem(int n){
		if (n==0 || n==1)return 1;
		// vertically
		int fnm1=tilingProblem(n-1);
		// horizontaly
		int fnm2=tilingProblem(n-2);
		return fnm1+fnm2;
	}
	public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean map[]){
		if(idx==str.length()){
			System.out.println(newStr);
			return;
		}
		char currChar=str.charAt(idx);
		if(map[currChar-'a']==true){
			removeDuplicates(str,idx+1,newStr,map);
		}else{
			map[currChar-'a']=true;
			removeDuplicates(str,idx+1,newStr.append(currChar),map);
		}
	}
	public static int friendsPair(int n){
		if(n==1||n==2)return n;
		// single choice
		int fnm1=friendsPair(n-1);
		// Pair
		int fnm2=friendsPair(n-2);
		int pairWays=(n-1)*fnm2;
		return fnm1+pairWays;
	}
	public static  void printBinaryString(int n, int lastplace,String str){
		// Base Case
		if(n==0){
		System.out.println(str);
		return;
		}
		//kaam
		if(lastplace==0){
			printBinaryString(n-1,1,str+"1");
		}
		printBinaryString(n-1,0,str+"0");
	}
	public static String remove(String s,int i,String str){
        if(i==s.length()){
            return s;
        }
        str+=s.charAt(i);
        if(str.length()>1){
        if(str.charAt(i)==str.charAt(i-1)){
			i++;
        	s=str.substring(0,i-2)+s.substring(i,s.length());
            remove(s,0,"");
        }
        }
        remove(s,i+1,str);
        return s;
    }
	public static void mergeSort(int arr[],int si,int ei){
		if(si>=ei){
			return;
		}
		int mid=si+(ei-si)/2;
		mergeSort(arr,si,mid);
		mergeSort(arr,mid+1,ei);
		merge(arr,si,mid,ei);
	}
	public static void merge(int arr[],int si,int mid,int ei){
		int temp[]=new int [ei-si+1];
		int i=si;// left iterator
		int j=mid+1;//right iterator
		int k=0;
		while(i<=mid && j<=ei){
			if(arr[i]>arr[j]){
				temp[k]=arr[i];
				i++;
			}else{
				temp[k]=arr[j];
				j++;
			}
			k++;
		}
		// remaininig left element 
		while(i<=mid){
			temp[k++]=arr[i++];
		}
		// remaining right element
		while(j<=ei){
			temp[k++]=arr[j++];
		}
		// copy array element
		for(k=0,i=si;k<temp.length;k++,i++){
			arr[i]=temp[k];
		}
	}
	public static void printArry(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void quickSort(int arr[],int si,int ei){
		if(si>=ei)return;
		int PIdx=partition(arr,si,ei);
		quickSort(arr,si,PIdx-1);
		quickSort(arr,PIdx+1,ei);
	}
	public static int partition(int arr[],int si,int ei){
		int pivot=arr[ei];
		int i=si-1;
		for(int j=si;j<ei;j++){
			if(arr[j]<pivot){
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		int temp=pivot;
		arr[ei]=arr[i];
		arr[i]=temp;
		return i;
	}
	public static int Search(int arr[],int tar,int si,int ei){
		if(si>ei)return -1;
		int mid=si+(ei-si)/2;
		if(arr[mid]==tar)return mid;
		// mid on L1
		if(arr[si]<=arr[mid]){
			// case a:
			if(arr[si]<=tar&&tar<=arr[mid]){
				return Search(arr,tar,si,mid-1);
			}else{
				// case b:
				return Search(arr,tar,mid+1,ei);
			}
		}
		// mid on L2
		else{
			// case c:
			if(arr[mid]<=tar&&tar<=arr[ei]){
				return Search(arr,tar,mid+1,ei);
			}
			// case d:
			else {
				return Search(arr,tar,si,mid-1);
			}
		}
	}
	public static void main(String []args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the array size S:");
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		s.close();
		// System.out.println(S.substring(0,0));
		// System.out.println(S.substring(2,S.length()));
		// int arr[]={2,4,5,7,8,9,14,56,89,9};
		// int arr[]={5,5,5,5};
		// PrintDec(n);
		// System.out.println();
		// PrintInc(n);
		// System.out.println();
		// System.out.print(fact(n));
		// System.out.println();
		// System.out.print(sum(n));
		// System.out.println();
		// System.out.print(fib(n));
		// System.out.println();
		// System.out.print(isSorted(arr,0));
		// System.out.println();
		// System.out.print(firstOccurence(arr,n,0));
		// System.out.print(lastOccurence(arr,n,arr.length-1));
		// System.out.println(power(2,n));
		// System.out.print(powerOptimize(2,n));
		// System.out.println(tilingProblem(n));
		// removeDuplicates(str,0,new StringBuilder(""),new boolean[26]);
		// System.out.println(friendsPair(n));
		// printBinaryString(n,0,"");()
		// mergeSort(arr,0,n-1);
		// quickSort(arr,0,n-1);
		// printArr(arr);
		// System.out.println(Search(arr,6,0,n-1));
	}
}