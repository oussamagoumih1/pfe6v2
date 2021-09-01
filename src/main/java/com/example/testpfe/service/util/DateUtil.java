/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.service.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author
 */
public class DateUtil {

    public static boolean isWeekEnd(LocalDate ld) {
        DayOfWeek d = ld.getDayOfWeek();
        return d == DayOfWeek.SATURDAY || d == DayOfWeek.SUNDAY;
    }

    public static LocalDate convert(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    public static Date convert(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

    }

    public static String formateDate(Date date) {
        return formateDate("yyyy/MM/dd HH:mm", date);
    }

    public static String formateDate(String pattern, Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        if (date != null) {
            return simpleDateFormat.format(date);
        } else {
            return "";
        }
    }

    public static java.sql.Timestamp getSqlDateTime(Date date) {
        return new java.sql.Timestamp(date.getTime());
    }

    public static Date parse(String date) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return simpleDateFormat.parse(date);
        } catch (ParseException ex) {
            return null;
        }
    }

    public static java.sql.Date convertFormUtilToSql(Date date) {
        if (date != null) {
            return new java.sql.Date(date.getTime());
        } else {
            return null;
        }
    }

    public static int diff(Date firstDate, Date secondDate) {
        long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        return (int) diff;
    }

    public static Long diffDays(Date firstDate, Date secondDate) {
        Long diff = totalJourWithoutWeekEnd(firstDate, secondDate);
        return diff;
    }

    public static Long totalJourWithoutWeekEnd(Date dateMin, Date dateMax) {
        return totalJourWithoutWeekEnd(convert(dateMin), convert(dateMax));
    }

    public static Long totalJourWithoutWeekEnd(LocalDate dateMin, LocalDate dateMax) {
        Long i = 0L;
        for (LocalDate date = dateMin; date.compareTo(dateMax) <= 0; date = date.plusDays(1)) {
            if (!isWeekEnd(date)) {
                i++;
            }
        }
        return i;
    }

    public static Long totalWeekEnd(Date dateMin, Date dateMax) {
        return totalWeekEnd(convert(dateMin), convert(dateMax));
    }

    public static Date minusOneDay(Date date) {
        LocalDate localDate = convert(date);
        LocalDate minusDays = localDate.minusDays(1);
        return convert(minusDays);
    }

    public static Long totalWeekEnd(LocalDate dateMin, LocalDate dateMax) {
        Long i = 0L;
        for (LocalDate date = dateMin; date.compareTo(dateMax) <= 0; date = date.plusDays(1)) {
            if (isWeekEnd(date)) {
                i++;
            }
        }
        return i;
    }

    public static Integer extractAnnee(Date date) {
        Calendar cl = Calendar.getInstance();
        cl.setTime(date);
        return cl.get(Calendar.YEAR);
    }

    public static Integer extractMois(Date date) {
        Calendar cl = Calendar.getInstance();
        cl.setTime(date);
        return cl.get(Calendar.MONTH);
    }

    public static Integer extractSemaine(Date date) {
        Calendar cl = Calendar.getInstance();
        cl.setTime(date);
        return cl.get(Calendar.WEEK_OF_YEAR);
    }

    public static boolean sameDay(Date date1, Date date2) {
        return (date1.getYear() == date2.getYear() && date1.getMonth() == date2.getMonth() && date1.getDay() == date2.getDay());
    }

}
