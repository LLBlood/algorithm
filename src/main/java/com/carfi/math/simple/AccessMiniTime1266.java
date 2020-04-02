package com.carfi.math.simple;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

/**
 * com.carfi.math$
 * 1266. 访问所有点的最小时间
 * @author ll
 * @date 2020-01-15 13:53:31
 **/
public class AccessMiniTime1266 {
    public int minTimeToVisitAllPoints(int[][] points) {
        /**
         * 最优时间
         */
        int minTime = 0;
        /**
         * 最优路线
         * 判断当前X1，Y1坐标与下一个坐标的X2,Y2差距
         * 1、如果X1，Y1（0，0）都小于X2,Y2（1，1） || X1，Y1（0，0）都大于X2,Y2（-1，-1），斜走？步，直到不满足该条件，？秒时间
         * 2、如果X1小于X2，Y1=Y2 (0,0), (1,0)，直走？步，直到不满足该条件，？秒时间
         * 3、如果X1小于X2，Y1>Y2 (0,1), （1，0）斜走？步，直到不满足该条件，？秒时间
         * 4、如果X1大于X2，Y1<Y2 (1,0), （0，1）斜走？步，直到不满足该条件，？秒时间
         * 5、如果X1大于X2，Y1=Y2 (1,0), （0，0）直走？步，直到不满足该条件，？秒时间
         * 从上可以得知，只要第一个坐标的XY与第二个坐标的XY都不相等，就斜着走
         * 只要第一个坐标的XY与第二个坐标的XY有一个相等，就直着走
         * 直到不满足以上条件，就到达目标点
         */
        for (int i = 0; i < points.length - 1; i++) {
            int pointCurrentX = points[i][0];
            int pointCurrentY = points[i][1];
            int pointNextX = points[i+1][0];
            int pointNextY = points[i+1][1];
            /**
             * 求取X坐标的最大差距
             */
            int absX = Math.abs(pointCurrentX - pointNextX);
            /**
             * 求取Y坐标的最大差距
             */
            int absY = Math.abs(pointCurrentY - pointNextY);
            /**
             * absX与absY较小的那个就是斜着走的时间
             * absX与absY差值的那个就是直走的时间
             */
            minTime += Math.min(absX, absY);
            minTime += Math.abs(absX - absY);
        }
        return minTime;



    }

    public static void main(String[] args) {
//        String s = formatToNumber(new BigDecimal(1.02182));
//        System.out.println(s);
//        Set<String> set = new HashSet<>(Arrays.asList("1111", "1111"));
//        for (String s1 : set) {
//            System.out.println(s1);
//        }
//        Integer a = 2001;
//        Integer b = 2001;
//
//        System.out.println(a == b);
        List<Integer> list = Arrays.asList(2002, 2003, 2004);
        List<Integer> integers = list.subList(0, 2);
        System.out.println(integers);
        List<Integer> temp = list.subList(2, list.size());
        System.out.println(temp);
    }

    public static String formatToNumber(BigDecimal obj) {
        DecimalFormat df = new DecimalFormat("#.000");
        if (obj.compareTo(BigDecimal.ZERO) == 0) {
            return "0.000";
        } else if (obj.compareTo(BigDecimal.ZERO) > 0 && obj.compareTo(new BigDecimal(1)) < 0) {
            return "0"+df.format(obj).toString();
        } else {
            return df.format(obj).toString();
        }
    }
}
