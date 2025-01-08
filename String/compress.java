public class compress {
    public static void main(String[] args) {
        String str="aaabbbbccdddeeee";
        int count=1;
        String ans=""+str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }else{
                ans+=count;
                ans+=str.charAt(i);
                count=1;
            }
        }
        ans+=count;
        System.out.println(ans);

    }
}
