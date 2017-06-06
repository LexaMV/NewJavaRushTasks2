package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        int y = 0;
        while(true){
            String s = reader.readLine();
            if(s.equals("-1")){
                break;
            }
            else
            {
                n+=Integer.parseInt(s);
            y++;}
        }
        System.out.println((double)n/y);
    }
}

