package com.djk.leetcode.Top100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 有点麻烦
 */
public class No56 {

    public int[][] merge(int[][] intervals) {


        List<int[]> res = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int left = 0, right = 1, temp = 0;
        int right_num = intervals[0][1];

        while(true){
            if(left == intervals.length - 1){
                res.add(new int[]{intervals[left][0], intervals[left][1]});
                break;
            }
            if(right == intervals.length){
                res.add(new int[]{intervals[left][0], Math.max(intervals[right - 1][1], right_num)});
                break;
            }
            if(right_num >= intervals[right][0]){
                right_num = Math.max(right_num, intervals[right][1]);
                right++;
            }else{
                res.add(new int[]{intervals[left][0], right_num});
                left = right;
                right = left + 1;
                right_num = intervals[left][1];
                temp++;
            }
        }

        return res.toArray(new int[0][]);
    }

    public static void main(String[] args){
        No56 one = new No56();
        int[][] ins = new int[4][2];

        ins[0][0] = 1;ins[0][1] = 3;
        ins[1][0] = 2;ins[1][1] = 6;
        ins[2][0] = 8;ins[2][1] = 10;
        ins[3][0] = 15;ins[3][1] = 18;

        one.merge(ins);

    }


}
