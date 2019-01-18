package com.cameronbeeler.LocalDate;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

public
class Main
{
    public static
    void main(String[] args)
    {
        LocalDateTime obj = LocalDateTime.now();
        System.out.println(obj.getSecond());

        LocalDate newYear   = LocalDate.of(2018, 1, 1);
        LocalDate christmas = LocalDate.of(2018, 12, 25);
        boolean   flag1     = newYear.isAfter(christmas);
        boolean   flag2     = newYear.isBefore(christmas);
        System.out.println(flag1 + ":" + flag2);

        LocalDate date = LocalDate.parse("1947-08-14");
        LocalTime time = LocalTime.MAX;
        LocalTime minTime = LocalTime.MIN;
        System.out.println(date.atTime(time));
        System.out.println(date.atTime(minTime ));

        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.parse("2018-07-11"));
        dates.add(LocalDate.parse("1919-10-25"));
        dates.add(LocalDate.of(2020, 4, 8));
        dates.add(LocalDate.of(1980, Month.DECEMBER, 31));
        dates.removeIf(x -> x.getYear() < 2000);
        System.out.println("HERES THE TEST");
        System.out.println(dates);



        LocalDate d1 = LocalDate.parse("1999-09-09");
        LocalDate d2 = LocalDate.parse("1999-09-09");
        LocalDate d3 = LocalDate.of(1999, 9, 9);
        LocalDate d4 = LocalDate.of(1999, 9, 9);
        System.out.println((d1 == d2) + ":" + (d2 == d3) + ":" + (d3 == d4));

        LocalDate xdate = LocalDate.parse("2000-01-01");
        Period period = Period.ofYears(-3000);
        System.out.println(xdate.plus(period));

        LocalDate idate = LocalDate.parse("2018-01-01");
        System.out.println(idate);

        Period xperiod = Period.of(2, 1, 0).ofYears(10).ofMonths(5).ofDays(2);
        System.out.println(xperiod);
    }


}
