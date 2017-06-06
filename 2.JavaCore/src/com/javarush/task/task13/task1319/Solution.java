package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        File file = new File(s);
      // ArrayList<String> list = new ArrayList<>();
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        //FileWriter writer = new FileWriter(file);
        while(true){
            String b = reader.readLine();
            if(b.equals("exit")){
                writer.write("exit");
                break;
            }
            writer.write(b);
            writer.append("\n");
        }
        writer.flush();
        writer.close();
        reader.close();

        // напишите тут ваш код
    }
}
