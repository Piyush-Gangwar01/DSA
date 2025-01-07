public class Squareroot {
    static int search(int input ){
        int start=0, end=input;
        int ans=-1;
        while(end>start){
            int mid=start+(end-start)/2;
            int value=mid*mid;
            if(value==input){
                return mid;
            }else if(value>input){
                end=mid-1;
            }else{
                start=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(search(144));

        
    }
}
