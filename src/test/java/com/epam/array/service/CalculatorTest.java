package com.epam.array.service;

import com.epam.array.entity.CustomArray;
import com.epam.array.service.impl.CalculatorImpl;
import com.epam.array.service.impl.SearchImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class CalculatorTest {
    @Test
    public void averageValue(){
        CalculatorImpl calculator = new CalculatorImpl();
        CustomArray customArray = new CustomArray(1,3,5,-2,7,0,-9,-777);
        int[] array = customArray.getArray();
        int i = (int) Arrays.stream(array).average().getAsDouble();
        Assert.assertEquals(i, calculator.averageValue(customArray));
    }

    @Test
    public void sumOfElements(){
        CalculatorImpl calculator = new CalculatorImpl();
        CustomArray customArray = new CustomArray(1,2,3,4,5,6,7,8,9);
        int[] array = customArray.getArray();
        int expected = Arrays.stream(array).sum();
        int actual = calculator.sumOfElements(customArray);
        Assert.assertEquals(expected, actual);
    }
}
