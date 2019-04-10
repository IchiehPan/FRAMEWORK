package com.pan.framework.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateKit {
    private static final String NORMAL_DATE_FORMAT = "yyyy-MM-dd";
    private static final String NORMAL_TIME_FORMAT = "HH:mm";

    public static String formatDate(int year, int monthOfYear, int dayOfMonth) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, monthOfYear, dayOfMonth);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(NORMAL_DATE_FORMAT);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static String formatTime(int hourOfDay, int minute) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
        calendar.set(Calendar.MINUTE, minute);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(NORMAL_TIME_FORMAT);
        return simpleDateFormat.format(calendar.getTime());
    }
}
