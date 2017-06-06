package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Файл в статическом блоке
*/

public class Solution extends Statics{

    public static List<String> lines = new ArrayList<String>();
    static{

            //BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));

             File file = new File(Statics.FILE_NAME);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(scanner.hasNext())
            {
               String s = scanner.nextLine();
               lines.add(s);
            }
    }


    public static void main(String[] args) {

        System.out.println(lines);

    }
}
