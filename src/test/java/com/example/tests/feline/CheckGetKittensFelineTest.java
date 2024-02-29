package com.example.tests.feline;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CheckGetKittensFelineTest {

    @Spy
    Feline feline;

    @Test
    public void checkingGetKittensFeline() {
        Mockito.when(feline.getKittens(1)).thenReturn(1);
        Integer actualKittens = feline.getKittens();
        Integer expected = 1;
        assertEquals(actualKittens, expected);
    }
}
