// Finding lowestCommonAncestor of two elements in BST .

class Node {
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val=val;
    }
}

public class LCA{
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(5);
        Node c = new Node(15);
        Node d = new Node(2);
        Node e = new Node(8);
        Node f = new Node(12);
        Node g = new Node(19);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        display(a);
       System.out.println();
        System.out.println("LCA: " + lowestCommonAncestor(a,b,g).val);
        
    }

    private static void display(Node root){
        if(root==null) return;
        display(root.left);
        System.out.print(root.val + " ");
        display(root.right);
    }

    private static Node lowestCommonAncestor(Node root, Node p, Node q){
        if(p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right,p,q);
        else if(p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left,p,q);
        else  return root;
    }

}


