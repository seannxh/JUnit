package org.example.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyMathTest {
    private MyMath math;
    @Test
    void testSum3Array(){
        //Absence of failure == Success
        //Refractored
        int result = math.calculateSum(new int[] {1, 2, 3});
        //System.out.println(result);
        assertEquals(6, result);



    }
    @Test
    void testSum2EmptyArray(){
        //Absence of failure == Success

        int[] numbers = {};
        MyMath math = new MyMath();
        int result = math.calculateSum(numbers);
        //System.out.println(result);
        int ExpectedResult = 0;
        assertEquals(result, ExpectedResult);



    }

}