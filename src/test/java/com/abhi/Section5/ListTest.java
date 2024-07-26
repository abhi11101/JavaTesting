package com.abhi.Section5;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    void testListSize(){

        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2);

        assertEquals(2,listMock.size());

    }

    @Test
    void testListSizeMultipleReturns(){

        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2).thenReturn(3).thenReturn(4);

        assertEquals(2,listMock.size());
        assertEquals(3,listMock.size());
        assertEquals(4,listMock.size());

    }

    @Test
    void testListGet(){

        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("Vegeta");

        assertEquals("Vegeta",listMock.get(0));
        assertEquals(null,listMock.get(1));
    }

    @Test
    void testArgumentMatchers(){

        List listMock = mock(List.class);
        when(listMock.get(anyInt())).thenReturn("Vegeta");

        assertEquals("Vegeta",listMock.get(10));

    }

    @Test
    void testException(){

        List listMock = mock(List.class);
        when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something went wrong"));

        assertThrows(RuntimeException.class, ()->listMock.get(3));

    }

}
