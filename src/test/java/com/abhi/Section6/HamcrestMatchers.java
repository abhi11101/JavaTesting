package com.abhi.Section6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestMatchers {

    @Test
    void test(){

        List<Integer> numbers = Arrays.asList(99,100,101,105);

        assertThat(numbers,hasSize(4));
        assertThat(numbers,hasItems(99,100));
        assertThat(numbers,everyItem(greaterThan(90)));
        assertThat(numbers,everyItem(lessThan(190)));

        // String
        assertThat("",isEmptyString());
        assertThat(null,isEmptyOrNullString());


        // Arrays
        Integer[] marks = {1,2,3};

        assertThat(marks,arrayWithSize(3));
        assertThat(marks,arrayContaining(1,2,3));
        assertThat(marks,arrayContainingInAnyOrder(2,1,3));
    }
}
