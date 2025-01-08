public class CountPalindromeSubstring {
    static Boolean ispalindrome(String str){
        int start=0,end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="abc";
        int count=0;
        for(int i=0;i<=str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i, j));
                if(ispalindrome(str.substring(i, j))){
                    count++;

                }
            }
        }
        System.out.println(count);
        
    }
}
