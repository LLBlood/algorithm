package com.carfi.datastruct.binarytree.util;

import com.carfi.datastruct.binarytree.pojo.BinaryTree;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * com.carfi.datastruct.binarytree.util$
 *
 * @author ll
 * @date 2020-03-20 15:51:12
 **/
public class BinaryTreeUtil {
    public static BinaryTree initBinaryTree() {
        System.out.println("生成二叉树：类型见二叉树图片");
        BinaryTree binaryTree22 = getBinaryTree(22);
        BinaryTree binaryTree34 = getBinaryTree(34);
        BinaryTree binaryTree36 = getBinaryTree(36);
        BinaryTree binaryTree39 = getBinaryTree(39);
        BinaryTree binaryTree42 = getBinaryTree(42);
        BinaryTree binaryTree19 = getBinaryTree(19);
        BinaryTree binaryTree35 = getBinaryTree(35);
        BinaryTree binaryTree40 = getBinaryTree(40);
        BinaryTree binaryTree25 = getBinaryTree(25);
        BinaryTree binaryTree37 = getBinaryTree(37);
        BinaryTree binaryTree30 = getBinaryTree(30);

        binaryTree19.setRightB(binaryTree22);
        binaryTree35.setLeftB(binaryTree34);
        binaryTree35.setRightB(binaryTree36);
        binaryTree40.setLeftB(binaryTree39);
        binaryTree40.setRightB(binaryTree42);
        binaryTree25.setLeftB(binaryTree19);
        binaryTree37.setLeftB(binaryTree35);
        binaryTree37.setRightB(binaryTree40);
        binaryTree30.setLeftB(binaryTree25);
        binaryTree30.setRightB(binaryTree37);

        return binaryTree30;
    }

    private static BinaryTree getBinaryTree(int i) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setData(i);
        return binaryTree;
    }

    /**
     * 二叉树前序遍历 (意思就是先输出，再递归遍历左边，然后递归右边)
     * @author ll
     * @date 2020-04-09 17:08:30
     * @param b
     * @return void
     **/
    public static void preOrderTraversal(BinaryTree b) {
        if (b == null) {
            return;
        }
        System.out.println(b.getData());
        //左边遍历完毕才会到右边，递归
        preOrderTraversal(b.getLeftB());
        preOrderTraversal(b.getRightB());
    }

    /**
     * 二叉树中序遍历 (意思就是先递归遍历左边，再输出，然后递归右边)
     * @author ll
     * @date 2020-04-09 17:13:17
     * @param b
     * @return void
     **/
    public static void inOrderTraversal(BinaryTree b) {
        if (b == null) {
            return;
        }
        //左边遍历完毕才会输出，递归
        inOrderTraversal(b.getLeftB());
        System.out.println(b.getData());
        inOrderTraversal(b.getRightB());
    }

    /**
     * 后序遍历，就是左右遍历完了， 再进行输出操作
     * @author ll
     * @date 2020-04-09 17:26:13
     * @param b
     * @return void
     **/
    public static void postOrderTraversal(BinaryTree b) {
        if (b == null) {
            return;
        }
        //左边右边遍历完毕才会输出，递归
        postOrderTraversal(b.getLeftB());
        postOrderTraversal(b.getRightB());
        System.out.println(b.getData());
    }

    //层序遍历，有啥输出啥，队列实现
    public static void levelTraversal(BinaryTree b) {
        try {
            if (b == null) {
                return;
            }
            LinkedBlockingQueue<BinaryTree> queue = new LinkedBlockingQueue<BinaryTree>();
            queue.put(b);
            while (!queue.isEmpty()) {
                BinaryTree take = queue.take();
                System.out.println(take.getData());
                if (take.getLeftB() != null) {
                    queue.put(take.getLeftB());
                }
                if (take.getRightB() != null) {
                    queue.put(take.getRightB());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
