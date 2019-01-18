package com.cameronbeeler.VariablePlay;

import java.util.ArrayList;
import java.util.List;

public
class Main
{
    public static
    void main(String[] a)
    {
//        short arr[] = new short[2];
//        short[] arr;  arr = new short[2];
        short[] arr = new short[]{100, 100};
        arr[0] = 5;
        arr[1] = 10;
        System.out.println("[" + arr[0] + ", " + arr[1] + "]");

        int[] x = new int[5]; //hh= new int[5];
        x[0] = 1;
        x[1] = 2;
        x[2] = 3;
        x[3] = 4;
        x[4] = 5;
        for (int i = 0; i < 5; i++)
        {
            if (i != 4)
            {
                System.out.print("x[" + i + "] = " + x[i] + ", ");
            }
            else
            {
                System.out.print("x[" + i + "] = " + x[i]);
            }
        }
        System.out.println("List Integer Array test - watch the index posing as a value ;-)");
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
//        list.remove(100);
        list.remove(new Integer(100));

        long l = 100_00l;
        System.out.println(l + " is the value of l");

        double d = 10_00.35d;
        System.out.println(d + " is the value of d");

        int r = (int) d;
        System.out.println(r + " is the value of r");

        System.out.println(list);

        System.out.println("Watch the following - the do-while is predicated on 'true' and false is in the condition");

        do
        {
            System.out.println(100);
        } while (false);
        System.out.println("Bye");


        System.out.println("Another tricky one.  using the int value ");
        System.out.println("to match the array value, and then use the value as an index value...hmmm");
        int [] art = {2, 1, 0};
        for(int i : art) {
            System.out.println(i);
            System.out.println("art["+ i + "]=" + art[i]);
            System.out.println(art[i]);
        }

      byte var = 10;
        switch(var) {
            case 10:
                System.out.println("TEN");
                break;
            default:
                System.out.println("DEFAULT");
        }

        System.out.println("Loooky here");
        int m = 2;
        boolean res = false;
//        res = m++ == 2 || --m == 2 && --m == 2;  check this, if the first condition is true, no other part is executed
        res = --m == 2 && --m == 2 || m++ == 2;
        System.out.println(m);

        String [] mex = new String [7];
        System.out.println(mex);


        Point p1 = new Point();
        Point p2 = new Point();
        p1.x = 17;
        p1.y = 35;
        p2.x = 19;
        p2.y = 40;

        System.out.println(p1.x + ":" + p1.y + ":" + p2.x + ":" + p2.y);

        int [] value = {1,2,3,4,5};
        System.out.println(value[0]);

        char [] name [] = new char[5][];
    }
}


class Point {
    static int x;
    int y;
}
