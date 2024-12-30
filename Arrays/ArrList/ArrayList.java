import java.util.ArrayList;

public class Arrlist {
    public static void main(String[] args) {

         // Creating/Dreclareing  an ArrayList 
        ArrayList<Integer> list=new ArrayList<>();

        // adding elements in Arraylist 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
       

        // get element from ArrayList with index 
        System.out.print(list.get(2));
        
        // print 
        for (int i = 0; i <list.size(); i++) {
            System.out.print(list.get(i));
            
        }
        // print directly 
        System.out.println(list);

        // add element at index i
        list.add(2, 36);
        System.out.println(list);
        
        // updating 
        list.set(3, 40);
        System.out.println(list);

        // remove element at index i 
        list.remove(2);
        System.out.println(list);

        // remove by Value 
        list.remove(Integer.valueOf(40));
        System.out.println(list);

        // is element present in list 
        Boolean ans=list.contains(Integer.valueOf(2));
        System.out.println(ans);

        // ArrayList wihtout specifying wrapper class you can add anything 
        ArrayList l2 =new ArrayList();
        l2.add("piyush");
        l2.add(20);
        System.out.println(l2);

        

    }
    
}
