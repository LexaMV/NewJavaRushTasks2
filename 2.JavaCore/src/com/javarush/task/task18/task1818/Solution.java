package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     String s1 = reader.readLine();
     String s2 = reader.readLine();
     String s3 = reader.readLine();

     File file1 = new File(s1);
     File file2 = new File(s2);
     File file3 = new File(s3);

     FileReader file2r = new FileReader(file2);
     FileWriter file2wr = new FileWriter(file1, true);

     FileReader file3r= new FileReader(file3);
        FileWriter file3wr = new FileWriter(file1, true);

     while(file2r.ready()){
         int c = file2r.read();
         file2wr.write(c);
     }
     file2wr.flush();

        while(file3r.ready()){
            int c = file3r.read();
            file3wr.write(c);
        }
        file3wr.flush();
     reader.close();
        file2r.close();
                file2wr.close();
        file3r.close();
                file3wr.close();
    }

}
