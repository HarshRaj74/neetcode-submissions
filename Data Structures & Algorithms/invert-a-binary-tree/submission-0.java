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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        // 2. Swap the left and right children
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // 3. Recursively call the function on the children
        invertTree(root.left);
        invertTree(root.right);

        // 4. Return the root of the (now inverted) tree
        return root;
    }
    }
