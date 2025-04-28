package org.example.junit;

import java.io.Serial;


public class MyMath {

    // {1, 2, 3} = Sum = 6

    public int calculateSum(int[] numbers){
        int sum = 0;
        for(int number: numbers){
            sum += number;
        }
        return sum;
    }
}
