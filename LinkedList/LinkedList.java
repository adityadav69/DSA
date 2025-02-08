public class LinkedList {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    static int size=0;

    public void addFirst(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
        size++;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }

       tail.next=newNode;
       tail=newNode;
       size++;
    }

    public void addIndex(int index,int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Node temp=head;
        int tempIndex=0;
        while (tempIndex<index-1) {
            temp=temp.next;
            tempIndex++;
        }
        Node newNode=new Node(data);
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
    }

    public void print(){
        if(head==null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addFirst(4);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.addLast(2);
        ll.print();
        ll.addLast(9);
        ll.print();
        ll.addIndex(3, 999);
        ll.print();
        System.out.println(ll.size);
    }
}
