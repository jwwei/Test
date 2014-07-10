package com.example.helloworld;

import java.util.Calendar;

/**
 * Created by Weiwei Jiang on 2014/7/10.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH) + 1;
        System.out.println(month);
        int weekday = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        System.out.println(weekday);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }
}
