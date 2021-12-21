package com.djk.leetcode.Top100;

/**
 * @author ：djk
 * @description：TODO
 * @date ：2021/11/23 22:35
 */
public class No70 {

    public int climbStairs(int n) {

        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for(int i = 2; i < n; i++){
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        return dp[n - 1];

    }

}
