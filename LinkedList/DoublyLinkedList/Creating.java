public class Creating {
    static class Node{
        Node next;
        Node prev;
        int data;
        Node(int data){
            this.data=data;
        }
    }
    static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    // print in reverse order 

    static void display2(Node tail){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.println();
    }

    // display if any random node is given 

    static void display3(Node any){
        Node temp=any;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        display(temp);

    }

    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.prev=null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next=null;

        display(a); // print normally 
        display2(e); // print reverse 
        display3(b); // print by any node 
        
    }
}
