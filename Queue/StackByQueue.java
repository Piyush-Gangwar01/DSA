import java.util.Queue;
import java.util.LinkedList;
public class StackByQueue {
    public static class stack{
        Queue<Integer> q=new LinkedList<>();
        int size=0;

        void push(int data){
            q.add(data);
            size++;
        }

        int pop(){
            for(int i=1;i<q.size();i++){
                q.add(q.remove());
            }
            int x=q.element();
            size--;
            q.remove();
            return x;           
        }

        int peek(){
            for(int i=1;i<q.size();i++){
                q.add(q.remove());
            }
            int val=q.element();
            q.add(q.remove());
            return val;

        }

        void print(){
            System.out.println(q);
        }

    }
    public static void main(String[] args) {
        stack st=new stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.pop();
        st.print();
        System.out.println(st.peek());
        
    }
}
