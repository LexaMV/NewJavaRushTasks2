package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
    String s ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    char[] milk = s.toCharArray();
    String d = args[0];
    FileInputStream file = new FileInputStream(d);
        ArrayList<Character> list = new ArrayList<>();
    while (file.available() > 0){
        char c = (char)file.read();
        list.add(c);
    }

    int c = 0;

    for(int i = 0; i < milk.length; i++){
        for(int h = 0; h < list.size(); h++)
        {
            if (milk[i] == list.get(h)){
                c++;
            }
        }
    }

    System.out.println(c);
        file.close();


    }
}
