package com.djk.leetcode.Top100;

/**
 * @author ：djk
 * @description：TODO
 * @date ：2021/12/10 20:05
 */
public class No152 {

    public int maxProduct(int[] nums) {
        int result = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length - 1; i++){
            result = Math.max(result, nums[i]);
            int num = nums[i];
            for(int j = i + 1; j < nums.length; j++){
                num = num * nums[j];
                result = Math.max(result, num);
                if(num == 0)
                    break;
            }
        }
        result = Math.max(result, nums[nums.length - 1]);
        return result;

    }

}
