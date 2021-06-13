package com.epam.array.parse;


import com.epam.array.entity.CustomArray;
import com.epam.array.exception.CustomArrayException;
import com.epam.array.validation.Validator;
import com.epam.array.validation.impl.DataValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

public class CustomParser {
    final static Logger logger = LogManager.getLogger(CustomParser.class);
    private static final String REGEX = ",";
    private final File file;
    private final Validator validator;

    public CustomParser(String filepath) {
        file = new File(filepath);
        validator = new DataValidator();
    }

    public CustomParser(String filepath, Validator validator) {
        file = new File(filepath);
        this.validator = validator;
    }

    public CustomArray parseArray() throws CustomArrayException {
        List<String> strings = readLines();
        for (String line : strings) {
            if (!line.isEmpty() && validator.validate(line)) {
                String[] split = line.split(REGEX);
                int[] data = new int[split.length];
                try {
                    for (int i = 0; i < split.length; i++) {
                        data[i] = Integer.parseInt(split[i]);
                    }
                } catch (NumberFormatException e) {
                    continue;
                }
                logger.info("Data from line " + (strings.indexOf(line) + 1) + " has been successfully read");
                return new CustomArray(data);
            }
        }
        logger.info("File was empty or incorrect. Returning empty array");
        return new CustomArray();
    }

    private List<String> readLines() throws CustomArrayException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            return reader.lines().collect(Collectors.toList());
        } catch (FileNotFoundException e) {
            String message = "File not found: " + file.getPath();
            logger.error(message);
            throw new CustomArrayException(message);

        }
    }
}
