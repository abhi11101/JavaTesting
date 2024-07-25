package com.abhi.Section2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayCompareTest {

    @Test
    void testArraySort(){

        int[] numbers = {12,3,7,1};
        int[] expected = {1,3,7,12};

        Arrays.sort(numbers);

        assertArrayEquals(expected,numbers,"Condition Failed");

    }

}
