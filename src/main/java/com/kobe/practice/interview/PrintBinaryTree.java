package com.kobe.practice.interview;

import com.google.common.collect.Lists;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName: PrintBinaryTree
 * @Description: 从上往下打印二叉树的每个结点，同一层的结点按照从左到右的顺序打印
 * @Author: Tao
 * @Date 2020-01-04 11:36
 */
public class PrintBinaryTree {

    /**
     * @Author Tao
     * @Description 非递归版本，将Node放入队列（队尾），去遍历，队头先出队，再校验该队头有没左右节点，有则放入队尾，打印当前Node的值
     * @Date 2020-01-04 12:03
     * @Param [node]
     * @return java.util.List<java.lang.Integer>
     */
    public static List<Integer> print(Node node) {

        List<Integer> list = Lists.newArrayList();

        if (node == null) {
            return null;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            Node pollNode = queue.poll();
            if (pollNode.left != null) {
                queue.offer(pollNode.left);
            }
            if (pollNode.right != null) {
                queue.offer(pollNode.right);
            }
            list.add(pollNode.data);
        }

        return list;
    }

    public static void main(String[] args) {
        Node a = new Node(8);
        a.left = new Node(6);
        a.right = new Node(10);
        a.left.left = new Node(5);
        a.left.right = new Node(7);
        a.right.left = new Node(9);
        a.right.right = new Node(11);

        System.out.println(print(a));

    }

}
