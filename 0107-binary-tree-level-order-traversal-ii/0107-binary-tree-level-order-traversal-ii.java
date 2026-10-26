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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> list1 = new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++){
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);
                list1.add(q.poll().val);
            }
            list.add(list1);
        }
       
         Collections.reverse(list);
         return list;
    }
}