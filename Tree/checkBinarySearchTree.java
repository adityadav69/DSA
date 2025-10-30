import java.util.ArrayList;

public class checkBinarySearchTree {
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

    static ArrayList<Integer> helper(Node root,ArrayList<Integer>ans){
        if(root==null){
            return ans;
        }
        helper(root.left, ans);
        ans.add(root.data);
        helper(root.right, ans);
        return ans;
    }

    static boolean checkBinarySearchTrees(Node root){
        ArrayList<Integer> list=helper(root, new ArrayList<>());
        for(int i=1;i<list.size();i++){
            if(list.get(i)<list.get(i-1)){
                return false;
            }
        }
        return true;
    }

    static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(5);
        Node p2=new Node(4);
        Node p3=new Node(7);
        Node p4=new Node(10);
        Node p5=new Node(8);
        root.left=p2;
        root.right=p5;
        p5.left=p3;
        p5.right=p4;
        inorder(root);
        inorder(root);
        System.out.println(checkBinarySearchTrees(root));


    }
}
