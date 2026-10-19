/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> op=new ArrayList<>();
        inorder(root, op);
        return op;
    
    }
    public void inorder(TreeNode node, List op){
        if(node==null){return;}
        if(node.left==null && node.right==null){
            op.add(node.val);
        }
        else{
            inorder(node.left,op);
            op.add(node.val);
            inorder(node.right,op);
        }
    }
}