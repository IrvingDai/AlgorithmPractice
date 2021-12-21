package com.djk.Temp;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

class SuperClass {


    public static String[] scoresort(String[] name, String[] score){

        Map<String,Integer> one = new HashMap<>();

        for(int i =0;i<3;i++){
            String[] prescore = score[i].split(",");
            int sum = 0;
            for(int j = 0;j<prescore.length;j++){
                sum += Integer.parseInt(prescore[j]);
            }
            one.put(name[i],sum);
        }
        Map<String, Integer> result = one.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oleValue, newValue) -> oleValue, LinkedHashMap::new));

        String[] res = result.entrySet().toString().split(",");
        String[] ans = new String[3];
        for(int i = 2;i>=0;i--){
            ans[i] = res[2-i].split("=")[0].substring(1);
        }
        return ans;
    }
    public static void main(String[] args){

        int i = 0;
        int[] array = new int[1];
        f(i,array);
        System.out.print(i+"  "+ array[0]);
    }

    public static void f(int i,int[] array){
        i=1;
        array[0] = 1;
    }



}
