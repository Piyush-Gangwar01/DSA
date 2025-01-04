public class Palindrome {
    static String rev(String str,int idx){
        if(str.length()==idx) return"";
        String ans=rev(str, idx+1);
        Character c =str.charAt(idx);
        return ans+c;


    }
    static Boolean ispalindrome(String str){
        if(rev(str, 0).equals(str)){
            return true;
        }
        return false;
        
    }
    public static void main(String[] args) {
        String str="madam";
        if(ispalindrome(str)==true){
            System.out.println("Steing is palindrome !");
        }else{
            System.out.println("string is not palindrome ");
        }
    }
    
}
