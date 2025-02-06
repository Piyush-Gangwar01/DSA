public class ByArray {
    public static class Queue{
        private int arr[]=new int [5];
        private int front=-1;
        private int rear=-1;
        int size=0;

        void print(){
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        void push(int data){
            if(rear==arr.length-1){
                System.out.println("Queue is Full !");
                return ;
            }
            if(front==-1){
                front=rear=0;
                arr[0]=data;
            }else{
                arr[rear+1]=data;
                rear++;
                size++;
            }
        }
        int pop(){
            if(size==0){
                System.out.println("Queue is Empty !");
                return -1;
            }
            front++;
            size--;
            return arr[front-1];

        }
        int peek(){
            return arr[front];            
        }
        boolean isEmpty(){
            if(size==0) return true;
            return false;
        }
        int size(){
            return size+1;
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        System.out.println(q.isEmpty());
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.print();
        q.pop();
        q.print();
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        
        
    }
    
}
