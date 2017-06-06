package com.javarush.task.task18.task1809;

/* 
Реверс файла
Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.


Требования:
1. Программа должна два раза считать имена файлов с консоли.
2. Для чтения из файла используй поток FileInputStream, для записи в файл - FileOutputStream
3. Во второй файл нужно записать все байты из первого в обратном порядке.
4. Потоки FileInputStream и FileOutputStream должны быть закрыты.

*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        FileInputStream file1 = new FileInputStream(s1);
        FileOutputStream file2 = new FileOutputStream(s2);
        ArrayList<Integer> list = new ArrayList<>();

        while (file1.available() > 0) {
            int c = file1.read();
            list.add(c);
        }

        for (int i = list.size() - 1;  i > -1; i--)
        {
            file2.write(list.get(i));
        }

        file2.flush();

        file1.close();
        file2.close();
}
}
