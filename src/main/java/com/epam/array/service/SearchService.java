package com.epam.array.service;

import com.epam.array.entity.CustomArray;
import com.epam.array.exception.CustomArrayException;

public interface SearchService {
    int findMinElement(CustomArray customArray) throws CustomArrayException;
    int findMaxElement(CustomArray customArray) throws CustomArrayException;
    int[] findNegatives(CustomArray customArray) throws CustomArrayException;
    int[] findPositives(CustomArray customArray) throws CustomArrayException;
}
