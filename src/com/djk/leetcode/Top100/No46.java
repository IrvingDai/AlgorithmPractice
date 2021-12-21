package com.djk.leetcode.Top100;

import java.util.ArrayList;
import java.util.List;

public class No46 {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {

        List<Integer> one = new ArrayList<>();
        backtrack(one, nums);
        return res;
    }

    private void backtrack(List<Integer> one, int nums[]){
        if(one.size() == nums.length){
            res.add(new ArrayList<>(one));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!one.contains(nums[i])){
                one.add(nums[i]);
                backtrack(one, nums);
                one.remove(one.size() - 1);
            }

        }
    }

    public static void main(String[] args){
        int[] nums = {1};
        No46 test = new No46();
        List<List<Integer>> res = test.permute(nums);
        System.out.println(res);

    }


}
