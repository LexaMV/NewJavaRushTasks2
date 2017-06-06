package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream file = new FileInputStream(fileName);
        ArrayList<Integer> bytes = new ArrayList<>();

        while (file.available() > 0)
        {
            bytes.add(file.read());
        }

        file.close();

        HashMap<Integer, Integer> map = new HashMap<>();

        initMapBytesCount(bytes, map);

        print(map, getMaxCount(map));
    }

    public static void print(HashMap<Integer, Integer> map, int maxCount){

        for(Map.Entry<Integer, Integer> pair : map.entrySet() )
        {
            if (pair.getValue() == maxCount)
                System.out.print(pair.getKey() + " ");
        }
    }

    public static int getMaxCount(HashMap<Integer, Integer> map){
        int maxCount = 0;

        for(Map.Entry<Integer, Integer> pair : map.entrySet() )
        {
            if (pair.getValue() > maxCount)
                maxCount = pair.getValue();
        }
        return maxCount;
    }

    public static void initMapBytesCount(ArrayList<Integer> bytes, HashMap<Integer, Integer> map){

        for (int i =0; i < bytes.size()-1; i++){
            int countSameBytes = 0;

            for (int n =i+1; n < bytes.size(); n++){
                if (bytes.get(n) == bytes.get(i))
                    countSameBytes++;
            }

            boolean contains = false;

            for(Map.Entry<Integer, Integer> pair : map.entrySet() )
            {
                if (pair.getKey() == bytes.get(i)){
                    contains = true;
                }
            }

            if(!contains){
                map.put(bytes.get(i), countSameBytes);
            }
        }
    }
}










/*
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



/*public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        FileInputStream file = new FileInputStream(filename);
        ArrayList<Byte> list1 = new ArrayList<>();
        ArrayList<Byte> list2 = new ArrayList<>();
        ArrayList<Byte> list3 = new ArrayList<>();

        while (file.available() > 0) {
            byte b = (byte)file.read();
            list1.add(b);
        }
        scanner.close();
        file.close();

        if (list1.isEmpty()) {
            System.out.println("файл пуст");
        } else {

            Collections.sort(list1);
              for (Byte f : list1) {
            System.out.print(f+" ");
        }

            System.out.println("");


            byte a = 0;
            for (int i = 0; i < list1.size() - 1; i++) {
                if (list1.get(i + 1).equals(list1.get(i))) {
                    a = (byte) (a +1);
                }
                if (!(list1.get(i + 1).equals(list1.get(i)))) {
                    list2.add(a);
                    list3.add(list1.get(i));
                    a = 0;
                }
            }

            byte k = list2.get(0);
            for (int i = 0; i < list2.size() - 1; i++) {
                // k = list2.get(0);
                if (k < list2.get(i + 1)) {
                    k = list2.get(i + 1);
                }
            }


            for (Byte f : list2) {
                  System.out.print(f +" ");
              }
            System.out.println("");
              for (Byte f : list3) {
                  System.out.print(f +" ");
               }
            System.out.println("");
             System.out.println(k);


           // String s = "";
            for (int i = 0; i < list2.size() - 1; i++) {
                if (list2.get(i).equals(k)) {
                    System.out.print(" "+ list3.get(i));
                }
               // System.out.print(s);


            }
        }
    }
}

*/