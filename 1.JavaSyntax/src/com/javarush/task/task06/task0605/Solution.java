package com.javarush.task.task06.task0605;


import java.io.*;

/* 
Контролируем массу тела

рограмма должна считывать введенные пользователем вес в килограммах и рост в метрах и выводить на экран сообщение о индексе массы тела.
Реализуй статический метод класса Body. Метод должен определить индекс массы тела, и вывести на экран сообщение:
«Недовес: меньше чем 18.5» — если индекс массы тела меньше 18.5,
«Нормальный: между 18.5 и 24.9» — если индекс массы тела между 18.5 и 24.9,
«Избыточный вес: между 25 и 29.9» — если индекс массы тела между 25 и 29.9,
«Ожирение: 30 или больше» — если индекс массы тела 30 или больше.

Подсказка:
Индекс массы тела = вес в кг / (рост в метрах * рост в метрах)

Пример вывода для 68.4 и 1.77:
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.massIndex(weight, height);
    }

    public static class Body {
        public static void massIndex(double weight, double height) {
           double a = weight/(height*height);
            if(a < 18.5) {
                System.out.println("Недовес: меньше чем 18.5");//напишите тут ваш код
            }
           if (18.5 <= a && a < 24.9) {
                System.out.println("Нормальный: между 18.5 и 24.9");
            }
        if (25 < a && a < 29.9) {
                System.out.println("Избыточный вес: между 25 и 29.9");
            }

            if (a >= 30){
            System.out.println("Ожирение: 30 или больше");}
        }
    }
}
