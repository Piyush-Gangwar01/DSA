public class revAnum {
    public static int rev(int n){
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans=ans*10+rem;
            n=n/10;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(rev(157293));
        
    }
    
}