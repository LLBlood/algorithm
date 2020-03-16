package com.carfi.datastruct.lineartable.test;

import com.carfi.datastruct.lineartable.pojo.Elem;
import com.carfi.datastruct.lineartable.pojo.LinearTable;
import com.carfi.datastruct.lineartable.util.LinearTableUtil;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        boolean flag = LinearTableUtil.getElem(linearTable, 5, elem);
        System.out.println(flag);
        System.out.println(elem.getValue());
    }

    @Test
    public void testListInsert() {
        LinearTable linearTable = new LinearTable();
        Elem elem = new Elem();
        elem.setValue(121);
        Boolean flag = LinearTableUtil.listInsert(linearTable, 5, elem);
        System.out.println(flag);
        System.out.println(linearTable.toString());
        elem.setValue(555465645);
        Boolean flag1 = LinearTableUtil.listInsert(linearTable, 12, elem);
        System.out.println(flag1);
        System.out.println(linearTable.toString());
    }

    @Test
    public void testListDelete() {
        LinearTable linearTable = new LinearTable();
        Elem elem = new Elem();
        Boolean aBoolean = LinearTableUtil.listDelet(linearTable, 10, elem);
        System.out.println(aBoolean);
        System.out.println(linearTable.toString());
        System.out.println(elem.getValue());
    }

    @Test
    public void test() {
        Map<String, Elem> map = new HashMap<>();
        map.put("1", new Elem());
        Set<Map.Entry<String, Elem>> entries = map.entrySet();
        for (Map.Entry<String, Elem> entry : entries) {
            System.out.println(entry.getValue().getValue());
        }

        Elem elem = map.get("1");
        elem.setValue(10);


        Map<String, Object> newMap = new HashMap<>();

        Set<Map.Entry<String, Elem>> entries2 = map.entrySet();
        for (Map.Entry<String, Elem> entry : entries2) {
            System.out.println(entry.getValue().getValue());
            newMap.put("1", entry.getValue());
        }

        Elem elem1 = (Elem) newMap.get("1");
        elem1.setValue(15);

        Set<Map.Entry<String, Elem>> entries1 = map.entrySet();
        for (Map.Entry<String, Elem> entry : entries1) {
            System.out.println(entry.getValue().getValue());
        }

    }

}
