package com.carfi.lineartable;

/**
 * com.carfi.lineartable$
 *
 * @author ll
 * @date 2019-12-24 15:49:55
 **/
public class LinearList extends AbstractLinearList<Integer> {

    @Override
    void initList() {
        data = new Integer[maxSize];
    }

    @Override
    boolean listEmpty(AbstractLinearList<Integer> linearList) {
        return false;
    }

    @Override
    void clearList(AbstractLinearList<Integer> linearList) {

    }

    @Override
    Integer getElem(AbstractLinearList<Integer> linearList, int index) {
        if (linearList.length == 0 || index < 1 || index > linearList.length) {
            throw new RuntimeException("线性表角标越界");
        }
        return linearList.data[index - 1];
    }

    @Override
    int locateElem(AbstractLinearList<Integer> linearList, Integer obj) {
        return 0;
    }

    /**
     * 初始条件 1 <= index <= length
     * @param linearList 线性表
     * @param index 第i个位置
     * @param obj 元素对象
     */
    @Override
    void listInsert(AbstractLinearList<Integer> linearList, int index, Integer obj) {
        if (linearList.length > maxSize) {
            throw new RuntimeException("线性表已满");
        }
        if (index < 1 || index > linearList.length + 1) {
            throw new RuntimeException("插入数据不在范围中");
        }
        //如果插入数据位置不在线性表尾
        if (index <= linearList.length) {
            for (int k = index - 1; k < linearList.length - 1; k++) {
                linearList.data[k+1] = linearList.data[k];
            }
        }
        linearList.data[index - 1] = obj;
        linearList.length++;
    }

    @Override
    Integer listDelete(AbstractLinearList<Integer> linearList, int index) {
        if (linearList.length == 0) {
            throw new RuntimeException("线性表无数据");
        }
        if (index < 1 || index > linearList.length) {
            throw new RuntimeException("删除位置不正确");
        }
        Integer obj = linearList.data[(index - 1)];
        //如果删除的不是最后位置
        if (index < linearList.length) {
            for (int k = index; k < linearList.length; k++) {
                linearList.data[k - 1] = linearList.data[k];
            }
        }
        linearList.data[index - 1] = null;
        linearList.length--;
        return obj;
    }

    @Override
    int listLength(AbstractLinearList<Integer> linearList) {
        return 0;
    }

    public static void main(String[] args) {
        LinearList linearList = new LinearList();
        linearList.initList();
        linearList.listInsert(linearList, 1, 15);
        Integer elem = linearList.getElem(linearList, 1);
        System.out.println(elem);
        Integer integer = linearList.listDelete(linearList, 1);
        System.out.println(integer);
        for (Integer datum : linearList.data) {
            System.out.println(datum);
        }

    }
}
