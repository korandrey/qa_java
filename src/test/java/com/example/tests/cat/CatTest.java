package com.example.tests.cat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void checkingGetFoodCat() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Cat cat = new Cat(feline);
        List<String> actualFoodForCat = cat.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actualFoodForCat);
    }

    @Test
    public void checkingGetSoundCat() {
        Cat cat = new Cat(feline);
        String actualSoundCat = cat.getSound();
        String expected = "Мяу";
        assertEquals(expected, actualSoundCat);
    }
}
