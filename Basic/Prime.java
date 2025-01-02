public class Prime {
    public static Boolean check(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n=3;
        if(check(n)==true){
            System.out.print(n+" is prime");
        }else{
            System.out.print(n+" is not prime");
        }
        
    }
    
}
