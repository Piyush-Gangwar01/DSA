public class KvaluesofNum {
    public static void k(int num,int k){
        if(k==1){
            System.out.print(num+" ");
            return ;
        }
        k(num, k-1);
        System.out.print(num*k+" ");
    }
    public static void main(String[] args) {
        k(3, 4);
        
    }
    
}
