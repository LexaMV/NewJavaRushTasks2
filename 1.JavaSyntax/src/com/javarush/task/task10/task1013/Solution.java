package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int age;
        private int weight;
        private int heigth;
        private boolean wife;
        private boolean cat;
        private  boolean dog;

       public Human(){};

        public Human(int age){};

        public Human(int age, int weight){};

        public Human(int heigth, boolean wife){}

        public Human(boolean wife, int heigth){}

        public Human(int heigth, int weight, boolean wife){}

        public Human(int heigth, boolean wife, int weight){}

        public Human(int weight, boolean wife, boolean cat){}

        public Human(int heigth, int weight, boolean wife, boolean cat){}

        public Human(int heigth, int weight, boolean wife, boolean cat, boolean dog){}

        Human(boolean wife, boolean cat, boolean dog){}





        // напишите тут ваши переменные и конструкторы
    }
}
