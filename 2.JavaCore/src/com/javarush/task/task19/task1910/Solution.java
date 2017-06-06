package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String s="";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String h = reader.readLine();
        String k = reader.readLine();

        BufferedReader r1 = new BufferedReader(new FileReader(h));
        BufferedWriter r2 = new BufferedWriter(new FileWriter(k));


        while (r1.ready()){
            s = r1.readLine().replaceAll("\\p{Punct}","");
            r2.write(s);
        }

        reader.close();
        r1.close();
        r2.close();
    }
}



