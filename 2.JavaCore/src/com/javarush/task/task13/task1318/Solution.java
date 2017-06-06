package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/*
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new FileInputStream(br.readLine());
        while (in.available() > 0) {
            System.out.print((char) in.read());
        }
        System.out.println(); // без этого не принимается
        br.close();
        in.close();


        //  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String s = reader.readLine();// напишите тут ваш код
        //   FileReader file = new FileReader(reader.readLine());
        //   String u ="";

        //    while(file.read() > 0)
        // {
        //   int b = file.read();
        //    char i = (char) b;
        //     u += i;
    }

    //     System.out.print(u);
    //     System.out.println();
    //     reader.close();
    //     file.close();

}


