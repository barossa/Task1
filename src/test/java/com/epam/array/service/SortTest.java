package com.epam.array.service;

import com.epam.array.entity.CustomArray;
import com.epam.array.service.impl.SortImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SortTest {

    @Test
    public void selectionSort() {
        CustomArray customArray = new CustomArray(9, 8, 7, 6, 5, 4, 3, 0, 2);
        int[] expected = customArray.getArray();
        Arrays.sort(expected);
        SortImpl sort = new SortImpl();
        sort.selectionSort(customArray);
        int[] actual = customArray.getArray();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void quickSort() {
        CustomArray customArray = new CustomArray(9, 8, 7, 6, 5, 4, 3, 0, 2);
        int[] expected = customArray.getArray();
        Arrays.sort(expected);
        SortImpl sort = new SortImpl();
        sort.quickSort(customArray);
        int[] actual = customArray.getArray();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void bubbleSort() {
        CustomArray customArray = new CustomArray(3, 2, 45, 8, 546, 123, 1, 4, 9, 234, 125, 6, 0, 6, 0, 765);
        int[] expected = customArray.getArray();
        Arrays.sort(expected);
        SortImpl sort = new SortImpl();
        sort.bubbleSort(customArray);
        int[] actual = customArray.getArray();
        Assert.assertArrayEquals(expected, actual);
    }
}
