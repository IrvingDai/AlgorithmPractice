package com.djk.leetcode.EveryDay;


/**
 * 简单 注意long
 */

public class No1894 {

    public static int chalkReplacer(int[] chalk, int k) {

        long sum = 0;
        for(int j = 0; j < chalk.length; j++){
            sum += chalk[j];
        }
        k = (int) (k % sum);
        int i=0;
        while(k>=0){
            k-=chalk[i%chalk.length];
            i++;
        }
        return (--i)%chalk.length;

    }

    public static void main(String[] args){


        int[] ints = new int[4];
        ints[0]=3;
        ints[1]=4;
        ints[2]=1;
        ints[3]=2;

        int res= chalkReplacer(ints,25);
        System.out.println(res);
    }
}
