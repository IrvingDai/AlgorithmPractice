package com.djk.leetcode.Top100;

public class No240 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length - 1;
        int col = 0;

        if(matrix.length==0)
            return false;

        while(true){
            if(row<0 || col >= matrix[0].length){
                return false;
            }

            if(target == matrix[row][col]){
                return true;
            }else if(target > matrix[row][col]){
                col++;
            }else if(target < matrix[row][col]){
                row--;
            }
        }

    }

}
