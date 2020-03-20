package com.carfi.datastruct.kmpstr.test;

import com.carfi.datastruct.kmpstr.util.KmpUtil;
import org.junit.Test;

/**
 * com.carfi.datastruct.kmpstr.test$
 *
 * @author ll
 * @date 2020-03-20 13:11:02
 **/
public class KmpUtilTest {
    @Test
    public void testGetNext() {
        int[] ints = new int[9];
        KmpUtil.getNext("ABCDABCD", ints);
        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }
}
