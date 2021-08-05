package com.djk.leetcode.Top100;

public class No75
{
    public void sortColors(int[] nums) {

        int num0 = 0, num1 = 0, num2 = 0;

        for(int i =0;i<nums.length;i++){
            if(nums[i] == 0){
                nums[num0++] = 0;
                nums[num1++] = 1;
                nums[num2++] = 2;
            }else if(nums[i] == 1){
                nums[num1++] = 1;
                nums[num2++] = 2;
            }else{
                nums[num2++] = 2;
            }
        }


    }
}
