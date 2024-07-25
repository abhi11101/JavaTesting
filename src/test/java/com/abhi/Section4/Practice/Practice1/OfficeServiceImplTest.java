package com.abhi.Section4.Practice.Practice1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class OfficeServiceImplTest {

    @Test
    void Test(){

        OfficeService officeServiceMock = mock(OfficeService.class);
        when(officeServiceMock.getOfficeCharacter()).thenReturn(new Office("Jimy"));

        OfficeServiceImpl officeService = new OfficeServiceImpl(officeServiceMock);

        assertTrue(officeService.isJim());

    }

}