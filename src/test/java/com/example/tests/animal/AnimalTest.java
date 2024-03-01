package com.example.tests.animal;

import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {
    @Test
    public void checkingExceptionGetFoodAnimal() {
        Animal animal = new Animal();
        Exception exception = Assert.assertThrows(Exception.class, () -> animal.getFood("Инопланетное"));
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
    }

    @Test
    public void checkingGetFamily() {
        Animal animal = new Animal();
        String actualFamily = animal.getFamily();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expected, actualFamily);
    }
}
