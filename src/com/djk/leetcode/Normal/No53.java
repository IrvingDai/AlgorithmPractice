package com.djk.leetcode.Normal;

/**
 * @author ：djk
 * @description：TODO
 * @date ：2021/12/10 21:11
 */
public class No53 {

    public int maxSubArray(int[] nums) {

        int result = Integer.MIN_VALUE;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
        }

        for(int i = 0; i < nums.length; i++){
            result = Math.max(result, dp[i]);
        }
        return result;
    }

}
