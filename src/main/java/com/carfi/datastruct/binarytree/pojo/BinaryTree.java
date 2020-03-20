package com.carfi.datastruct.binarytree.pojo;

/**
 * com.carfi.datastruct.binarytree.pojo$
 *
 * @author ll
 * @date 2020-03-20 15:51:32
 **/
public class BinaryTree {
    private int data;
    private BinaryTree leftB;
    private BinaryTree rightB;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinaryTree getLeftB() {
        return leftB;
    }

    public void setLeftB(BinaryTree leftB) {
        this.leftB = leftB;
    }

    public BinaryTree getRightB() {
        return rightB;
    }

    public void setRightB(BinaryTree rightB) {
        this.rightB = rightB;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "data=" + data +
                ", leftB=" + leftB +
                ", rightB=" + rightB +
                '}';
    }
}
