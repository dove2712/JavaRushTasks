package com.javarush.task.task14.task1408;

/**
 * 27.09.2017
 * 22:28
 * Created by Roxy
 */
public class MoldovanHen extends Hen {
    public int getCountOfEggsPerMonth(){
        return 3;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA
                + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
