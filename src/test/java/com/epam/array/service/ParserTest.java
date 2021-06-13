package com.epam.array.service;

import com.epam.array.entity.CustomArray;
import com.epam.array.exception.CustomArrayException;
import com.epam.array.parse.CustomParser;
import org.junit.Test;

public class ParserTest {

    @Test
    public void parseArray() throws CustomArrayException {
        CustomParser parser = new CustomParser("input\\data.txt");
        CustomArray customArray = parser.parseArray();
        System.out.println(customArray);
    }
}
