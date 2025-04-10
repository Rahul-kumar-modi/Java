//Finding maximum node  of the Binary tree

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class MaxNode{
    public static void main(String[] args){
       Node a = new Node (1);
       Node b = new Node (41);
       Node c = new Node (5);
       Node d = new Node (6);
       Node e= new Node (7);
       Node f = new Node (8);

       a.left =b; a.right=c;
       b.left=d; b.right=e;
       c.left=f;
       display(a);
       System.out.println();
       System.out.println("Maximum node in this Binary Tree is: " + max(a));
    }

    private static void display(Node root){
        if(root==null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }

    private static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        int a= root.val, b= max(root.left), c =max(root.right);
        return Math.max(a, Math.max(b,c));
    }
} 

    



