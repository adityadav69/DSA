public class ll {
    public static class Node{
        Node next;
        int data;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head;
    static Node tail;
    static int size;

    public static void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            size++;
            return;
        }
        newNode.next=head;
        head=newNode;
        size++;
    }
    public static void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            size++;
            return;
        }
        tail.next=newNode;
        tail=newNode;
        size++;
    }
    public static void print(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void addIndex(int data,int index){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        int i=0;
        Node temp=head;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
    }
    public static int removeFirst(){
        if(size==0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        if(head.next==null){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public static int removeLast(){
        if(size==0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        if(head.next==null){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int i=0;
        Node prev=head;
        while (i<size-2) {
            prev=prev.next;
            i++;
        }
        int val=tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public static int iterativeSearch(int key){
        Node temp=head;
        int i=0;
        while (temp!=null) {
            if(temp.data==key){
                return i;
            }
            i++;
            temp=temp.next;
        }
        return -1;
    }

    

    public static void main(String[] args) {
        ll l1=new ll();
        ll.addFirst(12);
        ll.addFirst(13);
        ll.addFirst(112);
        ll.addLast(32);
        ll.addLast(99);
        ll.addIndex(999, 2);
        ll.print();
        System.out.println("removed element is "+ll.removeLast());
        ll.print();   
       System.out.println( ll.removeFirst());
        ll.print();   
        System.out.println(ll.iterativeSearch(32)); 
    }
}
