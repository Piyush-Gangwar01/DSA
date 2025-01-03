class GCD{
    // Method 1 
    public static void gcd(int x, int y){
        int nax=Math.min(x, y);
        for(int i=nax;i>0;i--){
            if(x%i==0 && y%i==0){
                System.out.print(i+" ");
                return;                
            }
        }
    }
    // method 2 
    public static int gcd2(int x, int y){
        while(x%y!=0){
            int remainder=x%y;
            x=y;
            y=remainder;
        }
        return y;
    }
    // recursive
    public static int gcd3(int x, int y){
        if(y==0){
            return x;
        }
        return gcd3(y,x%y);
    }
    public static int LCM(int x, int y){
        int lcm=(x*y)/gcd2(x,y);
        return lcm;
    }
    public static void main(String[] args) {
        gcd(14,16);
        System.out.println(gcd2(14,16));//  2 
        System.out.println(gcd3(14, 16)); // 2 
        System.out.println(gcd2(14,16)); // 112 

        
    }
}
