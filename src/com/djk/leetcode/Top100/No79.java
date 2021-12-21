package com.djk.leetcode.Top100;


/**
 * 回溯
 */
public class No79 {

    static boolean flag = false;

    public static boolean exist(char[][] board, String word) {
        boolean visit[][] = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                visit[i][j] = false;
            }
        }
        boolean res = false;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                dfs(i, j, 0, board, word, visit);
            }
        }

        return flag;
    }

    static boolean dfs(int row, int col, int index, char[][] board, String word, boolean[][] visited){

        if(index >= word.length() || flag){
            flag = true;
            return true;
        }
        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length)
            return false;
        if(visited[row][col])
            return false;

        if(board[row][col] == word.charAt(index)){
            visited[row][col] = true;
            dfs(row + 1, col, index + 1, board, word, visited);
            dfs(row - 1, col, index + 1, board, word, visited);
            dfs(row, col + 1, index + 1, board, word, visited);
            dfs(row, col - 1, index + 1, board, word, visited);
            visited[row][col] = false;
            return false;
        }else{
            return false;
        }

    }

    public static void main(String[] args){
        char[][] board = new char[3][4];
        board[0][0] = 'A';
        board[0][1] = 'B';
        board[0][2] = 'C';
        board[0][3] = 'E';
        board[1][0] = 'S';
        board[1][1] = 'F';
        board[1][2] = 'C';
        board[1][3] = 'S';
        board[2][0] = 'A';
        board[2][1] = 'D';
        board[2][2] = 'E';
        board[2][3] = 'E';
        String word = "ABCD";
        boolean res = exist(board, word);
        System.out.println(res);
    }

}
