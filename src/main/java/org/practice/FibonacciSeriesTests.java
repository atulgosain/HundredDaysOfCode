package org.practice;

import org.junit.jupiter.api.Test;

public class FibonacciSeriesTests
{
@Test
public  void GetFibonicSeries()
    {
        int n1=0, n2=1,n3=0,count=15;
        System.out.print(n1+" "+n2);
        for (int i=2;i<count;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;


        }
    }
}
