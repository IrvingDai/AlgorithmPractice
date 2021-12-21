package com.djk.leetcode.Top100;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No22 {
    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();
        String insertstr="()";

        result.add("()");
        if(n == 1)
            return result;
        else {
            for(int i = 1; i < n; i++){
                Set<String> thisone = new HashSet<>();
                for(int j = 0; j < result.size(); j++){
                    String str = result.get(j);
                    StringBuilder sb = new StringBuilder(str);
                    for(int k = 0;k <= str.length(); k++){
                        sb.insert(k,"()");
                        thisone.add(sb.toString());
                        sb = new StringBuilder(str);
                    }
                }
                result.clear();
                result.addAll(thisone);
            }
        }


        return result;

    }

}
