import java.util.Stack;
public class QueueByStack {
    public static class Queue{
        Stack<Integer> st=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        int size=0;

        void print(){
            System.out.println(st);

        }

        void add(int data) {
           st.push(data);
           size++;
        }

        int remove(){
            while(st.size()>1){
                st2.push(st.pop());
            }
            int x=st.pop();
            while(!st2.isEmpty()){
                st.push(st2.pop());
            }
            size--;
            return x;

        }

        int element(){
            while(st.size()>1){
                st2.push(st.pop());
            }
            int x=st.peek();

            while(!st2.isEmpty()){
                st.push(st2.pop());
            }
            return x;

            

        }

        void size(){
            System.out.println("Size: "+ size);
        }

        boolean isEmpty(){
            if(st.isEmpty()){
                return true;
            }
            return false;
        }

    }
    public static void main(String[] args) {
        Queue q=new Queue();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.print();
        q.size();
        q.remove();
        q.size();
        q.print();
        System.out.println(q.element());
        
    }
}
