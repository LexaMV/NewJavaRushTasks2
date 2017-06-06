package com.javarush.task.task19.task1906;

/* 
Четные байты
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        FileReader file1 = new FileReader(s1);
        ArrayList<Integer> list = new ArrayList<>();
        FileWriter file2 = new FileWriter(s2);
        while(file1.ready()){
            int c = file1.read();
            list.add(c);
        }

        for(int i = 0; i < list.size(); i++)
        {
            if (i % 2 != 0){
                file2.write(list.get(i));
               // file2.write(list.get(i));
            }
        }

        file2.flush();
        reader.close();
        file1.close();
        file2.close();
    }
}
