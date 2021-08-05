package com.djk.leetcode.Top100;

public class No48 {

    public static void rotate(int[][] matrix) {

        int n = matrix.length;
        for(int i = 0; i < n/2; i++){
            for(int j = i; j < n-i-1; j++){
                int temp = matrix[i][j];
                int row = i;
                int col = j;
                for(int k = 0; k < 3; k++){
                    matrix[row][col] = matrix[n-1-col][row];
                    int temp_row =row;
                    int temp_col = col;
                    row = n-1-temp_col;
                    col = temp_row;
                }
                matrix[row][col] = temp;
            }
        }

    }

    public static void main(String[] args) {

        int[][] matrix = new int[5][5];
        int count = 1;
        for(int i = 0;i <5;i++){
            for(int j=0;j<5;j++){
                matrix[i][j] = count;
                count++;
            }
        }

        rotate(matrix);

        for(int i = 0;i <5;i++){
            for(int j=0;j<5;j++){
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
