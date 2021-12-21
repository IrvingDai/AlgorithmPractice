package com.djk.leetcode.Top100;

/**
 * @author ：djk
 * @description：TODO
 * @date ：2021/12/7 21:19
 */
public class No31 {

    public void nextPermutation(int[] nums) {

        if(nums.length == 1){
            return;
        }

        for(int i = nums.length - 1; i > 0; i--){
            if(nums[i] > nums[i - 1]){
                int t = nums.length - 1;
                while(true){
                    if(nums[t] > nums[i - 1]){
                        int temp = nums[i - 1];
                        nums[i - 1] = nums[t];
                        nums[t] = temp;
                        break;
                    }
                    t--;
                }
                if(nums.length - i > 2){
                    int low = i, high = nums.length - 1;
                    while (low < high){
                        int temp2 = nums[low];
                        nums[low] = nums[high];
                        nums[high] = temp2;
                        low++;
                        high--;
                    }
                }
                return;
            }
        }

        int low = 0, high = nums.length - 1;
        while(low < high){
            int temp2 = nums[low];
            nums[low] = nums[high];
            nums[high] = temp2;
            low++;
            high--;
        }
        String str2 = "重地";
        str2.hashCode();
    }

}

