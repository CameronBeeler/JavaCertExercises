package com.cameronbeeler.ClassManipulations;

import java.util.ArrayList;
import java.util.List;

public
class TestArrayAttributes
{
    public static void main(String[] args)
    {

        List<StringBuilder> days = new ArrayList<>();

         days.add(new StringBuilder("Sunday"));
         days.add(new StringBuilder("Monday"));
         days.add(new StringBuilder("Tuesday"));

  if(days.contains(new StringBuilder("Sunday")))

    {
        days.add(new StringBuilder("Wednesday"));
    }
        System.out.println(days.size());
    }
}
