package com.wang.test06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) throws ParseException {
//        使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日
        String dateStr= "2020-11-24";

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(dateStr);

        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(sdf2.format(date));

    }
}
