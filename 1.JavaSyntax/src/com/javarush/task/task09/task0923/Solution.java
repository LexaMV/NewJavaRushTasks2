package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine(); //напишите тут ваш код
        char[] unit = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        for (char g : unit) {
            if (g == ' ') {
                continue;
            } else {
                if (isVowel(g)) {
                    list.add(g);
                     list.add(' ');
                } else {
                    list2.add(g);
                    list2.add(' ');
                }
            }
        }


            for (char u : list) {
                System.out.print(u);
            }

            System.out.println();
            for (char u : list2) {
                System.out.print(u);
            }


        }


    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}