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
    public int maxDepth(TreeNode root) {
        int res = depth(root);
        return res+1;
    }
    
    private int depth(TreeNode root){
        if(root == null){ 
         return -1;
        }
            int left = depth(root.left);
            int right = depth(root.right);
            return 1+Math.max(left,right);
        
    }
}