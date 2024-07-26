package com.abhi.Section6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class SpyTest {

    @Test
    void test(){

        List arrayListSpy = spy(ArrayList.class);
        when(arrayListSpy.size()).thenReturn(5);
        assertEquals(5, arrayListSpy.size());
        arrayListSpy.add("Dummy");
        verify(arrayListSpy).add("Dummy");
    }

}
