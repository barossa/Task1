package com.epam.array.service;

import com.epam.array.entity.CustomArray;
import com.epam.array.exception.CustomArrayException;
import com.epam.array.service.impl.SwapImpl;
import org.junit.Assert;
import org.junit.Test;

public class SwapTest {
    @Test
    public void makePositive() throws CustomArrayException {
        SwapImpl swap = new SwapImpl();
        CustomArray customArray = new CustomArray(-1, 1, -2, 2, -3, 3, 0, 8);
        int[] expected = customArray.getArray();

        for (int element : expected) {
            if (element < 0)
                element = element * -1;
        }

        swap.makePositive(customArray, 0, customArray.getLength() - 1);
        int[] actual = customArray.getArray();

        Assert.assertArrayEquals(expected, actual);

    }

    @Test
    public void makeNegative() throws CustomArrayException {
        SwapImpl swap = new SwapImpl();
        CustomArray customArray = new CustomArray(-1, 1, -2, 2, -3, 3, 0, 8);
        int[] expected = customArray.getArray();

        for (int element : expected) {
            if (element > 0)
                element = element * -1;
        }
        swap.makeNegative(customArray, 0, customArray.getLength() - 1);
        int[] actual = customArray.getArray();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void reverseElements() throws CustomArrayException {
        SwapImpl swap = new SwapImpl();
        CustomArray customArray = new CustomArray(-1, 1, -2, 2, -3, 3, 0, 8);
        int[] expected = customArray.getArray();

        for (int element : expected) {
            element = element * -1;
        }
        swap.reverseElements(customArray, 0, customArray.getLength() - 1);
        int[] actual = customArray.getArray();

        Assert.assertArrayEquals(expected, actual);
    }
}
