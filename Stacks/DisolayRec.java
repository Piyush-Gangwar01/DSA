import java.util.*;
public class DisolayRec {
    static void display(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top=st.pop();
        System.out.println(top);
        display(st);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(23);
        st.push(2);
        st.push(34);
        st.push(41);
        
        display(st);

    }
}
