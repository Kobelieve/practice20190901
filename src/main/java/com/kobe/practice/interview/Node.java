package com.kobe.practice.interview;

import lombok.ToString;

/**
 * @ClassName: Node
 * @Description: TODO
 * @Author: Tao
 * @Date 2020-01-04 11:47
 */
@ToString
public class Node {

    public int data;

    public Node left;

    public Node right;

    public Node(int data) {
        this.data = data;
    }
}
