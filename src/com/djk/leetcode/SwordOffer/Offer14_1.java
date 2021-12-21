package com.djk.leetcode.SwordOffer;

/**
 * @author ：djk
 * @description：TODO
 * @date ：2021/12/18 11:22
 */
public class Offer14_1 {
    public int cuttingRope(int n) {

        if(n == 2){
            return 1;
        }
        if(n == 8){
            return 18;
        }

        int t, res = Integer.MIN_VALUE;
        for(int i = 2; i <= n; i++){
            int num = n / i, sum = 1;
            t = n;
            while(t > num){
                sum *= num;
                t -= num;
            }
            res = Math.max(Math.max(sum * t, sum / num * (t + num)), res);

        }

        return res;
    }

    public static void main(String[] args){

        Offer14_1 one = new Offer14_1();
        System.out.println(one.cuttingRope(11));

    }
}
