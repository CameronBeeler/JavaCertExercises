package com.cameronbeeler.LocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
    }
}
