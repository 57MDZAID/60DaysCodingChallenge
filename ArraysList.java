import java.util.ArrayList;

public class ArraysList{
    public static void main(String args[]){
        // ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();
        // ArrayList<Integer>list1=new ArrayList<>();
        // ArrayList<Integer>list2=new ArrayList<>();
        // ArrayList<Integer>list3=new ArrayList<>();
        // for(int i=1;i<5;i++){
        //     list1.add(i*1);
        //     list2.add(i*2);
        //     list3.add(i*3);
        // }
        // list2.remove(3);
        // list3.remove(2);
        // mainList.add(list1);
        // mainList.add(list2);
        // mainList.add(list3);
        // System.out.println(mainList);
        // for(int i=0;i<mainList.size();i++){
        //     ArrayList<Integer>al=mainList.get(i);
        //     for(int j=0;j<al.size();j++){
        //         System.out.print(al.get(j)+" ");
        //     }
        //     System.out.println();
        // }
        ArrayList<Integer>height=new ArrayList<>();
        height.add(11);
        height.add(15);
        height.add(6);
        height.add(8);
        height.add(9);
        height.add(10);
        // System.out.println(storeWater(height));
        System.out.println(pairSum(height,100));
    }
    public static int storeWater(ArrayList<Integer>height){
        int max=0;
        int lb=0;
        int rb=height.size()-1;
        while(lb<rb){
            int ht=Math.min(height.get(lb),height.get(rb));
            int width=rb-lb;
            int current=ht*width;
            max=Math.max(max,current);
            if(height.get(lb)<height.get(rb)){
                lb++;
            }else{
                rb--;
            }
        }
        return max;
    }
    public static boolean pairSum(ArrayList<Integer>al,int target){ // find pair sum rotated and sorted array list
        int piviot=-1;
        int n=al.size();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<al.get(i)){
                max=al.get(i);
                piviot=i;
            }
        }
        int lp=piviot+1;
        int rp=piviot;
        while(lp!=rp){
            int currSum=al.get(lp)+al.get(rp);
            if(currSum==target){
                return true;
            }else if(currSum<target){
                lp=(lp+1)%n;
            }else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
}