import java.util.ArrayList;

public class duplicate {
    public static ArrayList dup(int arr[]){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                continue;
            }else{
                list.add(arr[i]);
            }
        }
        return list ;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,5,6,6,6,7,8,9,5,5,5,6};
        System.out.println(dup(arr));

    }
    
}
