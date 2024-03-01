package com.example.tests.feline;

import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckGetFamilyFelineTest {

    @Test
    public void checkingGetFamilyFeline() {
        Feline feline = new Feline();
        String actualFamily = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actualFamily);
    }
}
