package com.djk.leetcode.Normal;

/**
 * @author ：djk
 * @description：TODO
 * @date ：2021/12/11 22:13
 */
public class No58 {
    public int lengthOfLastWord(String s) {

        int count = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            count++;
            if(s.charAt(i) != ' ') {
                count++;
            }
            if(s.charAt(i) == ' ' && count != 0) {
                return count;
            }
        }
        return count;
    }
}
