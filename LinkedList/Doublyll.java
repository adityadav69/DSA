public class Doublyll {

    public static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        newNode.prev = null;
        size++;
    }

    public void addLast(int data){
        Node prev=tail;
        Node newNode=new Node(data);
        tail.next=newNode;
        newNode.prev=prev;
        tail=newNode;
        size++;
    }

    public int removeFirst(){
        if(head==null){
            System.out.println("Doubly linked list is empty.");
            return Integer.MIN_VALUE;
        }
        if(head==tail){
            int val=head.data;
            head=tail=null;
            size--;
            return val;

        }
        else{
            int val=head.data;
            head=head.next;
            head.prev=null;
            size--;
            return val;
        }
           
    }

    public int removeLast(){
        if(head==null){
            System.out.println("Doubly linked list is empty.");
            return Integer.MIN_VALUE;
        }
        if(head==tail){
            int val=head.data;
            head=tail=null;
            size--;
            return val;

        }
        else{
            int val=tail.data;
            tail=tail.prev;
            tail.next=null;
            size--;
            return val;
        }
           
    }


    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Doublyll dl = new Doublyll();
        dl.addFirst(3);
        dl.print();
        dl.removeFirst();
        dl.print();
        dl.addFirst(5);
        dl.print();
        dl.addFirst(8);
        dl.print();
        System.out.println(size);
        dl.addLast(45);
        dl.print();
        dl.removeFirst();
        dl.print();
        dl.removeLast();
        dl.print();

    }
}
