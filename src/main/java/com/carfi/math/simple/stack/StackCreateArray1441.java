package com.carfi.math.simple.stack;

import java.util.LinkedList;
import java.util.List;

/**
 * com.carfi.math.simple.stack$
 * 1441. 用栈操作构建数组
 * 输入：target = [1,3], n = 3
 * 输出：["Push","Push","Pop","Push"]
 * 解释：
 * 读取 1 并自动推入数组 -> [1]
 * 读取 2 并自动推入数组，然后删除它 -> [1]
 * 读取 3 并自动推入数组 -> [1,3]
 *
 * 思路：
 *      设定一个临时变量，从1开始，递增到n
 *      遍历数组数据，当临时变量=数组当前角标数据，push, 反之 push pop
 *      当临时变量 = n 或者 临时变量 = 数组最后角标数据结束
 * @author ll
 * @date 2020-08-19 09:36:21
 **/
public class StackCreateArray1441 {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new LinkedList<>();
        int index = 0;
        for (int i = 1; i <= n; i++) {
            list.add("push");
            if (i != target[index]) {
                list.add("pop");
            } else {
                index++;
            }
            if (i == target[target.length - 1]) {
                break;
            }
        }
        return list;
    }
}
