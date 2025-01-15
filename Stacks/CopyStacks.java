import java.util.Stack;

public class CopyStacks {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> temp=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        st.push(1);
        st.push(23);
        st.push(2);
        st.push(34);
        st.push(41);
        System.out.println("Original Stack ");
        System.out.println(st);
        while(st.size()>0){
            temp.push(st.pop());
        }
        while(temp.size()>0){
            st2.push(temp.pop());
        }
        System.out.println("Stack after copy");
        System.out.println(st2);
        
    }
}
