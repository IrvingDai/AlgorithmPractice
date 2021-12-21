package com.djk.leetcode.Top100;

public class No221 {

    public int maximalSquare(char[][] matrix) {
        int res = 0;
        int temp = 0;
        int[][] dp = new int[matrix.length][matrix[0].length];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == '1'){
                    temp = 1;
                    dp[i][j] = 1;
                }
                else
                    dp[i][j] = 0;
            }
        }

        if(matrix.length == 1 || matrix[0].length == 1)
            return temp;

        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(dp[i - 1][j - 1] != 0 && matrix[i][j] != '0'){
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                res = Math.max(res,dp[i][j]);
            }
        }


        return res * res;
    }

    public static void main(String[] args){

        No221 one = new No221();

        char[][] mat = {{'0', '0', '0', '1'},{'1', '1', '0', '1'},{'1', '1', '1', '1'},{'0', '1', '1', '1'},{'0', '1', '1', '1'}};

        int res = one.maximalSquare(mat);

        System.out.println(res);
    }


}
