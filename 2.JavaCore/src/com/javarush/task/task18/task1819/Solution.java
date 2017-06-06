package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s1 = reader.readLine();
        File file1 = new File(s);
        File file2 = new File(s1);

        FileReader file1r = new FileReader(file1);
        FileReader file2r = new FileReader(file2);
        FileWriter file2rw = new FileWriter(file1, true);

        ArrayList<Integer> list = new ArrayList<>();

        while(file1r.ready())
        {
            int c = file1r.read();
            list.add(c);
        }

        while(file2r.ready())
        {
            int c = file2r.read();
            file2rw.write(c);
        }

        file2rw.flush();

        for(Integer f : list)
        {
            file2rw.write(f);
        }

        file2rw.flush();

        reader.close();
        file1r.close();
        file2r.close();
        file2rw.close();


    }
}
