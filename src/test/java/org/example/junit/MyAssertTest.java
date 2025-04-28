package org.example.junit;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyAssertTest {
    private MyMath math;

    @Test
    void test(){
        List<String> todos = Arrays.asList("AWS", "Spring Boot", "Docker");
        boolean test = todos.contains("AWS");
        boolean testCase2 = todos.contains("Spring Boot");
        System.out.println(test);
        assertTrue(testCase2, "It was not in the array");
        assertTrue(test, "It was not True"); // TO check boolean value is True only
        assertEquals(3, todos.size());
        //assertArrayEquals(new int[] {1, 2 ,3} , new int[] {2, 1});
        assertArrayEquals(new int[] {1, 2} , new int[] {2, 1});

        System.out.println(todos.size());
        //fail("Not yet implemented")




    }

}