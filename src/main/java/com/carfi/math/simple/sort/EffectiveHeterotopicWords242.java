package com.carfi.math.simple.sort;

import java.util.Arrays;

/**
 * com.carfi.math.simple.sort$
 *
 * @author ll
 * @date 2020-08-31 14:58:50
 **/
public class EffectiveHeterotopicWords242 {
    public boolean isAnagram(String s, String t) {
        char[] charsA = s.toCharArray();
        char[] charsB = t.toCharArray();
        Arrays.sort(charsA);
        Arrays.sort(charsB);
        return String.valueOf(charsA).equals(String.valueOf(charsB));
    }
}
