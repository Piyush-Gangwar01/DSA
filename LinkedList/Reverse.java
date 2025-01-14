public class Reverse {  
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
        }
    }
    static void print(Node head) {
        if (head == null) {
            return; 
        }
    
        System.out.print(head.data + " ");
    
        if (head.next != null) {
            print(head.next); 
        }
    }
    
    static Node reverse(Node head){
        if(head.next==null){
            return head;
        }
        Node newHead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return (newHead);
    }

    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        Node ans=reverse(a);
        print(ans);
    }
    
}
