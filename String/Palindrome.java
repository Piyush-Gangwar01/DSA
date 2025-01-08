public class Palindrome {
    public static void main(String[] args) {
        String str="madam";
        StringBuilder str2=new StringBuilder(str);
        str2.reverse();
        if(str.equals(str2.toString())){
            System.out.printf("%s is palindrome",str);
        }else{
            System.out.printf("%s is not palidrome",str);
        }
    }
    
}
