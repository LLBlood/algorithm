package com.carfi.datastruct.kmpstr.util;

/**
 * com.carfi.datastruct.kmpstr.util$
 *
 * @author ll
 * @date 2020-03-20 11:21:36
 **/
public class KmpUtil {

    //https://segmentfault.com/a/1190000008575379

    /**
     * p为模式串，简单来说就是，要求所给的需要匹配的字符串
     * next则是，匹配到下一个字符时，应该跳转的位置数组
     * next 数组的求解基于“真前缀”和“真后缀”，即next[i]等于P[0]...P[i - 1]最长的相同真前后缀的长度（请暂时忽视 i 等于 0 时的情况，下面会有解释）。
     * 我们依旧以上述的表格为例，为了方便阅读，我复制在下方了。
     *
     * i	        0	1	2	3	4	5	6	7
     * 模式串	    A	B	C	D	A	B	D	'\0'
     * next[ i ]	-1	0	0	0	0	1	2	0
     * i = 0，对于模式串的首字符，我们统一为next[0] = -1；
     * i = 1，前面的字符串为A，其最长相同真前后缀长度为 0，即next[1] = 0；
     * i = 2，前面的字符串为AB，其最长相同真前后缀长度为 0，即next[2] = 0；
     * i = 3，前面的字符串为ABC，其最长相同真前后缀长度为 0，即next[3] = 0；
     * i = 4，前面的字符串为ABCD，其最长相同真前后缀长度为 0，即next[4] = 0；
     * i = 5，前面的字符串为ABCDA，其最长相同真前后缀为A，即next[5] = 1；
     * i = 6，前面的字符串为ABCDAB，其最长相同真前后缀为AB，即next[6] = 2；
     * i = 7，前面的字符串为ABCDABD，其最长相同真前后缀长度为 0，即next[7] = 0。
     * @author ll
     * @date 2020-03-20 11:22:04
     * @param p
     * @param next
     * @return void
     **/
    public static void getNext(String p, int[] next) {
        int pSize = p.length();
        int i = 0;  //i走的是整个模式串的长度
        int j = -1; //j走的是i前面的字符串最长相同真前后缀长度
        //默认模式串第一位就是跳转就是-1
        next[0] = -1;
        while (i < pSize) {
            if (j == -1 || p.charAt(i) == p.charAt(j)) {
                i++;
                j++;
                next[i] = j;
            } else {
                j = next[j];
            }
        }
    }

    /**
     * 在s中找到p第一次出现的位置
     * @author ll
     * @date 2020-03-20 11:50:26
     * @param s
     * @param p
     * @param next
     * @return int
     **/
    public static int KMP(String s, String p, int[] next) {
        getNext(p, next);
        int i = 0;  //s的下标
        int j = 0;  //p的下标

        int sLength = s.length();
        int pLength = p.length();

        while (i < sLength && j < pLength) {
            if (j == -1 || s.charAt(i) == p.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }

        if (j == p.length()) {
            return i-j;
        }
        return -1;
    }

    /**
     * 优化后求next的方法
     * @author ll
     * @date 2020-03-20 12:14:26
     * @param p
     * @param nextVal
     * @return void
     **/
    public static void getNextVal(String p, int[] nextVal) {
        int p_len = p.length();
        int i = 0;   // P 的下标
        int j = -1;
        nextVal[0] = -1;

        while (i < p_len)
        {
            if (j == -1 || p.charAt(i) == p.charAt(j))
            {
                i++;
                j++;

                if (p.charAt(i) != p.charAt(j))
                    nextVal[i] = j;
                else
                    nextVal[i] = nextVal[j];  // 既然相同就继续往前找真前缀
            }
            else
                j = nextVal[j];
        }
    }
}
