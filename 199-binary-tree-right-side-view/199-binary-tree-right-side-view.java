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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        if(root == null) return arr;
        while(!q.isEmpty()){
            
            int n = q.size();
            for(int i=0;i<n;i++){
                TreeNode temp = q.peek();
                q.poll();
                
                // right view element
                if(i==n-1){
                    arr.add(temp.val);
                }
                
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
        }
        
        return arr;
    }
}