public class llRepresentationofBT {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Node p = new Node(2);
        Node p1 = new Node(1);
        Node p2 = new Node(4);
        p.left = p1;
        p.right = p2;

        inorder(p);
    }
}