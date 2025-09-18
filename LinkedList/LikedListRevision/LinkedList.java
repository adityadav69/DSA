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

    static void insertionAtBegginig(int data) {
        if (head == null) {
            Node newNode = new Node(data);
            head = newNode;
        }
        Node newNode = new Node(data);
        head.next = newNode;
    }

    static void print() {
        Node temp = head;
        if (temp == null) {
            System.out.println("Nothing to print");
            return;
        }
        while (temp != null) {
            temp = temp.next;
            System.out.println(temp.data);

        }

    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        insertionAtBegginig(45);
        print();
    }
}