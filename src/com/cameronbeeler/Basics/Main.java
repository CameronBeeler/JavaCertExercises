package com.cameronbeeler.Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public
class Main
{
    public static
    void main(String[] args)
    {
//        System.out.println("Output is => " + 10 != 5);
        System.out.println("Output is => " + (10 != 5));

        int x = 1;
        while (checkAndIncrement(x))
        {
            x++;
            System.out.println(x);
        }

        StringBuilder sb = new StringBuilder("Java");
        String        s1 = sb.toString();
        String        s2 = "Java";

        System.out.println(s1 == s2);

        String elf = " ";
        boolean b = elf.isEmpty();
        System.out.println("Am I empty? " + b);
        System.out.println("what is the value of the trim?[" + elf.trim() + "]" + " and the elf [" + elf + "]");
//        args[0] = 5;
//        args[1] = 10;
//        System.out.println("[" + args[0] + ", " + args[1] + "]");
    }

    private static boolean checkAndIncrement(int x)
    {
        if(x < 5) {
            x++;
            return true;
        } else {
            return false;
        }
    }
}

