package com.javaPractice;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class OfficeTest {
    @Test
    public void shouldCreateNewOffice() throws Exception {
        Office office  = new Office("ANI","Belfast, Northern Ireland",100);
        assertEquals("ANI",office.getName());
        assertEquals("Belfast, Northern Ireland",office.getLocation());
        assertEquals(100,office.getNumberOfEmployees());
    }

    @Test
    public void filterLocation() throws Exception {
        Office office  = new Office("ANI","Belfast, Northern Ireland",100);
        ArrayList<Office> officeList = new ArrayList<>();
        officeList.add(office);
        officeList.add(new Office("ANI1","Ireland",1000));
        officeList.add(new Office("ANI2","Belfast, Northern Ireland",10000));
        officeList.add(new Office("ANI3","US",140));
        officeList.add(new Office("Chicago","US",150));
        officeList.add(new Office("ASPL","India",100));
        officeList.add(new Office("ASPL1","India",1));
        officeList.add(new Office("ASPL2","India",9));
        assertEquals(2, office.findLocation(officeList,"Belfast, Northern Ireland"));
        assertEquals(2, office.officesLessThanTen(officeList).size());
        assertEquals("ASPL1", office.officesLessThanTen(officeList).get(0).getName());
        assertEquals(4, office.officesMoreThanHundred(officeList).size());

    }
    @Test
    public void beginsWith() throws Exception {
        Office office = new Office("ANI", "Belfast, Northern Ireland", 100);
        ArrayList<Office> officeList = new ArrayList<>();
        officeList.add(office);
        officeList.add(new Office("ANI1", "Ireland", 1000));
        officeList.add(new Office("ANI2", "Belfast, Northern Ireland", 10000));
        officeList.add(new Office("BNI3", "US", 140));
        officeList.add(new Office("Khicago", "US", 150));
        officeList.add(new Office("PSPL", "India", 100));
        officeList.add(new Office("LSPL1", "India", 1));
        officeList.add(new Office("ASPL2", "India", 9));
        assertEquals(5, office.beginsWithA_K(officeList).size());

    }

    @Test
    public void beginsWithVowel() throws Exception {
        Office office = new Office("ANI", "Belfast, Northern Ireland", 100);
        ArrayList<Office> officeList = new ArrayList<>();
        officeList.add(office);
        officeList.add(new Office("ANI1", "Ireland", 1000));
        officeList.add(new Office("ANI2", "Belfast, Northern Ireland", 10000));
        officeList.add(new Office("ENI3", "US", 140));
        officeList.add(new Office("KL", "US", 150));
        officeList.add(new Office("PSPL", "India", 100));
        officeList.add(new Office("LSPL1", "India", 1));
        officeList.add(new Office("USPL2", "India", 9));
        assertEquals(5, office.withVowel(officeList).size());

    }
}