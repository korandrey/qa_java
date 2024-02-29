package com.example.tests.animal;

import com.example.Animal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckGetFamilyAnimalTest {

    @Test
    public void checkingGetFamily() {
        Animal animal = new Animal();
        String actualFamily = animal.getFamily();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(actualFamily, expected);
    }
}
