package com.abhi.Section2;

import org.junit.jupiter.api.*;

public class BeforeAfterTest {

    @BeforeAll
    static void beforeClassTest(){
        System.out.println("Before Class");
    }

    @BeforeEach
    void beforeTest(){
        System.out.println("Before Test");
    }

    @Test
    void test1(){
        System.out.println("Test 1");
    }

    @Test
    void test2(){
        System.out.println("Test 2");
    }

    @AfterEach
    void afterTest(){
        System.out.println("After Test");
    }

    @AfterAll
    static void afterAllTest(){
        System.out.println("After All Test");
    }

}
