//Level order traversal using Queue(BFS)

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class LOT {
    public static void main(String[] args) {
        Node a = new Node (1);
        Node b = new Node (41);
        Node c = new Node (15);
        Node d = new Node (6);
        Node e= new Node (7);
        Node f = new Node (8);
        Node g = new Node (9);
        Node h = new Node (18);
        Node i = new Node (5);
 
        a.left =b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g; e.left=h; f.right=i;

        System.out.print("Level Order: ");
        levelOrder(a);
    }

    private static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            Node front = q.remove();
            System.out.print(front.val + " ");
            if(front.left!=null) levelOrder(root.left);
            if(front.right!=null) levelOrder(root.right);
        }
        System.out.println();
    }
}
