public class Impliment {
    public static  class Node{
        int data;
        Node next;
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
    // length of LL 
    public static int length(Node head){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;

    }
    // insert at end 
    public static void insertAtEnd(Node head, int val){
        Node temp=head;
        Node per=new Node(val);
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=per;
        
    }
    // insert at beginning 
    static Node insertAtBeginning(Node head , int val){
        Node node=new Node(val);
        node.next=head;
        return node;


    }
    // insert at any idx 
    static void insert(Node head,int val,int idx){
        Node node=new Node(val);
        Node temp=head;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
            
        }
       node.next=temp.next;
       temp.next=node;

    }
    // get value at any index 
    static void get(Node head,int idx){
        Node temp=head;
        for(int i=0;i<idx;i++){
           temp=temp.next;
            
        }
        System.out.println(temp.data);
       

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

        // print a Linked List 
        // Node temp=a;
        // for(int i=0;i<5;i++){
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;

        // }
        // System.out.println();
        
        // By recursion
        // print(a);
        // System.out.println("length:"+length(a));

        // insertAtEnd(a, 6);
        // print(a);
        // a=insertAtBeginning(a, 76);
        // print(a);
        insert(a, 23, 1);
        print(a);
        System.out.println();
        get(a, 1);

    }
}
