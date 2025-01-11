public class DeleteMid {
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
    static void delmid(Node head){
        Node temp=head;
        int length=0;
        while (temp!=null) {
            length++;
            temp=temp.next;
            
        }
        temp=head;
        int mid=length/2;
        for(int i=1;i<=mid-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        
        

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
        delmid(a);
        print(a);
        
    }
}
