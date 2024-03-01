package com.example.tests.lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class CheckGetKittensLionTest {
    @Mock
    Feline feline;

    @Test
    public void checkingGetKittensLion() {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Integer actualKittensLion = lion.getKittens();
        Integer expected = 1;
        assertEquals(expected, actualKittensLion);
    }
}