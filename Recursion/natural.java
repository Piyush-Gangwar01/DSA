public class natural {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int sub=(sum(n-1));
        int self=(n%2==0) ? sub-n : sub+n;
        return self;
    }
    public static void main(String[] args) {
        int ans=sum(10);
        System.out.println(ans);
        
    }
    
}
