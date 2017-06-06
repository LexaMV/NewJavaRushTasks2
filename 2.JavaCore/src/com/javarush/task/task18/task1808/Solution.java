package com.javarush.task.task18.task1808;

/* 


Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
Закрыть потоки.


Требования:
1. Программа должна три раза считать имена файлов с консоли.
2. Для чтения из файла используй поток FileInputStream, для записи в файлы - FileOutputStream
3. Первую половину байт из первого файла нужно записать во второй файл.
4. Вторую половину байт из первого файла нужно записать в третий файл.
5. Потоки FileInputStream и FileOutputStream должны быть закрыты.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        FileInputStream file1 = new FileInputStream(s1);
       // FileInputStream file2in = new FileInputStream(s2);
        FileOutputStream file2out = new FileOutputStream(s2);
      //  FileInputStream file3in = new FileInputStream(s3);
        FileOutputStream file3out = new FileOutputStream(s3);
        ArrayList<Integer> list = new ArrayList<>();

        while (file1.available() > 0) {
            int c = file1.read();
            System.out.println(c);
            list.add(c);
        }

        if (list.size() % 2 == 0) {
            for (int i = 0; i < list.size() / 2; i++) {
                file2out.write(list.get(i));
            }
            for (int i = list.size() / 2; i < list.size(); i++) {
                file3out.write(list.get(i));
            }
        }

        if (!(list.size() % 2 == 0)) {
            for (int i = 0; i < (list.size() / 2) + 1; i++) {
                file2out.write(list.get(i));
            }
            for (int i = (list.size() / 2) + 1; i < list.size(); i++) {
                file3out.write(list.get(i));
            }
        }


        file2out.flush();
        file3out.flush();

        file1.close();
        file2out.close();
        file3out.close();
    }
}
