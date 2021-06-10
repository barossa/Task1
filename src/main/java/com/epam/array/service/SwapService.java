package com.epam.array.service;

import com.epam.array.entity.CustomArray;
import com.epam.array.exception.CustomArrayException;

public interface SwapService {
    void makePositive(CustomArray customArray, int beginIndex, int endIndex) throws CustomArrayException;
    void makeNegative(CustomArray customArray, int beginIndex, int endIndex) throws CustomArrayException;
    void reverseElements(CustomArray customArray, int beginIndex, int endIndex) throws CustomArrayException;
}
