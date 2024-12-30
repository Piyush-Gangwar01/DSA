import java.util.*;

public class Rec {
    // print number from 1 to n 
    public static void PI(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }    
        PI(n-1);
        System.out.print(n+" ");    
    }
   
    // print number fron n to 1 
    public static void PI2(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }        
        
        System.out.print(n+" ");    
        PI(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter a number :");
        int n=sc.nextInt();
        PI(n) ;
        PI2(n);

        
        
    }
    
}
