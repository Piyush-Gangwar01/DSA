import java.util.ArrayList;

public class ReturnSubsecquence {
    // Using ArrayList
    static ArrayList<String> subsecquence(String str){
        ArrayList<String> ans=new ArrayList<>();
        if(str.length()==0){
            ans.add("");
            return ans;
        }
        Character c=str.charAt(0);
        ArrayList<String> small=subsecquence(str.substring(1));
        for(String ss : small){
            ans.add(ss);
            ans.add(c+ss);
        }
        return ans;

        
    }
    // not using extra space 
    static void SS(String str,String currAns){
        if(str.length()==0){
            System.out.println(currAns);
            return;
        }
        char c=str.charAt(0);
        String remaing=str.substring(1);
        SS(remaing,currAns+c);
        SS(remaing, currAns);
    }
    public static void main(String[] args) {
        String str="abc";
        ArrayList<String> ans=subsecquence(str);
        System.out.println(ans);    
        SS(str, "");    
    }
    
}
