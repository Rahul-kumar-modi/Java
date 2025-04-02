//Creating a node class

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class Intro{
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

       System.out.println(e.val);
       System.out.println(a.left.right.val);
    }
} 