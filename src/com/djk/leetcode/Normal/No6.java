package com.djk.leetcode.Normal;

public class No6 {

    public String convert(String s, int numRows) {
        String res = "";
        int num = numRows * 2 - 2;

        if(numRows == 1)
            return s;

        for(int i = 0; i < numRows; i++){
            int j = 0;
            while(j + i < s.length()){
                res = res + s.substring(j + i, j + i + 1);
                if(i != 0 && i != (numRows - 1) && (j + num - i) < s.length())
                    res += s.substring(j + num - i, j + num - i + 1);
                j += num;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        No6 one = new No6();

        System.out.println(one.convert("ABCD", 3));

    }


}
