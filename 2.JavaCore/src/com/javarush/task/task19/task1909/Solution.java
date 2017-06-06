package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String s="";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String h = reader.readLine();
        String k = reader.readLine();

        BufferedReader r1 = new BufferedReader(new FileReader(h));
        BufferedWriter r2 = new BufferedWriter(new FileWriter(k));

        //FileReader file1 = new FileReader(h);
       // FileWriter file2 = new FileWriter(k);
        while (r1.ready()){
            s = r1.readLine().replaceAll("\\.","!");
            r2.write(s);
        }

  //     s = s.toLowerCase();
        //    System.out.println(s);
     //   s = s.replaceAll("[\\p{Punct}+|\\s]"," ");
     //   String[] lineArr = s.split(" ");
     //   int a= 0;
       // for (int i = 0; i < lineArr.length; i++) {
      //      if (lineArr[i].equals("world")){
      //          a++;
     //       }
     //   }

       // System.out.println(a);
        reader.close();
        r1.close();
        r2.close();
    }
}


