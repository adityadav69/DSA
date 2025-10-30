
public class SearchInBST {

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

    static boolean searchInOn(Node root, int element) {
        if (root == null) {
            return false;
        }
        if (root.data == element) {
            return true;
        } else {
            boolean left = searchInOn(root.left, element);
            if (left == true) {
                return left;
            } else {
                return searchInOn(root.right, element);
            }

        }

    }

    static boolean searchInLogn(Node root, int element){
        if(root==null){
            return false;
        }
        if(element==root.data){
            return true;
        }
        else if(element<root.data){
            return searchInLogn(root.left, element);
        }
        else{
            return searchInLogn(root.right, element);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        Node p2 = new Node(4);
        Node p3 = new Node(7);
        Node p4 = new Node(10);
        Node p5 = new Node(8);
        root.left = p2;
        root.right = p5;
        p5.left = p3;
        p5.right = p4;
        // System.out.println(searchInOn(root, 15));
        System.out.println(searchInLogn(root, 10));
    }

}