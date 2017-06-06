package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики 1
*/



public class Solution {

    public static Map<Double, String> labels = new HashMap<Double, String>();

    static   {
        labels.put(4.5,"oprwkopk");
        labels.put(4.6,"oprwko5pk");
        labels.put(4.7,"oprwk6pk");
        labels.put(4.8,"oprw7kopk");
        labels.put(4.9,"opr8wkopk");
    }


    public static void main(String[] args) {




        System.out.println(labels);
    }
}
