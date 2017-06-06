package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
Подсчет запятых
С консоли считать имя файла.
Посчитать в файле количество символов ‘,‘, количество вывести на консоль.
Закрыть потоки.

Подсказка:
нужно сравнивать с ascii-кодом символа ‘,‘.


Требования:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль должно выводится число запятых в считанном файле.
4. Поток чтения из файла должен быть закрыт.


*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution  {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream file = new FileInputStream(s);
        ArrayList<Integer> list = new ArrayList<>();
        while(file.available() > 0)
        {
            int c = file.read();
            list.add(c);
        }
        int a = 0;
        for(Integer g:list)
        {
            if (g==44)
            {a++;}

        }

        System.out.println(a);
        file.close();
    }
}
