public class SearchPractice {

    static class Node {
    
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.right=this.left=null;
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

    static boolean check(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        else if(key>root.data){
            return check(root.right, key);
        }
        else{
            return check(root.left, key);
        }

    }
    public static void main(String[] args) {
         int arr[]={3,7,4,1,6,8};
        Node root=null;
        for(int i=0;i<arr.length;i++){
            root=createBST(root,arr[i]);
        }
        System.out.println(check(root, 3));
    }
}
