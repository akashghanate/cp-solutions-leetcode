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
    public int diameterOfBinaryTree(TreeNode root) {
        // bottom up approach, start calculating diameter and height from bottom
        // height = 1 + max(height of left tree, height of right tree)
        // null path is considered as height = -1
        // Diameter = 2 + height of left + height of right
        
        int[] res = new int[1];

        // using depth-first-search to traverse the tree
        dfs(root,res);
        
        return res[0];
        
        
    }
    
    static int dfs(TreeNode root, int[] res){
        if(root == null){
            return -1;
        }
        int left = dfs(root.left,res);
        int right = dfs(root.right,res);
        res[0] = Math.max(res[0], 2 + left + right);
        
        return 1+Math.max(left,right);
    }
}