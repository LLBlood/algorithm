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
     * 获取第i个位置的元素
     * @author ll
     * @date 2020-03-09 14:55:20
     * @param linearTable
     * @param i
     * @param e 装载e
     * @return int -1无值 1有值
     **/
    public static int getElem(LinearTable linearTable, int i, Elem e) {
        //首先判断坐标是否超过限制
        if (linearTable.getLength() == 0 || i < 1 || i > linearTable.getLength()) {
            return -1;
        }
        e.setValue(linearTable.getData()[i - 1]);
        return 1;
    }
}
