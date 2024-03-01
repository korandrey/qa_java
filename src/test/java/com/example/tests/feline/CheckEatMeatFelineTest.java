package com.example.tests.feline;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CheckEatMeatFelineTest {

    @Spy
    Feline feline;

    @Test
    public void checkingEatMeatFeline() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualEat = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actualEat);
    }

    @Test
    public void checkingGetFamilyFeline() {
        String actualFamily = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actualFamily);
    }

    @Test
    public void checkingGetKittensFeline() {
        Mockito.when(feline.getKittens(1)).thenReturn(1);
        Integer actualKittens = feline.getKittens();
        Integer expected = 1;
        assertEquals(expected, actualKittens);
    }

    @Test
    public void checkingGetKittensWithParameterFeline() {
        Integer actualParameterKittens = feline.getKittens(3);
        Integer expected = 3;
        assertEquals(expected, actualParameterKittens);
    }
}
