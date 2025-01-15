public class Insertion {
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

    // insert at head 

    public static Node addhead(Node head,int data){
        Node node =new Node(data);
        node.prev=null;
        node.next=head;
        head.prev=node;
        head=node;
        return head;
        
    }

    // insert at end 

    static Node addtail(Node head,int data){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node node =new Node(data);
        temp.next=node;
        node.prev=temp;
        node.next=null;
        return head;

    }

    // insert at any index 
    static Node addany(Node head,int idx,int data){
        Node temp=head;
        int size=0;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        Node node =new Node(data); // 1 2 3
        node.next=temp.next;
        temp.next.prev=node;
        temp.next=node;
        node.prev=temp;
        return head;


    }

    // delete at any index 
    static Node delete(Node head,int idx){
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
        return head;
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
        
        // add at staring 
        Node ans=addhead(a, 10);
        display(ans);
        System.out.println();

        // add at end
        Node ans2=addtail(a, 23);
        display(ans2);

        // add at any idx 
        Node ans3=addany(a, 1, 44);
        display(ans3);

        // delete at any idx 
        Node ans4=delete(a, 1);
        display(ans4);


    }
    
}
