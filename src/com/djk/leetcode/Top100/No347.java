package com.djk.leetcode.Top100;

import java.util.*;

/**
 * @author ：djk
 * @description：TODO
 * @date ：2021/11/13 15:18
 */
public class No347 {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(counts.containsKey(nums[i])){
                counts.put(nums[i], counts.get(nums[i]) + 1);
            }else{
                counts.put(nums[i], 1);
            }
        }
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((e1, e2) -> e2.getValue() - e1.getValue());
        queue.addAll(counts.entrySet());
        int[] ans = new int[k];
        for (int i = 0; i < k && !queue.isEmpty(); ++i){
            ans[i] = queue.poll().getKey();
        }
        return ans;

    }
}
