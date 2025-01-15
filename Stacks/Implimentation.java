import java.util.Stack;
/*
There are 3 main function Stacks 
1- push()- to add element in stack 
2- pop()- to remove element from stacks
3- peek() - to see element on top

other function are :
size();
isEmpty();

 */
public class Implimentation {
    public static void main(String[] args) {
        // inbuilt function 
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(23);
        st.push(2);
        st.push(34);
        st.push(41);

        // to see element on TOS
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    


        
    }
}
