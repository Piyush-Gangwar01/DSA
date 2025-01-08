public class Basics {
    public static void main(String[] args) {
        String str="Hello piyush";
        String str2=" this is java coding";

        /*
        next()- doest take input after space 
        nextLine()- take input after space 
         */

        // print 
        System.out.println(str);

        // find length
        System.out.println(str.length());

        // find character at any index
        System.out.println(str.charAt(6));

        // if substring present in main or not 
        System.out.println(str.contains("p"));

        // if string start/ends  with character or not 
        System.out.println(str.startsWith("H"));
        System.out.println(str.endsWith("k"));

        // to make all string into lowercase /uppercase
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        // to add str1 into str2
        System.out.println(str.concat(str2));

        // substring(start index , end index )
        System.out.println(str.substring(0,4));
        
        // print all substrings
        String str3 = "abcd";
        for (int i = 0; i <= str3.length() - 1; i++) {
            for (int j = i + 1; j <= str3.length(); j++) {
                System.out.println(str3.substring(i, j));
            }
        }

        // to check if str1 is equal to str2
        System.out.println(str.equals(str2));

    }
}
