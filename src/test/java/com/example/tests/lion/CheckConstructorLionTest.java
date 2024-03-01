package com.example.tests.lion;

import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CheckConstructorLionTest {
    final private String sex;
    final private Boolean expected;

    public CheckConstructorLionTest(String sex, Boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] compareGenderAndPresenceOfMane() {
        return new Object[][]{{"Самец", true}, {"Самка", false},};
    }

    @Test
    public void checkingConstructorLion() throws Exception {
        Lion lion = new Lion(sex);
        Boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }
}
