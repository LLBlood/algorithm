package com.carfi.math.simple.bitoperation;

/**
 * com.carfi.math.simple.bitoperation$
 *
 * @author ll
 * @date 2020-10-12 14:20:52
 **/
public class PowerOfTwo231 {
    public static void main(String[] args) {
        new PowerOfTwo231().isPowerOfTwo(10);
    }
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        int i = n & n - 1;
        if (i == 0) {
            return true;
        }
        return false;
    }
}
