package com.example.tests.cat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CheckGetSoundCatTest {

    @Mock
    Feline feline;

    @Test
    public void checkingGetSoundCat() {
        Cat cat = new Cat(feline);
        String actualSoundCat = cat.getSound();
        String expected = "Мяу";
        assertEquals(expected, actualSoundCat);
    }
}
