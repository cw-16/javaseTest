package com.wang.test07;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        //用程序判断2020年11月24日是星期几。
        Calendar c = Calendar.getInstance();

        c.set(Calendar.YEAR, 2020);
        c.set(Calendar.MONTH, 11);
        c.set(Calendar.DATE, 24);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DATE);

        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        char week = week(c.get(Calendar.DAY_OF_WEEK));

        System.out.println(week);
    }

    private static char week(int i) {
        char[] c = {' ', '日', '一', '二', '三', '四', '五', '六'};
        return c[i];
    }

}
