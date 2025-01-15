import java.util.*;

public class Insert {
    static Stack<Integer> add(Stack<Integer> st,int data,int idx){
        Stack<Integer> temp=new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(data);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        return st;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of element:");
        int n=sc.nextInt();
        System.out.println("Enter element :");
    
        Stack<Integer> st=new Stack<>();
        while (n>0) {
            int input =sc.nextInt();
            st.push(input);
            n--;            
        }
        System.out.println("Enter you value u want to add ");
        int data=sc.nextInt();
        System.out.println("At what Index ");
        int idx=sc.nextInt();

        Stack ans=add(st, data, idx);
        System.out.println(ans);

        
        
    }
}
