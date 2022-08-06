 package com.oms.reid;

import java.util.*;

public class A20220510 {
    public static void main(String[] args) {
        // a 가 b 를 신고 b가 K 번 이상 신고 당하는 경우 A 에게 메일 전송
        // 신고는 여러번 가능하나 1번만 적용
        String [] id_list = {"con", "ryan"};
        String [] report ={"ryan con", "ryan con", "ryan con", "ryan con"};
        int [] answer = new int[id_list.length];
        int k = 2;

        Arrays.fill(answer, 0);

        Map<String,List<String>> map = new HashMap<>();
        for (String s : report) {
            String reporter = s.split(" ")[0];
            String target = s.split(" ")[1];
            if(map.containsKey(target)){
              if(!map.get(target).contains(reporter)){
                 map.get(target).add(reporter);
              }
            } else {
                List<String> reporterList = new ArrayList<>();
                reporterList.add(reporter);
                map.put(target,reporterList);
            }
        }

        map.forEach((key, value) -> {
            if(value.size()>=k){
                for(String reporter : value){
                   int index = Arrays.asList(id_list).indexOf(reporter);
                   answer[index] ++;
                }
            }
        });
     }
}


/*
 TODO : 스트림에 대한 공부 후에 해당 문제를 다시 풀어보면 
*/
