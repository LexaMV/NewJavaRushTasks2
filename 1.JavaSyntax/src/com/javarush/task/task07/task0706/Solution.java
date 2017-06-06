package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] list = new int[15]; //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int a = 0; a <15; a++ ){
        list[a] = Integer.parseInt(reader.readLine());}
        int a = 0;
        int b = 0;
        for(int i = 0; i < 14; i++){
            if (i == 0 || i % 2 == 0){
                a += list[i];
            }
            if (i % 2 != 0){
                b += list[i];
            }
        }
        if (a > b)
        {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
