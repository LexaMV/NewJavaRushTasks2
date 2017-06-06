package com.javarush.task.task12.task1209;

/* 
Три метода и минимум

Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.


*/


public class Solution {
    public static void main(String[] args) {
     min(5,15);
     min(5.4, 4.3);
     min(11111111111L,22222222222L);
    }

    public static int min(int a, int b){
        if(a > b){
            return b;
        }
        return a;
    }

    public static long min(long a, long b){
        if(a > b){
            return b;
        }
        return a;
    }

    public static double min(double a, double b){
        if(a > b){
            return b;
        }
        return a;
    }

    //Напишите тут ваши методы
}
