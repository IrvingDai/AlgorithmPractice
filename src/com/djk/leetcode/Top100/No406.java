package com.djk.leetcode.Top100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author ：djk
 * @description：TODO
 * @date ：2021/11/12 10:07
 */
public class No406 {

    public int[][] reconstructQueue(int[][] people) {

        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] != o2[0]){
                    return o2[0] - o1[0];
                }else{
                    return o1[1] - o2[1];
                }
            }
        });

        List<int[]> res = new ArrayList<>();
        for(int i = 0; i < people.length; i++){
            if(res.size() > people[i][1]){
                res.add(people[i][1], people[i]);
            }else {
                res.add(res.size(), people[i]);
            }
        }

        return res.toArray(new int[people.length][]);

    }


}
