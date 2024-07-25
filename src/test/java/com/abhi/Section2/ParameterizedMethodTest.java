package com.abhi.Section2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParameterizedMethodTest {

    StringHelper helper = new StringHelper();

    @ParameterizedTest
    @CsvSource({
            "'AABC' ,'BC'",
            "'ABCD', 'CD'",
            "'QWER' , 'ER'"
    })
    void truncateAInFirst2Positions(String actual, String expected) {

        assertEquals(expected, helper.truncateAInFirst2Positions(actual));

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/helperTest.csv",numLinesToSkip = 1)
    void truncateAInFirst2Positions_2(String actual, String expected) {

        assertEquals(expected,helper.truncateAInFirst2Positions(actual));
    }

    @ParameterizedTest
    @ValueSource(strings = {"AABC","ABCD","ABAB","1212"})
    void areFirstAndLastTwoCharactersSame(String actual) {



        assertTrue(helper.areFirstAndLastTwoCharactersSame(actual),"Condition Failed!!");
    }

}
