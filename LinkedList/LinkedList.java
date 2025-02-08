public class LinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    static int size = 0;

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void addIndex(int index, int data) {
        if (index > size || index < 0) {
            System.out.println("Please enter a index in the size of ll");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node temp = head;
        int tempIndex = 0;
        while (tempIndex < index - 1) {
            temp = temp.next;
            tempIndex++;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("There is no Element in the ll to remove");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = head.next;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("There is no Element in the ll to remove");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = head.next;
            size = 0;
            return val;
        }
        int i = 0;
        Node temp = head;
        while (i < size - 1) {
            temp = temp.next;
            i++;
        }

        int val = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;

    }

    public int search(int key) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data == key) {
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
    }
    public int helper(Node head,int key,int index){
        Node temp=head;
        if(temp==null){
            return-1;
        }
        if(temp.data==key){
            return index;
        }
        temp=temp.next;
       index= helper(temp, key,index+1);
       return index;

    }
    int recursiveSearch(int key){
        return helper(head,key,0);
    }

    public int removeNthNode(int n) {
        if (head == null || n <= 0 || n > size) {
            System.out.println("Invalid input");
            return Integer.MIN_VALUE;  // Edge case: invalid input
        }
    
        // If we need to remove the first node (n == 1)
        if (n == 1) {
            int val = head.data;
            head = head.next;  // Move the head pointer to the next node
            size--;
            return val;
        }
    
        Node temp = head;
        int i = 1;
        int iToFind=size-n;
        // Move temp to the (n-1)-th node
        while (i < iToFind) {
            temp = temp.next;
            i++;
        }
    
        // Remove the nth node
        int val = temp.next.data;  // Get the value of the node to be removed
        temp.next = temp.next.next;  // Link the (n-1)-th node to (n+1)-th node
        size--;
    
        return val;  // Return the value of the removed node
    }
    

    public void print() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
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
        System.out.println(size);
        System.out.println(ll.removeFirst());
        ll.print();
        System.out.println(size);
        System.out.println(ll.search(999));
        System.out.println(ll.recursiveSearch(999));
        ll.print();
        System.out.println("After removing nth from end");
        ll.removeNthNode(3);
        ll.print();

    }
}
