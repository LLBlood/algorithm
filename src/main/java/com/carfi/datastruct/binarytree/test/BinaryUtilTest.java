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
        BinaryTree b = BinaryTreeUtil.initBinaryTree();
        System.out.println(b.toString());
        //前序遍历
        System.out.println("前序遍历================>开始");
        BinaryTreeUtil.preOrderTraversal(b);
        System.out.println("前序遍历================>结束");
        //中序遍历
        System.out.println("中序遍历================>开始");
        BinaryTreeUtil.inOrderTraversal(b);
        System.out.println("中序遍历================>结束");
        //后序遍历
        System.out.println("后序遍历================>开始");
        BinaryTreeUtil.postOrderTraversal(b);
        System.out.println("后序遍历================>结束");
        //层序遍历
        System.out.println("层序遍历================>开始");
        BinaryTreeUtil.levelTraversal(b);
        System.out.println("层序遍历================>结束");
    }
}
