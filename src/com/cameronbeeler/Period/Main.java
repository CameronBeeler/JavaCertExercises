package com.cameronbeeler.Period;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public
class Main
{
    public static void main(String[] args)
    {
        Period period = Period.of(0, 0, 0);
        System.out.println(period);

        period=Period.of(3, 4, 12);
        System.out.println(period);
        System.out.println(period.getChronology());
        String pd=period.toString();
        System.out.println(pd.replaceAll("P", "Total Duration => "));


        period=Period.of(0, 0, 3425);
        System.out.println(period);

        LocalDate date = LocalDate.of(2012, 1, 11);
        Period period1 = Period.ofMonths(2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yy");
        System.out.print(formatter.format(date.minus(period1)));
    }
}
