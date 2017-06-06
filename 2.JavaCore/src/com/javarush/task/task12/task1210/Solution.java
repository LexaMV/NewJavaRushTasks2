package com.javarush.task.task12.task1210;

/* 
Три метода и максимум
Написать public static методы: int max(int, int), long max(long, long), double max(double, double).
Каждый метод должен возвращать максимальное из двух переданных в него чисел.
*/

public class Solution {
    public static void main(String[] args) {

        max(5,6);
        max(54454L,343434L);
        max(3.4,5.6);
    }

    public static int max(int a, int b)
    {
        if(a>b)
        {
            return a;
        }
        return b;
    }

    public static long max(long a, long b)
    {
        if(a>b)
        {
            return a;
        }
        return b;
    }

    public static double max(double a, double b)
    {
        if(a>b)
        {
            return a;
        }
        return b;
    }


    //Напишите тут ваши методы
}
