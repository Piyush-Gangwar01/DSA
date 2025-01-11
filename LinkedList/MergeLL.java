public class MergeLL {
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
        }
    }
    public static void print(Node head){
        Node temp=head;
        if(temp==null){
            return;
        }
        System.out.print(temp.data+" ");
        print(head.next);
        
    }
    static Node merge(Node head1,Node head2){
        Node temp1=head1;
        Node temp2=head2;
        Node head=new Node(100);
        Node temp=head;
        while(temp1!=null && temp2!=null){
            if(temp1.data<temp2.data){
                Node node=new Node(temp1.data);
                temp.next=node;
                temp=node;
                temp1=temp1.next;
            }else{
                Node node=new Node(temp2.data);
                temp.next=node;
                temp=node;
                temp2=temp2.next;

            }
        }
        if(temp1==null){
            temp.next=temp2;
        }else{
            temp.next=temp1;
        }
        return head.next;
    }
    public static void main(String[] args) {
        // LL1
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        //LL2
        Node a2=new Node(6);
        Node b2=new Node(7);
        Node c2=new Node(8);
        Node d2=new Node(9);
        Node e2=new Node(10);
        a2.next=b2;
        b2.next=c2;
        c2.next=d2;
        d2.next=e2;
        
        Node start=merge(a, a2);
        print(start);



        
    }
}
