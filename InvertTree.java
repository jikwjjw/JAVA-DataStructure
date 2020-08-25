package letcode.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 翻转一棵二叉树
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 *
 *  输出：
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 */
public class InvertTree {
    //利用中序遍历
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        invertTree(root.left);// 递归找到左节点
        TreeNode temp = root.right;//交换
        root.right = root.left;
        root.left = temp;
        invertTree(root.left);// 递归找到右节点 继续交换 : 因为此时左右节点已经交换了,所以此时的右节点为root.left
        return root;
    }

    //利用先序遍历
    public TreeNode invertTree1(TreeNode root) {
        if (root == null) return null;
        TreeNode rightTree = root.right;
        //交换左右子树的位置
        root.right = invertTree(root.left);
        root.left = invertTree(rightTree);
        return root;
    }

    //利用后序遍历
    public TreeNode invertTree2(TreeNode root) {
        // 后序遍历-- 从下向上交换
        if (root == null) return null;
        TreeNode leftNode = invertTree(root.left);
        TreeNode rightNode = invertTree(root.right);
        root.right = leftNode;
        root.left = rightNode;
        return root;
    }

    //利用层次遍历
    public TreeNode invertTree3(TreeNode root) {
        // 层次遍历--直接左右交换即可
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode rightTree = node.right;
            node.right = node.left;
            node.left = rightTree;
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return root;
    }
}
