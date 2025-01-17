import java.util.Stack;

public class Subsequence {
    static int [] remove(int arr[]){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(st.size()==0 || st.peek()!=arr[i]){
                st.add(arr[i]);
            }else{
                if(st.peek()==arr[i]){
                    if(arr[i]!=arr[i+1]){
                        st.pop();
                    }else{
                        continue;
                    }
                }
            }
            
        }
        int ans[]=new int[st.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;

        
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4,4,5,6,6,6,6,7}; 
        int ans[]=remove(arr);
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
}
