package com.epam.array.entity;

import com.epam.array.exception.CustomArrayException;
import java.util.Arrays;

public class CustomArray {
    private int[] array;

    public CustomArray(int... integers) {
        this.array = integers;
    }

    public int getElement(int index) throws CustomArrayException {
        if(index < 0 || index > array.length){
            throw new CustomArrayException(
                    String.format("Index out of bound: (%d) -> [0-%d]",
                            index,
                            array.length-1));
        }
        return array[index];
    }

    public void setElement(int index, int element) throws CustomArrayException {
        if(index < 0 || index > array.length){
            throw new CustomArrayException(
                    String.format("Index out of bound: (%d) -> / [0-%d]",
                            index,
                            array.length-1));
        }
        array[index] = element;
    }

    public int getLength(){
        return array.length;
    }

    public int[] getArray(){
        return Arrays.copyOf(array,array.length);
    }

    public boolean isEmpty(){
        return array.length == 0;
    }

    public void setArray(int[] array){
        this.array = Arrays.copyOf(array,array.length);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o.getClass() != CustomArray.class) return false;

        CustomArray that = (CustomArray) o;

        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        int hash = 1;
        for (int element : array)
            hash = 31 * hash + element;

        return hash;
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                Arrays.toString(array) +
                '}';
    }
}
