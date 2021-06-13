package com.epam.array.service.impl;

import com.epam.array.entity.CustomArray;
import com.epam.array.exception.CustomArrayException;
import com.epam.array.service.SearchService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SearchImpl implements SearchService {
    private static final Logger logger = LogManager.getLogger(SearchImpl.class);

    @Override
    public int findMinElement(CustomArray customArray) throws CustomArrayException {
        if (customArray.isEmpty()) {
            logger.warn("Array is empty! Can't find min value.");
            throw new CustomArrayException("Array is empty!");
        }

        int[] array = customArray.getArray();
        int min = array[0];
        for (int element : array) {
            if (element < min) min = element;
        }
        return min;
    }

    @Override
    public int findMaxElement(CustomArray customArray) throws CustomArrayException {
        if (customArray.isEmpty()) {
            logger.warn("Array is empty! Can't find min value.");
            throw new CustomArrayException("Array is empty!");
        }

        int[] array = customArray.getArray();
        int max = array[0];
        for (int element : array) {
            if (element > max) max = element;
        }
        return max;
    }

    @Override
    public int[] findNegatives(CustomArray customArray) throws CustomArrayException {
        if (customArray.isEmpty()) {
            logger.warn("Array is empty! Can't find negatives.");
            throw new CustomArrayException("Array is empty!");
        }

        int[] array = customArray.getArray();
        int[] result;
        int negativesCounter = 0;

        for (int element : array) {
            if (element < 0) negativesCounter++;
        }

        result = new int[negativesCounter];
        if (negativesCounter == 0) return result;

        int j = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < 0) {
                result[j] = array[i];
                j++;
            }
        }
        return result;
    }

    @Override
    public int[] findPositives(CustomArray customArray) throws CustomArrayException {
        if (customArray.isEmpty()) {
            logger.warn("Array is empty! Can't find positives.");
            throw new CustomArrayException("Array is empty!");
        }

        int[] array = customArray.getArray();
        int[] result;
        int positivesCounter = 0;

        for (int element : array) {
            if (element > 0) positivesCounter++;
        }

        result = new int[positivesCounter];
        if (positivesCounter == 0) return result;

        int j = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > 0) {
                result[j] = array[i];
                j++;
            }
        }
        return result;
    }
}
