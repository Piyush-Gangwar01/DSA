public class Reverse {
    public static String rev(String str,int idx){
        if(str.length()==idx){
            return "";
        }
        String s=rev(str, idx+1);
        return s+str.charAt(idx);

    }
    public static void main(String[] args) {
       String str="abcdef";
       System.out.println(rev(str, 0));
    }
    
}
