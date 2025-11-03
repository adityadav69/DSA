public class CreateBinarySearchTree {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }

    static Node createBST(Node root,int element){
        if(root==null){
            Node temp=new Node(element);
            return temp;
        }
        if(element<root.data){
            root.left=createBST(root.left, element);
        }
        else{
            root.right=createBST(root.right, element);
        }
        return root;
    }

    static Node insert(Node root, int data){
        if(root==null){
            Node newNode=new Node(data);
            return newNode;
        }
        if(data<root.data){
            root.left=insert(root.left, data);
        }
        else{
            root.right=insert(root.right, data);
        }
        return root;
    }

    static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        // int arr[]={6,3,17,5,14,28,2,1,12,16};
        int arr[]={3,7,4,1,6,8};
        Node root=null;
        for(int i=0;i<arr.length;i++){
            root=createBST(root,arr[i]);
        }   


        inOrder(root);
        root=insert(root, 0);
        System.out.println();
        inOrder(root);

    }
}
