// Checking BST is valid or not

import java.util.ArrayList;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class ValidateBst {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
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
        display(a, arr);

        if(Valid(arr)){
            System.out.println("This is valid BST");
        }
        else System.out.println("This is not a valid BST");
    }

    private static void display(Node root,ArrayList<Integer> arr){
        if(root==null) return;
        display(root.left,arr);
        arr.add(root.val);
        display(root.right,arr);
    }

    private static boolean Valid(ArrayList<Integer> arr){
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)<=arr.get(i-1)) return false;
        }
        return true;
    }

}
