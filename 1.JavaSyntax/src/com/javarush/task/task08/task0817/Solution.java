package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String,String> map = new HashMap<>();
        map.put("Егоров","Иван");
        map.put("Иванов","Иван");
        map.put("Егоров","Петр");
        map.put("Егоров","Кристина");
        map.put("Егоров","Никита");
        map.put("Егоров","Максим");
        map.put("Егоров","Семен");
        map.put("Егоров","Александр");
        map.put("Егоров","Иван");
        map.put("Егоров","Иван");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //removeItemFromMapByValue();//напишите тут ваш код

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {


        removeTheFirstNameDuplicates(createMap());


    }
}
