package com.javarush.task.task14.task1408;

/**
 * Created by Алексей on 06.06.2017.
 */

    public class MoldovanHen extends Hen implements Country{
        public int getCountOfEggsPerMonth(){
            return 6;
        }

        public String getDescription(){
            return super.getDescription()+" Моя страна - " + MOLDOVA +". Я несу " + getCountOfEggsPerMonth() +" яиц в месяц.";
        }
    }

