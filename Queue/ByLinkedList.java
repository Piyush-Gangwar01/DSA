public class ByLinkedList {
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
        }
    }
    public static class QueueLL{
        int size=0;
        Node head=null;
        Node tail=null;
        void push(int data){
            Node temp=new Node(data);
            if(size==0){
                head=tail=temp;
            }else{
                tail.next=temp;
                tail=temp;
                
            }
            size++;
        }
        int pop(){
            if(size==0){
                System.out.println("Queue is Empty !");
            }
            int x=head.data;
            head=head.next;
            size--;
            return x;
        }
        int peek(){
            if(size==0){
                System.out.println("Queue is Empty !");
            }
            return head.data;
            
        }
        void print(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        boolean isEmpty(){
            if(size==0) return true ;
            return false;
        }
        int size(){
            return size;
        }


    }
    public static void main(String[] args) {
       QueueLL q= new QueueLL(); 
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.print();
        q.pop();
        q.print();
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size());
    }
}
