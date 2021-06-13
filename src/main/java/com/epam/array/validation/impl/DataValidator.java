package com.epam.array.validation.impl;

import com.epam.array.validation.Validator;

import java.util.regex.Pattern;

public class DataValidator implements Validator {
    private static final String REGEX = "[a-zA-Zа-яА-Я!@#$?]+";
    private final Pattern pattern;

    public DataValidator() {
        pattern = Pattern.compile(REGEX);
    }

    @Override
    public boolean validate(String data) {
        return !pattern.matcher(data).find();
    }
}
