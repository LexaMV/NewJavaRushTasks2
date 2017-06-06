package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {

        if (n < 0) {
            String g = "" + 0;
            return g;
        }
        if (n == 0) {
            String g = "" + 1;
            return g;
        } else {
            int b = 1;

            for (int i = 1; i < n + 1; i++) {
               // BigInteger time = new BigInteger();
                b = b * i;//add your code here
            }

            String g = "" + new BigInteger(Integer.toString(b));
            return g;
        }
    }
}
