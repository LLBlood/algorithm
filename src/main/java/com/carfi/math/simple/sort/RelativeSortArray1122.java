package com.carfi.math.simple.sort;

import java.util.*;

/**
 * com.carfi.math.simple.sort$
 * 1122. 数组的相对排序
 * @author ll
 * @date 2020-09-01 17:11:37
 **/
public class RelativeSortArray1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new LinkedList<>();
        for (int i : arr1) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (int i : arr2) {
            if (map.containsKey(i)) {
                for (int j = 0; j < map.get(i); j++) {
                    list.add(i);
                }
                map.remove(i);
            }
        }
        List<Integer> temp = new LinkedList<>();
        for (Integer integer : map.keySet()) {
            for (int i = 0; i < map.get(integer); i++) {
                temp.add(integer);
            }
        }
        Collections.sort(temp);
        list.addAll(temp);
        int[] arr = new int[list.size()];
        int index = 0;
        for (Integer integer : list) {
            arr[index++] = integer;
        }
        return arr;
    }
}
