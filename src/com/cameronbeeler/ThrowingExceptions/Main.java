package com.cameronbeeler.ThrowingExceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

abstract class Super {
    public abstract void m1() throws FileNotFoundException;
}

class Sub extends Super {
    @Override
    public void m1() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
    static void main (String [] args)
    {
        System.out.println("testedtrue");
    }
}

class Test
{
    public static void main(String[] args)
    {
        Super s = new Sub();
        try
        {
            s.m1();
        }catch (FileNotFoundException e)
        {
            System.out.print("M");
        } finally {
            System.out.print("N");
        }

        /*

        try {
            main(args);
        } catch (Exception ex) {
            System.out.println("CATCH-");
        }
        System.out.println("OUT");
        */

    }
}