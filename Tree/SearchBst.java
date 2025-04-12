//Searching element in BST

import java.util.Scanner;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class SearchBst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the search element:- ");
        int value = sc.nextInt();
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

        if (search(a, value)) {
            System.out.println("The element is present in BST");
        } else
            System.out.println("The element is not present in BST");
    }

    private static void display(Node root) {
        if (root == null)
            return;
        display(root.left);
        System.out.print(root.val + " ");
        display(root.right);
    }

    private static boolean search(Node root, int value) {
        if (root == null)
            return false;
        else if (root.val > value)
            return search(root.left, value);
        else if (root.val < value)
            return search(root.right, value);
        else
            return true;
    }
}
