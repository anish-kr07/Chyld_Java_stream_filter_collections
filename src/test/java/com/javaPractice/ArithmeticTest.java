package com.javaPractice;

import org.junit.Test;
import org.w3c.dom.Document;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class ArithmeticTest {

    @Test
    public void meanTest() throws Exception {
        List<Double> mylist = new ArrayList<Double>(Arrays.asList(3.5,4.5,3.5,6.5));
        Arithmetic arithmetic =  new Arithmetic();
        assertEquals(4.5,arithmetic.mean(mylist), 0.1);
    }
}