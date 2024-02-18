import java.util.HashMap;
import java.util.Map;
public class movezero{
    public  static void main(String args[]){
        Map<Integer,Integer>frq=new HashMap<>();
        int arr[]={1,3,2,1,4,1};
        int n=arr.length;
        // for(int i=0;i<n-1;i++){
        //     for(int j=0;j<n-1-i;j++){
        //         if(arr[j]==0&&arr[j+1]!=0){
        //             int temp=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //         }
        //     }
        // }
        for(int i:arr){
            if(!frq.containsKey(i)){
                frq.put(i,1);
            }else{
                frq.put(i,frq.get(i)+1);
            }

        }
        int maxFreq=0,ansKey=-1;
        for(var e:frq.entrySet()){
            if(e.getValue()>maxFreq){
                maxFreq=e.getValue();
                ansKey=e.getKey();
            }
            System.out.println(maxFreq);
            System.out.println(ansKey);
        }
    }
}