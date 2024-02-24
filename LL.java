import java.util.LinkedList;
public class LL{
    public static void main(String args[]){
        LinkedList<Integer> ll= new LinkedList<>();
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addLast(2);
        ll.addLast(3);
        ll.add(2,8); // add middle
        int size=ll.size();
        for(int i=0;i<size;i++){
            System.out.print(ll.get(i)+"->");
        }
        System.out.println("null");
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast()); 
        System.out.println(ll);
    }
}