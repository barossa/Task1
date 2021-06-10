package com.epam.array.service.impl;

import com.epam.array.entity.CustomArray;
import com.epam.array.exception.CustomArrayException;
import com.epam.array.service.SwapService;

public class SwapImpl implements SwapService {
    @Override
    public void makePositive(CustomArray customArray, int beginIndex, int endIndex) throws CustomArrayException {
        if (beginIndex > endIndex) {
            throw new CustomArrayException("End index should be bigger then begin index");
        }
        if (beginIndex < 0 || endIndex > customArray.getLength() - 1) {
            throw new CustomArrayException("Index out of bounds");
        }
        int[] array = customArray.getArray();
        for (int i = beginIndex; i <= endIndex; i++) {
            if (array[i] < 0) array[i] = array[i] * -1;
        }
    }

    @Override
    public void makeNegative(CustomArray customArray, int beginIndex, int endIndex) throws CustomArrayException {
        if (beginIndex > endIndex) {
            throw new CustomArrayException("End index should be bigger then begin index");
        }
        if (beginIndex < 0 || endIndex > customArray.getLength() - 1) {
            throw new CustomArrayException("Index out of bounds");
        }
        int[] array = customArray.getArray();
        for (int i = beginIndex; i <= endIndex; i++) {
            if (array[i] > 0) array[i] = array[i] * -1;
        }
    }

    @Override
    public void reverseElements(CustomArray customArray, int beginIndex, int endIndex) throws CustomArrayException {
        if (beginIndex > endIndex) {
            throw new CustomArrayException("End index should be bigger then begin index");
        }
        if (beginIndex < 0 || endIndex > customArray.getLength() - 1) {
            throw new CustomArrayException("Index out of bounds");
        }
        int[] array = customArray.getArray();
        for (int i = beginIndex; i <= endIndex; i++) {
            array[i] = array[i] * -1;
        }
    }
}
