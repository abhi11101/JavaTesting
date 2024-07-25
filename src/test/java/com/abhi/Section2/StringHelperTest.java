package com.abhi.Section2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringHelperTest {

    StringHelper helper =new StringHelper();

    @Test
    void truncateAInFirst2Positions() {

        String actual = helper.truncateAInFirst2Positions("AACD");
        String expected = "CD";

        assertEquals(expected, actual);

    }

    @Test
    void truncateAInFirst2Positions_2() {

        assertEquals("45",helper.truncateAInFirst2Positions("AA456"));
    }

    @Test
    void areFirstAndLastTwoCharactersSame() {

        boolean actual = helper.areFirstAndLastTwoCharactersSame("ABAB");

        assertTrue(actual,"Condition Failed!!");
    }

    @Test
    void areFirstAndLastTwoCharactersSame_FalseCondition() {
        assertFalse(helper.areFirstAndLastTwoCharactersSame("ABCD"),"Condition Failed!!");
    }
}