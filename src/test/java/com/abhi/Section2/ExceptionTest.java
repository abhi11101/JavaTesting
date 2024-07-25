package com.abhi.Section2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionTest {

    @Test()
    void exceptionTest(){

        assertThrows(ArithmeticException.class, this::throwsException);
    }

    @Test
    void nullPointerExceptionTest(){
        int[] data= null;
        assertThrows(NullPointerException.class, ()->NullPointerTest(data));
    }

    private void throwsException(){

        throw new ArithmeticException("Arithmetic Exception by method");
    }

    private void NullPointerTest(int[] data){
        System.out.println(data[0]);
    }

}
