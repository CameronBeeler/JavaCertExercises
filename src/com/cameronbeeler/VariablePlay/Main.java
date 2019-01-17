package com.cameronbeeler.VariablePlay;

public
class Main
{
    public static
    void main(String[] args)
    {
//        short arr[] = new short[2];
//        short[] arr;  arr = new short[2];
        short[] arr = new short[]{100,100};
        arr[0] = 5;
        arr[1] = 10;
        System.out.println("[" + arr[0] + ", " + arr[1] + "]");

        int[] x = new int[]{1,2,3,4,5}; //hh= new int[5];
        x[0]=1;
        x[1]=2;
        x[2]=3;
        x[3]=4;
        x[4]=5;
        for(int i=0; i<5; i++)
        {
            if(i!=4)
            {
                System.out.print("x[" + i + "] = " + x[i] + ", ");
            } else
            {
                System.out.print("x[" + i + "] = " + x[i] );
            }
        }
    }
}