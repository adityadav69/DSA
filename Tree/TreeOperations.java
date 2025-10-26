public class TreeOperations {

    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        Node root=new Node(4);
        Node p2=new Node(1);
        Node p3=new Node(5);
        Node p4=new Node(2);
        Node p5=new Node(6);
        root.left=p2;
        root.right=p5;
        p2.left=p3;
        p2.right=p4;
        System.out.println("Inorder");
        inorder(root);
        System.out.println();
        System.out.println("Preorder");
        preorder(root);
        System.out.println();
        System.out.println("postorder");
        postorder(root);

        
    }
}
