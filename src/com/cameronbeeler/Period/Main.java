package com.cameronbeeler.Period;

import java.time.Period;

public
class Main
{
    public static void main(String[] args)
    {
        Period period = Period.of(0, 0, 0);
        System.out.println(period);

        period=Period.of(3, 4, 12);
        System.out.println(period);
        String pd=period.toString();
        System.out.println(pd.replaceAll("P", "Total Duration => "));
    }
}
