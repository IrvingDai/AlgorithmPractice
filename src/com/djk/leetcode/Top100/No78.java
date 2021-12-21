package com.djk.leetcode.Top100;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No78 {

    Set<List<Integer>> res = new HashSet<>();

    public List<List<Integer>> subsets(int[] nums) {

        List<Integer> one = new ArrayList<>();
        Boolean[] visited = new Boolean[nums.length];

        for(int i = 0; i < nums.length; i++){
            visited[i] = false;
        }

        //res.add(new ArrayList<>(one));

        backtrack(one, nums, visited, 0);

        return new ArrayList<>(res);

    }

    void backtrack(List<Integer> one, int[] nums, Boolean[] visited, int temp){

        res.add(new ArrayList<>(one));

        for(int i = temp; i < nums.length; i++){
            if(!visited[i]){
                visited[i] = true;
                one.add(nums[i]);
                backtrack(one, nums, visited, i + 1);
                one.remove(one.size() - 1);
                visited[i] = false;
            }
        }


    }

    public static void main(String[] args){

        No78 one = new No78();

        int[] nums = {1, 2, 3};
        System.out.println(one.subsets(nums));

    }

}
