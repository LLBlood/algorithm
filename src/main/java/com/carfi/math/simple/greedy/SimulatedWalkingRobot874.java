package com.carfi.math.simple.greedy;

import java.util.HashSet;
import java.util.Set;

/**
 * com.carfi.math.simple.greedy$
 * 874. 模拟行走机器人
 * @author ll
 * @date 2020-08-25 11:39:55
 **/
public class SimulatedWalkingRobot874 {
    public int robotSim(int[] commands, int[][] obstacles) {
        int[][] directionXY = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int currentX = 0;
        int currentY = 0;
        double maxLength = 0;
        int direct = 0;//0北，1东，2南，3西
        //用来判断障碍点
        Set<String> set = new HashSet<>();
        for (int i = 0; i < obstacles.length; i++) {
            int i1 = obstacles[i][0];
            int i2 = obstacles[i][1];
            set.add(i1 + "," + i2);
        }
        for (int command : commands) {
            if (command > 0) {
                for (int i = 0; i < command; i++) {
                    int nextX = currentX + directionXY[direct][0];
                    int nextY = currentY + directionXY[direct][1];
                    if (set.contains(nextX + "," + nextY)) {
                        break;
                    }
                    currentX = nextX;
                    currentY = nextY;
                }
                maxLength = Math.max(maxLength, Math.pow(currentX, 2) + Math.pow(currentY, 2));
            } else {
                direct = command == -1 ? (direct + 1) % 4 : (direct + 3) % 4;
            }
        }
        return (int) maxLength;
    }

    public static void main(String[] args) {
        new SimulatedWalkingRobot874().robotSim(new int[]{4,-1,4,-2,4}, new int[][]{{2, 4}});
    }
}
