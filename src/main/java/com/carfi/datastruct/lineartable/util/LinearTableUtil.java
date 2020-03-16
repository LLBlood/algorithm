package com.carfi.datastruct.lineartable.util;

import com.carfi.datastruct.lineartable.pojo.Elem;
import com.carfi.datastruct.lineartable.pojo.LinearTable;

/**
 * com.carfi.datastruct.lineartable.util$
 *
 * @author ll
 * @date 2020-03-09 14:53:29
 **/
public class LinearTableUtil {

    /**
     * 获取第i个位置的元素(位置不是角标)
     * @author ll
     * @date 2020-03-09 14:55:20
     * @param linearTable
     * @param i
     * @param e 装载e
     * @return int -1无值 1有值
     **/
    public static boolean getElem(LinearTable linearTable, int i, Elem e) {
        //首先判断坐标是否超过限制
        if (linearTable.getLength() == 0 || i < 1 || i > linearTable.getLength()) {
            return false;
        }
        e.setValue(linearTable.getData()[i - 1]);
        return true;
    }

    /**
     * 在第i个位置插入元素e
     * 1、如果插入的位置不合理，抛出异常
     * 2、如果线性表长度大于等于数组长度，则抛出异常或动态增加容量
     * 3、从最后一个元素开始向前遍历到第i个位置，分别将他们都向后移动一个单位
     * 4、将要插入的元素填入位置i处
     * 5、表长加1
     * @author ll
     * @date 2020-03-12 13:58:52 
     * @param linearTable
     * @param i
     * @param e
     * @return java.lang.Boolean
     **/
    public static boolean listInsert(LinearTable linearTable, int i, Elem e) {
        if (linearTable.getLength() >= linearTable.getData().length) {
            System.out.println("表长已满");
            return false;
        }
        if (i < 1 || i > linearTable.getLength() + 1) {
            System.out.println("超出存储范围");
            return false;
        }

        int[] data = linearTable.getData();
        if (i != linearTable.getLength() + 1) {
            for (int j = linearTable.getLength(); j > i - 1; j--) {
                data[j] = data[j-1];
            }
        }
        data[i-1] = e.getValue();
        linearTable.setData(data);
        linearTable.setLength(linearTable.getLength()+1);
        return true;
    }

    /**
     * 在第i个位置删除元素
     * 1、如果删除位置不合理，抛出异常
     * 2、取出删除元素
     * 3、从删除元素位置开始遍历到最后一个元素位置，分别将他们都向前移动一个位置，
     * 4、表长减1
     * @author ll
     * @date 2020-03-12 15:02:39
     * @param linearTable
     * @param i
     * @param e
     * @return java.lang.Boolean
     **/
    public static boolean listDelet(LinearTable linearTable, int i, Elem e) {
        if (i < 1 || i > linearTable.getLength()) {
            System.out.println("超出删除范围");
            return false;
        }
        if (linearTable.getLength() == 0) {
            System.out.println("表为空");
            return false;
        }

        int[] data = linearTable.getData();
        e.setValue(data[i-1]);
        if (i != linearTable.getLength()) {
            for (int j = i-1; j < linearTable.getLength(); j++) {
                data[j] = data[j+1];
            }
        } else {
            data[i-1] = 0;
        }
        linearTable.setData(data);
        linearTable.setLength(linearTable.getLength()-1);
        return true;
    }
}
