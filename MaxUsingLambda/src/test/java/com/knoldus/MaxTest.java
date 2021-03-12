package com.knoldus;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class MaxTest {

    @Test
    public void isMaxNumber() {
        Max obj = new Max();
        int val = obj.max("6", "5");
        Assert.assertEquals(6, val);

    }

    @Test
    public void checkForEqual() {
        Max obj = new Max();
        int val = obj.max("6", "6");
        Assert.assertEquals(6, val);

    }

    @Test
    public void checkForException() {
        Max obj = new Max();
        Assertions.assertThrows(NumberFormatException.class,()-> obj.max("6", "six"));

    }

}