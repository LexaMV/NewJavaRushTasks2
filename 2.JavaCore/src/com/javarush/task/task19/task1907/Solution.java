package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        String s="";
        String e ="";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String h = reader.readLine();
        FileReader file1 = new FileReader(h);

        while (file1.ready()){
            s += (char) file1.read();
        }
        s = s.toLowerCase();
    //    System.out.println(s);
        s = s.replaceAll("[\\p{Punct}+|\\s]"," ");
        String[] lineArr = s.split(" ");
        int a= 0;
        for (int i = 0; i < lineArr.length; i++) {
            if (lineArr[i].equals("world")){
                a++;
            }
        }

            System.out.println(a);
            reader.close();
            file1.close();
    }
}

