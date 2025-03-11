public class queueArray{
    
    public static class queue {
    
        static int arr[];
        static int size;
        static int rear;
        queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }
        public  boolean isEmpty(){
            if(rear==-1){
                return true;
            }
            else{
                return false;
            }
        }
        public  void add(int data){
            if(rear!=size-1){
                rear+=1;
                arr[rear]=data;
            }
            else{
                System.out.println("Queue is full");
            }
            
        }
        public  int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            else{
                int front=arr[0];
                for(int i=0;i<rear;i++){
                    arr[i]=arr[i+1];
                }
                rear=rear-1;
                return front;
            }
        }
        public  int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String args[]){
        queue q1=new queue(5);
        q1.add(1);
        q1.add(2);
        q1.add(3);

        while (!q1.isEmpty()) {
            System.out.println(q1.peek());
            q1.dequeue();
        }
    }
}