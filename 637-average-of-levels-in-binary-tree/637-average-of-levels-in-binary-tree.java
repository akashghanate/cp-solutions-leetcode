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
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> result = new ArrayList<Double>();
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root == null) return result;
        q.add(root);
        
        while(!q.isEmpty()){
            Double sum = 0.000;
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode temp = q.peek();
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
                sum += temp.val;
                q.poll();
            }
            
            result.add(sum/n);
        }
        
        return result;
    }
}