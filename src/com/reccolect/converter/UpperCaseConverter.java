package com.reccolect.converter;


import com.reccolect.converter.Converter;

public class UpperCaseConverter implements Converter {
    @Override
    public String convert(String inputText) {
        return inputText.toUpperCase();
    }
}
