package com.kobe.practice.interview;

import java.util.List;

/**
 * @ClassName: PrintBinaryTreeByRecursive
 * @Description: 递归解法
 * @Author: Tao
 * @Date 2020-01-04 12:41
 */
public class PrintBinaryTreeByRecursive {

    private static int depth(Node node) {

        if (node == null) {
            return 0;
        }

        int l = depth(node.left);
        int r = depth(node.right);

        if (l > r) {
            return l + 1;
        } else {
            return r + 1;
        }

    }

    private static void levelOrder(Node node, int level) {
        if (node == null || level < 1) {
            return;
        }
        if (level == 1) {
            System.out.print(node.data + " ");
            return;
        }
        //左子树
        levelOrder(node.left, level - 1);
        //右子树
        levelOrder(node.right, level - 1);
    }

    public static void main(String[] args) {
        Node a = new Node(8);
        a.left = new Node(6);
        a.right = new Node(10);
        a.left.left = new Node(5);
        a.left.right = new Node(7);
        a.right.left = new Node(9);
        a.right.right = new Node(11);

        int depth = depth(a);
        for (int i = 1; i <= depth; ++i) {
            levelOrder(a, i);
        }

    }

}
