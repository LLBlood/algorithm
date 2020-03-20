package com.carfi.datastruct.binarytree.util;

import com.carfi.datastruct.binarytree.pojo.BinaryTree;

import java.util.Scanner;

/**
 * com.carfi.datastruct.binarytree.util$
 *
 * @author ll
 * @date 2020-03-20 15:51:12
 **/
public class BinaryTreeUtil {
    public static BinaryTree createBinaryTree(BinaryTree b) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要存储的数据");
        String str = scanner.next();
        if (str.equals("#")) {
            return b = null;
        } else {
            b = new BinaryTree();
            b.setData(Integer.parseInt(str));
            b.setLeftB(createBinaryTree(b));
            b.setRightB(createBinaryTree(b));
            return b;
        }
    }
}
