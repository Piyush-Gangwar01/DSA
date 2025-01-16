public class ArrayImplimentation {
    public static class Stack{
        private int arr[]=new int [5];
        private int idx=0; // index 
        void push(int data){
          if(arr.length==0){
            arr[idx]=data;
          }else{
            arr[idx]=data;
            idx++;
          }
        }
        int peek(){
            if(idx==0){
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("Stack is Empty :");
                return -1;
            }
            int temp=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return temp;
        }
        void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0){
                return true;
            }
            return false;
        }
        boolean isFull(){
            if(idx==arr.length){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st.isFull());
        st.display();
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        st.display();
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        /*
        Stack over flow - Error occur when Stack is full i.e all memory is used 
        Under flow - Error occir when all element from Stack is poped and nothing to return 
         */
        


    }
}
