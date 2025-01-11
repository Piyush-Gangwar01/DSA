public class FindNthnode {
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
    // find nth node from the last
    static void nthnode(Node Head,int node){
        Node temp=Head;
        for(int i=0;i<5-node;i++){
            temp=temp.next;

        }
        System.out.println(temp.data);

    }
    // delete nth node from last 
    static void delete(Node head,int num){
        Node temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        for(int i=0;i<size-num-1;i++){
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
        nthnode(a, 2);
        delete(a, 3);
        print(a);

        
    }
}
