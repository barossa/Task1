package com.epam.array.service;

import com.epam.array.entity.CustomArray;

public interface CalculatorService {
    int averageValue(CustomArray customArray);
    int sumOfElements(CustomArray customArray);
    void showStatistics(CustomArray customArray, SearchService searchService);
}
