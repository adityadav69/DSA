public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node Head;
    public static Node Tail;
    public static int size = 0;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (Head == null) {
            Head = Tail = newNode;
            size++;
            return;
        }
        newNode.next = Head;
        Head = newNode;
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (Head == null) {
            Head = Tail = newNode;
            size++;
            return;
        }
        Tail.next = newNode;
        Tail = newNode;
        size++;
    }

    public void addIndex(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        int i = 0;
        Node temp = Head;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void print() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst() {
        if (Head == null) {
            System.out.println("Linked List is empty..");
            return Integer.MIN_VALUE;
        }
        int val = Head.data;
        Head = Head.next;
        size--;
        return val;
    }

    public int removeLast(){
    if(Head==null){
        System.out.println("Linked List is empty..");
        return Integer.MIN_VALUE;
    }
    if(Head.next==null){
        int val=Head.data;
        Head=Tail=null;
        return val;
    }
    int i=0;
    Node prev=Head;
    while (i<size-2) {
        prev=prev.next;
        i++;
    }
    int val=prev.data;
    prev.next=null;
    Tail=prev;
    size--;
    return val;

    }

    public int search(int key){
        Node temp=Head;
        int i=0;
        while (temp!=null) {
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return Integer.MIN_VALUE;
    }

    public int helper(Node Head,int key,int i){
        if(Head==null){
            return -1;
        }
        if(Head.data==key){
            return i;
        }
        Head=Head.next;
        i=i+1;
        return helper(Head, key, i);
    }

    public int recursiveSearch(int key){
        int i=0;
        return helper(Head, key,i);
    }

    public void removeNthNodefromLast(int n){
        int i=1;
        int isTo=size-n;
        Node prev=Head;
        while(i<isTo){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
    
    }
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(4);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addFirst(7);
        ll.print();
        System.out.println(size);
        ll.addLast(45);
        ll.print();
        ll.addLast(53);
        ll.print();
        ll.addIndex(2, 999);
        ll.print();
        // System.out.println(ll.size);
        ll.addIndex(6, 1000);
        ll.print();
        ll.removeFirst();
        ll.print();
        System.err.println(size);
        System.out.println(ll.removeLast());
        ll.print();
        System.out.println(ll.search(1000));
        System.out.println(ll.recursiveSearch(53));
        ll.print();
        ll.removeNthNodefromLast(2);
        ll.print();

    }
}