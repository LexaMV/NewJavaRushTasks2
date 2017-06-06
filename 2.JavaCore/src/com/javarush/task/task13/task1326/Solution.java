package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        Scanner scanner = new Scanner(file);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        while(scanner.hasNext())
        {
            int x = scanner.nextInt();
            list.add(x);
            //System.out.println(x);
        }

        for(Integer g:list)
        {
            if(g % 2 == 0)
            {
                list2.add(g);
            }
        }

        Collections.sort(list2);

        for(Integer h:list2)
       {
            System.out.println(h);
        }
        file.close();
        scanner.close();
        reader.close();
}
}
