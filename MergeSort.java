import java.util.*;
public class MergeSort{
    public static void main(String args[]){
        int arr[]={5,6,9,67,987,56,64,356,2,1,-1,-2,576};
        // mergingsort(arr,0,arr.length-1);
        QuickSort(arr,0,arr.length-1);
        print(arr);
    }
    public static void mergingsort(int arr[],int si,int ei){
        if(si>=ei)
         return;
        int mid=si+(ei-si)/2;
        mergingsort(arr,si,mid);//array left part sort every element in single array
        mergingsort(arr,mid+1,ei);//array right part sort every element in single array
        merge(arr,si,mid,ei);

    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int [ei-si+1];
        int i=si;//left part iterator 
        int j=mid+1;//right part iterator
        int k=0;//temporary array iterartor
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
        //left part array 
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //right part array
        while(j<=ei){
            temp[k++]=arr[j++]; 
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void QuickSort(int arr[],int si,int ei){
        if(si>=ei)
        return;
        int pIdx=Partition(arr,si,ei);
        QuickSort(arr,si,pIdx-1);
        QuickSort(arr,pIdx+1,ei);
    }
    public static int Partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
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
}