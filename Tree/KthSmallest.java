//Kth smallest node from all the nodes  of the BST 

import java.util.Scanner;
import java.util.ArrayList;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class KthSmallest{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the index for smallest element:- ");
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
        display(a,arr);
        System.out.println(arr);
        System.out.println(smallest(a ,value, arr));
    }

    private static void display(Node root, ArrayList<Integer> arr){
        if(root==null) return;
        display(root.left,arr);
        arr.add(root.val);
        display(root.right,arr);
    }

    private static int smallest(Node root, int idx, ArrayList<Integer> arr){
        if(idx<=0 || idx> arr.size()) return -1;
        return arr.get(idx-1);  
    }
} 

    


