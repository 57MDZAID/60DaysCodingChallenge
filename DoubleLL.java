public class DoubleLL{
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public static void main(String args[]){
        DoubleLL dll=new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        // System.out.println("Size of LinkedList is :"+dll.size);
        // System.out.println("Deleted element is :"+dll.removeFirst());
        // dll.reverse();
        dll.addLast(4);
        dll.print();
        // System.out.println("deleted element is : "+dll.removeLast());
        dll.circuler();
        dll.print();
        // System.out.println("Size of LinkedList is :"+dll.size);
    }
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        head.prev=null;
    }
    public int removeFirst(){
        if(head==null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        int val=head.data;
        if(size==1){
            head=tail=null;
            size--;
            return val;
        }
        head=head.next;
        head.prev=null;
        size--;
        return val;

    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=tail.next;
    }
    public int removeLast(){
        if(head==null){
            System.out.println("!! Linked List is Empty !!");
            return Integer.MIN_VALUE;
        }
        int val=tail.data;
        if(size==1){
            tail=head=null;
            size--;
            return val;
        }
        tail=tail.prev;
        tail.next=null;
        size--;
        return val;
    }
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void print(){
        Node temp=head;
        int length=size;
        while(length>0){
            System.out.print(temp.data+"<->");
            temp=temp.next;
            length--;
        }
        System.out.println("null");
    }
    public void circuler(){
        if(head==null){
            System.out.println("!! Empty Circular Linked list !!");
            return ;
        }
        if(head.next==null){
            System.out.println("Single node Circular Linked list");
            return;
        }
        size++;
        tail.next=head;
        head.prev=tail;
    }
}