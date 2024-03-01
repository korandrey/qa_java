package com.example.tests.lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CheckExceptionConstructorLionTest {

    @Spy
    Feline feline;

    @Test
    public void checkingExceptionConstructorLion() {
        Exception exception = Assert.assertThrows(Exception.class, () -> new Lion("кто-то", feline));
        Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

    @Test
    public void checkingGetKittensLion() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Integer actualKittensLion = lion.getKittens();
        Integer expected = 1;
        assertEquals(expected, actualKittensLion);
    }

    @Test
    public void checkingGetFoodLion() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion("Самец", feline);
        List<String> actualEat = lion.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actualEat);
    }
}
