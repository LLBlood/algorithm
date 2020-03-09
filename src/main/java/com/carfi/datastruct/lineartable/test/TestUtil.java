package com.carfi.datastruct.lineartable.test;

import com.carfi.datastruct.lineartable.pojo.Elem;
import com.carfi.datastruct.lineartable.pojo.LinearTable;
import com.carfi.datastruct.lineartable.util.LinearTableUtil;
import org.junit.Test;

/**
 * com.carfi.datastruct.lineartable.test$
 *
 * @author ll
 * @date 2020-03-09 15:03:58
 **/
public class TestUtil {

    @Test
    public void testGetElem() {
        LinearTable linearTable = new LinearTable();
        Elem elem = new Elem();
        int flag = LinearTableUtil.getElem(linearTable, 5, elem);
        System.out.println(flag);
        System.out.println(elem.getValue());
    }
}
