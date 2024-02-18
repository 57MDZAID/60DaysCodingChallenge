public class LinkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void addMiddle(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=tail.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        int val=tail.data;//val=prev.next.data;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public int iterativeSearch(int key){
        Node temp=head;
        int i=0;
        while(temp !=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public int recursiveSearch(int key){
        return helper(head,key);
    }
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void deleteNthFromEnd(int n){
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
            return;
        }
        int i=1;
        Node prev=head;
        while(i<sz-n){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public Node findMidNode(Node head){
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean checkPalendrom(){
        if(head==null || head.next==null){
            return true;
        }
        Node midNode=findMidNode(head);
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        while(right !=null){
            if(right.data!=left.data){
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;
    }
    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast !=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false)return;
        slow=head;
        Node prev=null;
        while(slow != fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;
    }
    public static void main(String args[]){
        LinkedList ll=new LinkedList();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(3);
        // ll.addMiddle(3,7);
        // ll.print();
        // System.out.println("Size : "+ll.size);
        // System.out.println("Deleted Node : "+ll.removeFirst());
        // ll.print();
        // System.out.println("Size : "+ll.size);
        // System.out.println("Deleted Node : "+ll.removeLast());
        // ll.print();
        // System.out.println("Size : "+ll.size);
        // System.out.println(ll.iterativeSearch(7));
        // System.out.println(ll.iterativeSearch(10));
        // System.out.println(ll.recursiveSearch(10));
        // System.out.println(ll.recursiveSearch(7));
        // ll.reverse();
        // ll.deleteNthFromEnd(5);
        // System.out.println("Linked List is palendrome ? :"+ll.checkPalendrom());
        // ll.print();
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=new Node(8);
        head.next.next.next.next=new Node(4);
        head.next.next.next.next.next=new Node(5);
        head.next.next.next.next.next.next=temp;
        // 1->2->3->1
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());


    }
}