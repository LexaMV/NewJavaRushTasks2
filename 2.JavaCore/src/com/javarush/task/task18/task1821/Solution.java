package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
       // String s = args[0];
       // File file = new File(args[0]);
        FileInputStream stream = new FileInputStream("c:\\kiska.txt");
       // File file = new File(args[0]);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 32; i < 127; i++){
            list.add(i);
        }

        ArrayList<Integer> list2 = new ArrayList<>();
        while(stream.available()>0){
            int c = stream.read();
            list2.add(c);
            }

        Collections.sort(list2);

       // for (int i = list2.size()-1; 0 < i; i--)
       // {
        //    if (list2.get(i).equals(list2.get(i-1)))
       //     {
       //         list2.remove(i);
       //     }
      //  }



        for (Integer j : list2)
        {
            System.out.println(j);
        }

        for(int i = 0; i < list.size(); i++){
            int a = 0;
            for(int y = 0; y < list2.size(); y++){
                if(list.get(i).equals(list2.get(y)))
                {
                    a++;
                }
            }


            int b = list2.get(i);
            char h = (char)b;
            System.out.println(h + " " + a);
        }
        stream.close();
    }
}
