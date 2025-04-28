package org.example.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyBeforeAfterTest {
    @BeforeEach
    void beforeEach() {
        System.out.println("Before Test");
    }

    @Test
    void test1(){
        System.out.println("Testing");


    }
    @AfterEach
    void afterEach(){
        System.out.println("After Test");
    }

}