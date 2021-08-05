package com.djk.leetcode.Top100;

public class No279 {

    public static int numSquares(int n) {
        int dp[] = new int[n+1];
        for(int i=1;i<n+1;i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j * j <= i; j++){
                dp[i] = Math.min(dp[i - j * j] + 1, dp[i]);
            }
        }

        return dp[n];
    }

    public static void main(String args[]){

        System.out.println(numSquares(13));




    }


}
