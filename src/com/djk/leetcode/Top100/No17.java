package com.djk.leetcode.Top100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 回溯
 */
public class No17 {

    List<String> res = new ArrayList<>();
    Map<Character,String> nums = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        
        if(digits.length() == 0){
            return res;
        }
        nums.put('2', "abc");
        nums.put('3', "def");
        nums.put('4', "ghi");
        nums.put('5', "jkl");
        nums.put('6', "mno");
        nums.put('7', "pqrs");
        nums.put('8', "tuv");
        nums.put('9', "wxyz");
        dfs(digits, 0, "");
        return res;
    }
    //digit:第几个按键  index:第几个数字
    public void dfs(String digits, int digit,String chars){

        if(digit >= digits.length()){
            res.add(chars);
            return;
        }
        String num = nums.get(digits.charAt(digit));
        for(int i = 0; i < num.length(); i++){
            String charsone = chars;
            chars += num.charAt(i);
            digit++;
            dfs(digits, digit, chars);
            digit--;
            chars = charsone;
        }


    }

    public static void main(String[] args){

        No17 one = new No17();

        List<String> res = one.letterCombinations("");

    }

}
