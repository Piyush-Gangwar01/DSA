public class factorial {
    public static int fac(int n){
        if(n==1){
            return n;
        }
        //sub problem - recursive work
        int sub=fac(n-1);
        // selfwork
        int self=n*sub;
        return self;

        // else (you can also write as )
         return n*fac(n-1);
    }   
    public static void main(String[] args) {
        int ans=fac(5);
        System.out.println(ans);

        
    }    
}
