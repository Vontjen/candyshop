package com.realdolmen.candyshop.util;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UnknownFormatConversionException;

public class DateBuilder {

    public static Date createDate(String date) {
        try {
            return new SimpleDateFormat("yy-MM-dd").parse(date);
        } catch (ParseException e) {
//            e.printStackTrace();
            throw new UnknownFormatConversionException("Wrong date exception");
        }
    }
}
