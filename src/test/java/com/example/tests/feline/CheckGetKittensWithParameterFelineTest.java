package com.example.tests.feline;

import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckGetKittensWithParameterFelineTest {
    @Test
    public void checkingGetKittensWithParameterFeline() {
        Feline feline = new Feline();
        Integer actualParameterKittens = feline.getKittens(3);
        Integer expected = 3;
        assertEquals(expected, actualParameterKittens);
    }
}
