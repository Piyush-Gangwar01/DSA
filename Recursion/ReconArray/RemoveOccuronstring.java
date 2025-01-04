import java.util.Scanner;

public class RemoveOccuronstring {

    public static String remove(String str,int idx){
        if(str.length()==idx){
            return "";       
        }
        String rec=remove(str, idx+1);
        char c=str.charAt(idx) ;
        if(c!='a') return c+rec;
        return rec;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String:");
        String input=sc.nextLine();
        String ans=remove(input, 0);
        System.out.println(ans);

    }
    
}
