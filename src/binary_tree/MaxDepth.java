package binary_tree;

import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，返回它的最大深度 3 .
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnd69e/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class MaxDepth {
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public static int maxdepth = 0;

    public int maxDepth(TreeNode root) {
        int depth = 0;
        dfs(root,0);
        return maxdepth;
    }

    private static void dfs(TreeNode node,int depth){
        if(node!=null){
            depth++;
        }
        if(node.left!=null){
            dfs(node.left,depth);
        }
        if(node.right!=null){
            dfs(node,depth);
        }

        if(depth>maxdepth){
            maxdepth = depth;
        }
    }


}
