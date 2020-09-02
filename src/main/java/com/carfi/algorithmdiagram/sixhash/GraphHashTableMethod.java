package com.carfi.algorithmdiagram.sixhash;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * com.carfi.algorithmdiagram.sixhash$
 * 图，散列表
 * bob : wuwu zhazha sad dsa
 * wuwu : uu dd df
 * dd : hjj wuwu
 * @author ll
 * @date 2020-09-02 16:39:34
 **/
public class GraphHashTableMethod {
    public static void main(String[] args) {
        Map<String, List<String>> map1 = new HashMap<>();
        List<String> list1 = new ArrayList<>(4);
        list1.add("wuwu");
        list1.add("zhazha");
        list1.add("sad");
        list1.add("dsa");
        List<String> list2 = new ArrayList<>(4);
        list1.add("uu");
        list1.add("dd");
        list1.add("df");
        list1.add("bob");
        List<String> list3 = new ArrayList<>(2);
        list1.add("hjj");
        list1.add("wuwu");
        map1.put("bob", list1);
        map1.put("wuwu", list2);
        map1.put("dd", list3);

        Queue<String> queueSearch = new LinkedBlockingQueue<>();
        List<String> queueDiff = new LinkedList<>();
        queueSearch.add("bob");
        queueSearch.add("wuwu");
        queueSearch.add("dd");
        while (!queueSearch.isEmpty()) {
            String poll = queueSearch.poll();
            if (queueDiff.contains(poll)) {
                continue;
            }
            queueDiff.add(poll);
            if (poll.contains("j")) {
                System.out.println(poll);
                break;
            } else if (map1.get(poll) != null) {
                queueSearch.addAll(map1.get(poll));
            }
        }
    }
}
