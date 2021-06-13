package com.epam.array.service;

import com.epam.array.entity.CustomArray;

public interface SortService {
    void quickSort(CustomArray customArray);
    void selectionSort(CustomArray customArray);
    void bubbleSort(CustomArray customArray);
}
