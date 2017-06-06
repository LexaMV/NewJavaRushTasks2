package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import javax.xml.bind.attachment.AttachmentMarshaller;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       String s = reader.readLine();
       String s1 = reader.readLine();

        File file = new File(s);
        File file1 = new File(s1);
        FileReader file1r = new FileReader(file);
        FileWriter file1wr = new FileWriter(file1);

        String b = "";

        while(file1r.ready())
        {
           char o = (char)file1r.read();
           b +=o;
        }

        String[] t = b.split(" ");

        ArrayList<Double> list = new ArrayList<>();

        for(int i = 0; i < t.length; i++)
        {
            list.add(Double.parseDouble(t[i]));
        }

        for(Double r : list)
        {
            int h = (int) Math.round(r);
            String u =Integer.toString(h);
            String k = " ";
            file1wr.write(u+k);

            file1wr.flush();
        }

        file1wr.flush();
        reader.close();
        file1wr.close();
        file1r.close();
    }
}
