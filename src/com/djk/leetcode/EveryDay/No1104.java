package com.djk.leetcode.EveryDay;

import java.util.ArrayList;
import java.util.List;

public class No1104 {


    public static List<Integer> pathInZigZagTree(int label) {
        List<Integer> temp = new ArrayList<>();
        int init = label;
        int t = 1;
        temp.add(1);
        while(t <= 1000000){
            t *= 2;
            temp.add(t+t*2-1);
        }
        List<Integer> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        if(init == 1){
            return ans;
        }
        result.add(label);
        while(label>1){
            result.add(label/2);
            label /= 2;
        }
        for(int i = result.size()-2; i>0; i--){
            if((result.size()-i)%2!=(result.size()%2)){
                ans.add(temp.get(result.size()-i-1)-result.get(i));
            }else {
                ans.add(result.get(i));
            }
        }
        ans.add(init);
        return ans;
    }

    public static void main(String args[]){

        System.out.println(pathInZigZagTree(100));

    }
}
