package com.javarush.task.task13.task1321;


/* 
Исправление ошибок

1. Переделай наследование в классах и интерфейсах так, чтобы программа компилировалась и продолжала делать то же самое.
2. Класс Hobbie должен наследоваться от интерфейсов Desire, Dream.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Hobbie HOBBIE = new Hobbie();
        System.out.println(HOBBIE.toString());
        System.out.println(new Hobbie().INDEX);
    }

    interface Desire {
    }

    interface Dream {

    }

    static class Hobbie implements Desire, Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}
