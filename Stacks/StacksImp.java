import java.util.*;
public class StacksImp{

    public static class stack{
        public static ArrayList <Integer> list =new ArrayList<>();

        public boolean isEmpty(){
            if(list.size()==0){
                return true;
            }
            return false;
        }

        public  void push(int data){
            list.add(data);
        }
        public  int pop(){
            int val=list.get(list.size()-1);
            list.remove(list.size()-1);
            return val;
        }
        public  int peek(){
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        stack s1=new stack();
        s1.push(4);
        s1.push(12);
        s1.push(5);
        s1.push(8);

        while (!s1.isEmpty()) {
            System.out.println(s1.peek()+" ");
            s1.pop();
        }


    }
}