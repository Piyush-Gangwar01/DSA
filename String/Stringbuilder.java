public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("heello");
        System.out.println(str);

        // to change at any index
        str.setCharAt(2, 'k');
        System.out.println(str);

        // add other string 
        str.append(10);
        System.out.println(str);
        str.append("world");
        System.out.println(str);

        //update at any index without replace(add)

        str.insert(3, 'g');
        System.out.println(str);

        // to delete
        str.deleteCharAt(3);
        System.out.println(str);

        // to reverse 
        str.reverse();
        System.out.println(str);

    }
}
