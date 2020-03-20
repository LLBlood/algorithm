package com.carfi.datastruct.binarytree.test;

import com.carfi.datastruct.binarytree.pojo.BinaryTree;
import com.carfi.datastruct.binarytree.util.BinaryTreeUtil;
import org.junit.Test;

/**
 * com.carfi.datastruct.binarytree.test$
 *
 * @author ll
 * @date 2020-03-20 16:02:21
 **/
public class BinaryUtilTest {
    @Test
    public void testCreate() {
//        BinaryTree b = new BinaryTree();
//        b = BinaryTreeUtil.createBinaryTree(b);
//        System.out.println(b.toString());

    }

    public static void main(String[] args) {
        BinaryTree b = new BinaryTree();
        b = BinaryTreeUtil.createBinaryTree(b);
        System.out.println(b.toString());
    }
}
