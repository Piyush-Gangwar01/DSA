import java.util.Stack;

public class BalanceBracket {
    public static void main(String[] args) {
        Stack<Character>  st=new Stack<>();
        String str="()g()()";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                st.add(str.charAt(i));
            }else{
                char c=st.peek();
                if(c=='(' && str.charAt(i)==')'){
                    st.pop();
                }

            }
        }
        if(st.isEmpty()){
            System.out.println("Balanced ");
        }else{
            System.out.println("Not Balenced ");
        }


    }
}
