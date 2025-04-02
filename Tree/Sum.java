//Addition of all the nodes  of the tree

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class Sum {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(41);
        Node c = new Node(5);
        Node d = new Node(6);
        Node e = new Node(7);
        Node f = new Node(8);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        display(a);
        System.out.println();
        System.out.println(add(a));
    }

    private static void display(Node root) {
        if (root == null)return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }

    private static int add(Node root) {
        if(root==null) return 0;
        return root.val + add(root.left) + add(root.right);
    }
}
