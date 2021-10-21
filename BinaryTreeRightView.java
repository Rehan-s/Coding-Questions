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
        List<Integer> result = new ArrayList<>();
        rightView(root,result,0);
        return result;
    }
    //for right view we use the sequence node->left->right
    //so that we get the rightmost node in each case
    //we maintain a ds and whenever we visit a new level(currDepth==result.size()) then
    //we add the node to the ds bcoz it will always be the rightmost node in a new level
    public void rightView(TreeNode curr,List<Integer> result,int level)
    {
        if(curr==null)
            return;
        if(level==result.size())
            result.add(curr.val);
        rightView(curr.right,result,level+1);
        rightView(curr.left,result,level+1);
        
        //for left traversal 
    }
}
