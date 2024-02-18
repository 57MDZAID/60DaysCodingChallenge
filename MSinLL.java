public class MSinLL{
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
    public  static void main(String args[]){
        MSinLL ll=new MSinLL();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printLinkedList();
        // ll.head=ll.mergSort(ll.head);
        ll.zigZag();
        ll.printLinkedList();
    }
    public Node mergSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        // find mid node 
        Node mid=getMid(head);
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergSort(head);
        Node newRight=mergSort(rightHead);
        // merging
        return merge(newLeft,newRight);
    }
    public Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public Node merge(Node head1,Node head2){
        Node mergeLL=new Node(-1);
        Node temp=mergeLL;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergeLL.next;
    }
    public void printLinkedList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void addFirst(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void zigZag(){
        // find mid Node
        Node mid=getMid(head);
        // reverse 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr !=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        // merging zigzag marging
        Node left=head;
        Node right=prev;
        Node nextL,nextR;
        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            left=nextL;
            right=nextR;
        }
    }
}