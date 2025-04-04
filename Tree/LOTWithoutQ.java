//Printing elements of nth level in level order traversal using withoutQueue(BFS)

import java.util.Scanner;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class LOTWithoutQ {
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(1);
        Node b = new Node(41);
        Node c = new Node(15);
        Node d = new Node(6);
        Node e = new Node(7);
        Node f = new Node(8);
        Node g = new Node(9);
        Node h = new Node(18);
        Node i = new Node(5);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        e.left = h;
        f.right = i;

        for (int x = 0; x <= 3; x++) {
            n = x;
            nthlevel(a, 0);
            System.out.println();
        }
    }

    private static void nthlevel(Node root, int level) {
        if (root == null)
            return;
        if (level == n)
            System.out.print(root.val + " ");
        nthlevel(root.left, level + 1);
        nthlevel(root.right, level + 1);
    }

}
