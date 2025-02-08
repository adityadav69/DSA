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

    }
}
