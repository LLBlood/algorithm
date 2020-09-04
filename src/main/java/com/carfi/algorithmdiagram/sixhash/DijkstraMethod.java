package com.carfi.algorithmdiagram.sixhash;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * com.carfi.algorithmdiagram.sixhash$
 * 迪克斯特拉算法
 * @author ll
 * @date 2020-09-04 09:23:29
 **/
public class DijkstraMethod {
    public static void main(String[] args) {

        //总路程
        String jsonRoutStr = "{\"start\":{\"A\":6,\"B\":2},\"A\":{\"fin\":1},\"B\":{\"A\":3,\"fin\":5}}";
        Map<String, Map<String, Double>> routMap = new HashMap<>();
        routMap = JSON.parseObject(jsonRoutStr, new TypeReference<Map<String, Map<String, Double>>>(){});
        Double infinity = Double.POSITIVE_INFINITY;
        //对应的权重值
        String jsonCostStr = "{\"A\":6,\"B\":2}";
        Map<String, Double> costs = new HashMap<>();
        costs = JSON.parseObject(jsonCostStr, new TypeReference<Map<String, Double>>(){});
        costs.put("fin", infinity);
        //每个节点的父节点
        String jsonParentStr = "{\"A\":\"start\", \"B\":\"start\", \"fin\":\"NONE\"}";
        Map<String, String> parent = new HashMap<>();
        parent = JSON.parseObject(jsonParentStr, new TypeReference<Map<String, String>>(){});
        //存储已经处理过的值
        Set<String> set = new HashSet<>();

        //找出最小权重的节点
        String minCost = findMinFromCosts(costs, set);
        //当最小权重节点存在时，遍历它的邻居，然后更新新路径
        while (minCost != null) {
            //最小权重的节点对应的权重值
            Double minCostValue = costs.get(minCost);
            //最小权重的节点的邻居
            Map<String, Double> routeValueMap = routMap.get(minCost);
            if (routeValueMap != null) {
                Set<String> routStrs = routeValueMap.keySet();
                for (String routStr : routStrs) {
                    //找出邻居的权重
                    Double routeValue = routeValueMap.get(routStr);
                    routeValue += minCostValue;
                    //如果从最小权重节点到邻居的总权重小于邻居原本的权重，更新邻居的权重，并更新邻居的父节点
                    if (routeValue < costs.get(routStr)) {
                        costs.put(routStr, routeValue);
                        parent.put(routStr, minCost);
                    }
                }
            }
            //过滤最小节点
            set.add(minCost);
            //重新找最小节点
            minCost = findMinFromCosts(costs, set);
        }
        System.out.println(JSON.toJSONString(costs));
        System.out.println(JSON.toJSONString(parent));
    }

    private static String findMinFromCosts(Map<String, Double> costs, Set<String> set) {
        Set<String> strings = costs.keySet();
        Double minCostValue = null;
        String minCost = null;
        for (String string : strings) {
            if (set.contains(string)) {
                continue;
            }
            Double temp = costs.get(string);
            if (minCost == null || temp < minCostValue) {
                minCostValue = temp;
                minCost = string;
            }
        }
        return minCost;
    }
}
