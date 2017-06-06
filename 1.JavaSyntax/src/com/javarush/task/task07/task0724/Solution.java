package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human human1 = new Human("Игорь", true, 55);
        Human human2 = new Human("Костя", true, 56);
        Human human3 = new Human("Катя", false, 53);
        Human human4 = new Human("Маша", false, 53);
        Human human5 = new Human("Аня", false, 35, human1, human3);
        Human human6 = new Human("Вася", true, 40, human2, human4);
        Human human7 = new Human("Маша", false, 15, human5, human6);
        Human human8 = new Human("Иллона", false, 14, human5, human6);
        Human human9 = new Human("Леха", true, 13, human5, human6);

        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(human3.toString());
        System.out.println(human4.toString());
        System.out.println(human5.toString());
        System.out.println(human6.toString());
        System.out.println(human7.toString());
        System.out.println(human8.toString());
        System.out.println(human9.toString());

    }

    public static class Human {
       public  String name;
       public boolean sex;
       public  int age;
       Human mother;
       Human father;

        Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }


       Human(String name, boolean sex, int age, Human mother, Human father){
           this.name = name;
           this.sex = sex;
           this.age = age;
           this.mother = mother;
           this.father = father;
       }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















