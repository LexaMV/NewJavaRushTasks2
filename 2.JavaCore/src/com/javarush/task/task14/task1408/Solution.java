package com.javarush.task.task14.task1408;

/* 
Куриная фабрика

Написать Фабрику(Factory) по производству кур(Hen):






7. В каждом из четырех последних классов написать свою реализацию метода getDescription.

Методы должны возвращать строку вида:
<getDescription() родительского класса> + <» Моя страна — Sssss. Я несу N яиц в месяц.»>
где Sssss — название страны
где N — количество яиц в месяц

8. В классе HenFactory реализовать метод getHen, который возвращает соответствующую стране породу кур.
9. Все созданные вами классы должны быть в отдельных файлах.


Требования:
1. Класс Hen должен быть абстрактным.
2. Класс Hen должен содержать абстрактный метод int getCountOfEggsPerMonth().
3. В классе Hen должен быть реализован метод String getDescription(), который возвращает строку "Я - курица.".
4. Классы RussianHen, UkrainianHen, MoldovanHen и BelarusianHen должны наследоваться от класса Hen и быть созданы в отдельных файлах.
5. Классы RussianHen, UkrainianHen, MoldovanHen и BelarusianHen должны реализовывать метод getCountOfEggsPerMonth, который должен возвращать количество яиц в месяц от данного типа куриц.
6. Классы RussianHen, UkrainianHen, MoldovanHen и BelarusianHen должны переопределять метод getDescription родительского класса, таким образом, чтобы возвращаемая ими строка имела вид: + < Моя страна - Sssss. Я несу N яиц в месяц.> где Sssss - название страны, а N - количество яиц в месяц.
7. Метод getHen должен быть реализован в классе HenFactory и должен возвращать тип кур для переданной в него страны.
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        //System.out.print(hen.getCountOfEggsPerMonth());
       // System.out.print(hen.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country.equals("Belarus"))//напишите тут ваш код
                return new BelarusianHen();
            if (country.equals("Russia"))//напишите тут ваш код
                return new RussianHen();
            if (country.equals("Moldova"))//напишите тут ваш код
                return new MoldovanHen();
            if (country.equals("Ukraine"))//напишите тут ваш код
                return new UkrainianHen();
            return hen;
        }
    }

}
