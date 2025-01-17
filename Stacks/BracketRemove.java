import java.util.Stack;

public class BracketRemove {
    public static void main(String[] args) {
        Stack<Character>  st=new Stack<>();
        String str="(()()(";
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
        System.out.println("number of bracket to be removed is :"+st.size());
        
    }
    
}
