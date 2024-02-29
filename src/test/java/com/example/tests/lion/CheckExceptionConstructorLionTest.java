package com.example.tests.lion;

import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

public class CheckExceptionConstructorLionTest {
    @Test
    public void checkingExceptionConstructorLion() {
        Exception exception = Assert.assertThrows(Exception.class, () -> new Lion("кто-то"));
        Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}
