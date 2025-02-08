public class Traversal {
    public static class  Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }

    }
    /*

    3 types of traversal :
    --> in order : left root right 
    --> pre order : root left right 
    --> post order : left right root 

     */

    public static void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }


    public static void main(String[] args) {
        Node root=new Node(1);
        Node l1=new Node(2);
        Node r1=new Node(3);
        root.left=l1;
        root.right=r1;
        Node l2=new Node(4);
        Node r2=new Node(5);
        l1.left=l2;
        l1.right=r2;
        Node r3=new Node(6);
        r1.right=r3;
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        inorder(root);
        
    }
    
}
