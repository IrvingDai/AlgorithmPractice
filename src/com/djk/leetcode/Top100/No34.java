package com.djk.leetcode.Top100;

public class No34 {

    /**
     * 二分
     * @param nums
     * @param target
     * @return
     */

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        if(nums.length == 0)
            return ans;
        if(target < nums[0] || target > nums[nums.length-1])
            return ans;

        int low = 0,high = nums.length - 1;
        int tag = (low + high) / 2;
        while(low <= high){
            tag = (low + high) / 2;
            if(nums[tag] >= target){
                high = tag - 1;
                ans[0] = tag;
            }else{
                low = tag + 1;
            }
        }

        while (true){
            if(nums[tag] == target){
                ans[0] = tag--;
            }else
                break;
            if(tag < 0)
                break;
        }
        tag = ans[0];
        while (true){
            if(nums[tag] == target){
                ans[1] = tag++;
            }else
                break;
            if(tag == nums.length)
                break;
        }

        if (ans[0] <= ans[1] && ans[1] < nums.length && nums[ans[0]] == target && nums[ans[1]] == target) {
            return ans;
        }else{
            return new int[]{-1, -1};
        }

    }

    public static void main(String[] args) {
        int[] nums = new int[6];
        nums[0] = 5;
        nums[1] = 7;
        nums[2] = 7;
        nums[3] = 8;
        nums[4] = 8;
        nums[5] = 10;
//        nums[6] = 18;
//        nums[7] = 19;
        int[] ans = searchRange(nums, 8);
        System.out.println(ans[0] + "  " + ans[1]);
    }


}
