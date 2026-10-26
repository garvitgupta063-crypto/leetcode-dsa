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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        int max = Integer.MIN_VALUE;
        if(root == null) return 0;
        q.offer(root);
        int a = 0;
        int b = 0;
        while(!q.isEmpty()){
            int sum = 0;
            int size = q.size();
            a++;
            for(int i=0;i<size;i++){
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);
                sum += q.poll().val;
            }
            if(sum>max){
                b = a;
            }
            max = Math.max(max,sum);
        }
        return b;
    }
}