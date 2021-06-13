package com.epam.array.service.impl;

import com.epam.array.entity.CustomArray;
import com.epam.array.service.SortService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SortImpl implements SortService {
    private final static Logger logger = LogManager.getLogger(SortImpl.class);

    @Override
    public void quickSort(CustomArray customArray) {
        int[] array = customArray.getArray();
        if (!arrayCheck(array)) return;
        quickSort(array, 0, array.length - 1);
        customArray.setArray(array);
    }

    @Override
    public void selectionSort(CustomArray customArray) {
        int[] array = customArray.getArray();
        if (!arrayCheck(array)) return;
        int length = array.length, min = 0;
        for (int i = 0; i < length; i++) {
            min = i;
            for (int j = i + 1; j < length; j++) {
                if (array[j] <= array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        customArray.setArray(array);
    }

    @Override
    public void bubbleSort(CustomArray customArray) {
        int[] array = customArray.getArray();
        if (!arrayCheck(array)) return;
        boolean isContinue = true;
        while (isContinue) {
            isContinue = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isContinue = true;
                }
            }
        }
        customArray.setArray(array);
    }

    private static int[] quickSort(int[] array, int left, int right) {
        int l = left, r = right;
        int root = (l + r) / 2;

        do {
            while (array[l] < array[root]) l++;
            while (array[r] > array[root]) r--;

            if (l <= r) {
                if (l < r) {
                    int buff = array[r];
                    array[r] = array[l];
                    array[l] = buff;
                }
                r--;
                l++;
            }
        } while (l <= r);

        if (l < right)
            quickSort(array, l, right);
        if (r > left)
            quickSort(array, left, r);
        return array;
    }

    private boolean arrayCheck(int[] array) {
        if (array.length == 0) {
            logger.warn("Can't sort empty array");
            return false;
        }
        return true;
    }
}
