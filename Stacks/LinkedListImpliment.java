public class LinkedListImpliment {
    static class Stack{
        class Node{
            Node next;
            int data;
            Node(int data){
                this.data=data;
            }

        }
        Node head=null;
        int size=0;
        void  push(int data){
            Node node=new Node(data);
            node.next=head;
            head=node;
            size++;
        }
        int pop(){
            if(head==null){
                System.out.println("Stack is Empty");
                return -1;
            }
            int temp=head.data;
            head=head.next;
            return temp;
        }
        int peek(){
            return head.data;
        }
        void display(){
           Node temp=head;
           while(temp!=null){
            System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        int size(){
            return size;
        }
        boolean isEmpty(){
            if(head==null){
                return true;
            } 
            return false;
        }

    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        st.display();
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        
    }
}
