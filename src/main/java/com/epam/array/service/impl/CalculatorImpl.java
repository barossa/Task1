package com.epam.array.service.impl;

import com.epam.array.entity.CustomArray;
import com.epam.array.service.CalculatorService;
import com.epam.array.service.SearchService;

public class CalculatorImpl implements CalculatorService {

    @Override
    public int averageValue(CustomArray customArray) {
        int[] array = customArray.getArray();
        int sum = 0;
        for (int element : array) sum+= element;
        return sum/array.length;
    }

    @Override
    public int sumOfElements(CustomArray customArray) {
        int[] array = customArray.getArray();
        int sum = 0;
        for (int element : array) sum+= element;
        return sum;
    }

    @Override
    public void showStatistics(CustomArray customArray, SearchService searchService) {
        int[] positives = searchService.findPositives(customArray);
        int[] negatives = searchService.findNegatives(customArray);
        String info = String.format("Founded %d positive and %d negatives elements",
                positives.length,
                negatives.length);
        //System.out.println(info);
        //log
    }
}
