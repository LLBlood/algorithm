package com.carfi.algorithmdiagram.sevengreedy;

import java.util.*;

/**
 * com.carfi.algorithmdiagram.sevengreedy$
 * 贪婪算法找最优解，非完美解
 * @author ll
 * @date 2020-09-07 15:17:37
 **/
public class GreedyBroadCast {
    public static void main(String[] args) {
        String[] strStates = new String[] {"mt", "wa", "or", "id", "nv", "ut", "ca", "az"};
        Set<String> neededStates = new HashSet<>(Arrays.asList(strStates));
        Map<String, List<String>> stateMap = new LinkedHashMap<>();
        stateMap.put("kone", new LinkedList<>(Arrays.asList("id", "nv", "ut")));
        stateMap.put("ktwo", new LinkedList<>(Arrays.asList("wa", "id", "mt")));
        stateMap.put("kthree", new LinkedList<>(Arrays.asList("or", "nv", "ca")));
        stateMap.put("kfour", new LinkedList<>(Arrays.asList("nv", "ut")));
        stateMap.put("kfive", new LinkedList<>(Arrays.asList("ca", "az")));
        Set<String> finalState = new HashSet<>();
        String bestState = null;
        int size = 0;
        Set<Map.Entry<String, List<String>>> entries = stateMap.entrySet();
        while (!neededStates.isEmpty()) {
            for (Map.Entry<String, List<String>> entry : entries) {
                String state = entry.getKey();
                List<String> stateSet = entry.getValue();
                //找出该广播台覆盖的州与未覆盖州的交集
                Set<String> coveredState = new HashSet<>(stateSet);
                coveredState.retainAll(neededStates);
                if (coveredState.size() > size) {
                    size = coveredState.size();
                    bestState = state;
                }
            }
            finalState.add(bestState);
            neededStates.removeAll(stateMap.get(bestState));
            size = 0;
        }
        for (String s : finalState) {
            System.out.println(s);
        }

    }
}
