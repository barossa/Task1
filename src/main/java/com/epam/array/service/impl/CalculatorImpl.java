package com.epam.array.service.impl;

import com.epam.array.entity.CustomArray;
import com.epam.array.exception.CustomArrayException;
import com.epam.array.service.CalculatorService;
import com.epam.array.service.SearchService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CalculatorImpl implements CalculatorService {
    private static final Logger logger = LogManager.getLogger(CalculatorImpl.class);

    @Override
    public int averageValue(CustomArray customArray) {
        int[] array = customArray.getArray();
        int sum = 0;
        for (int element : array) sum += element;
        return sum / array.length;
    }

    @Override
    public int sumOfElements(CustomArray customArray) {
        int[] array = customArray.getArray();
        int sum = 0;
        for (int element : array) sum += element;
        return sum;
    }

    @Override
    public void showStatistics(CustomArray customArray, SearchService searchService) {
        int[] positives = new int[0];
        int[] negatives = new int[0];
        try {
            positives = searchService.findPositives(customArray);
            negatives = searchService.findNegatives(customArray);
        } catch (CustomArrayException e) {
            logger.error("Something went wrong with statistics. Can't find positives and negatives");
        }

        String info = String.format("Founded %d positive and %d negatives elements",
                positives.length,
                negatives.length);
        logger.info(info);
    }
}
