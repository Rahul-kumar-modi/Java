//Leetcode [102] Binary Tree Level Order Traversal(2nd method)

import java.util.ArrayList;
import java.util.LinkedList;

class solution{
    private int levels(TreeNode root){
        if(root==null) return 0;
        return 1  + Math.max(levels(root.left),levels(root.right));
    }

    public class Pair{
        TreeNode node;
        int level;
        Pair(TreeNode node, int level){
            this.node = node;
            this.level= level;
        }
    }

    private void BFS(TreeNode root, List<List<Integer>> ans){
        Queue<Pair> q = new LinkedList<>();
        if(root!=null) q.add(new Pair(root,0));
        while(q.size()>0){
            Pair f = q.remove();
            TreeNode t = f.node;
            int lvl = f.level;

            ans.get(lvl).add(temp.val);
            if(temp.left!=null) q.add(new Pair(temp.left, lvl+1));
            if(temp.right!=null) q.add(new Pair(temp.right, lvl+1));
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer> ans = new ArrayList<>();
        int lvl = levels(root);
        for(int i=1;i<=lvl;i++){
            List<Integer> arr = new ArrayList<>();
            ans.add(arr);
        }
        BFS(root,ans);
        return ans;
    }
}
