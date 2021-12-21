package com.djk.leetcode.Top100;

public class No312 {

    public int maxCoins(int[] nums) {

        int[] nums_temp = new int[nums.length + 2];
        nums_temp[0] = nums_temp[nums.length + 1] = 1;
        for(int i = 1; i <= nums.length; i++){
            nums_temp[i] = nums[i - 1];
        }

        int[][] dp = new int[nums.length + 1][nums.length + 1];

        for(int i = 0; i <= nums.length; i++){
            dp[i][i] = nums[i - 1] * nums[i] * nums[i + 1];
        }

        for(int i = 2; i < nums.length - 1; i++){
            for(int j = 1; j < nums.length - i; j++){
                for(int k = j; k < j + i; k++){

                }
            }
        }


        return dp[1][nums.length];



    }

}
