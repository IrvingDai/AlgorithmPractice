package com.djk.leetcode.Top100;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No139 {

    public boolean wordBreak(String s, List<String> wordDict) {

        boolean dp[] = new boolean[s.length() + 1];
        Set<String> words = new HashSet<>(wordDict);
        dp[0] = true;

        for(int i = 1; i <= s.length(); i++){
            for(int j = 0; j < i; j++){
                if(dp[i - j - 1] && words.contains(s.substring(i - j - 1, i))){
                    dp[i] = true;
                }
            }
        }

        return dp[s.length()];

    }

    public static void main(String[] args){

        No139 one = new No139();

        List<String> wordDict = new ArrayList<>();
        wordDict.add("cat");
        wordDict.add("sand");
        wordDict.add("dog");

        boolean res = one.wordBreak("",wordDict);

        System.out.println(res);

    }

}
