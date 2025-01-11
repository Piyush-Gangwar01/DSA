public class Minode {
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
        }
    }
    static void mid(Node head ){
        Node temp=head;  
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }  
        temp=head;
        for(int i=1;i<=length/2;i++){
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
        mid(a);

        
                
    }
}
