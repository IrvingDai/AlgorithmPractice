package com.djk.leetcode.Top100;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;

public class No47 {

    Set<List<Integer>> res = new HashSet<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        Boolean[] visited = new Boolean[nums.length];
        for(int i  = 0; i < nums.length; i++){
            visited[i] = false;
        }
        List<Integer> one = new ArrayList<>();
        backtrack(one, nums, visited);
        return new ArrayList<>(res);
    }

    private void backtrack(List<Integer> one, int nums[], Boolean[] visited) {
        if (one.size() == nums.length) {
            res.add(new ArrayList<>(one));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                one.add(nums[i]);
                visited[i] = true;
                backtrack(one, nums, visited);
                one.remove(one.size() - 1);
                visited[i] = false;
            }

        }
    }



    public static void main(String[] args){
        int[] nums = {1, 1, 2};
        No47 test = new No47();
        List<List<Integer>> res = test.permuteUnique(nums);
        System.out.println(res);

    }
}
