package com.carfi.math.simple.bitoperation;

/**
 * com.carfi.math.simple.bitoperation$
 *
 * @author ll
 * @date 2020-10-12 14:05:24
 **/
public class SumBitOne191 {
    public static void main(String[] args) {
        new SumBitOne191().hammingWeight(121);
    }

    public int hammingWeight(int n) {
        int count = 0;
        String s = Integer.toBinaryString(n);
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar == '1') {
                count++;
            }
        }
        return count;
    }
}
