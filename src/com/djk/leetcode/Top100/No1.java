package com.djk.leetcode.Top100;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ：djk
 * @description：TODO
 * @date ：2021/12/8 22:05
 */
public class No1 {

    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        Map<Integer, Integer> temp = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if (temp.containsKey(nums[i])) {
                result[0] = i;
                result[1] = temp.get(nums[i]);
                return result;
            }
            // 将数据存入 key为补数 ，value为下标
            temp.put(target - nums[i], i);
        }
        return result;
    }

}
