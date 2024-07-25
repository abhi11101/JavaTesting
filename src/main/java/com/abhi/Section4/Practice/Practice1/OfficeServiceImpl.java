package com.abhi.Section4.Practice.Practice1;

public class OfficeServiceImpl {

    private OfficeService officeService;

    public OfficeServiceImpl(OfficeService officeService) {
        this.officeService = officeService;
    }

    public boolean isJim() {

        Office fetchedOffice = officeService.getOfficeCharacter();
        if (fetchedOffice.getName()=="Jim"){
            return true;
        }
        return false;

    }

}
