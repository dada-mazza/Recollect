package com.reccolect;

import com.reccolect.consumer.CWConsumer;
import com.reccolect.consumer.ConsoleConsumer;
import com.reccolect.consumer.Consumer;
import com.reccolect.consumer.WindowConsumer;
import com.reccolect.converter.Converter;
import com.reccolect.converter.FunkyCaseConverter;
import com.reccolect.converter.UpperCaseConverter;
import com.reccolect.provider.ConsoleTextProvider;
import com.reccolect.provider.TextProvider;

public class Main {
    public static void main(String[] args) {
        TextProvider textProvider = new ConsoleTextProvider();
        Converter converter = new UpperCaseConverter();

        Consumer consumer;
        CWConsumer cwConsume = new CWConsumer();
        cwConsume.setConsoleConsumer(new ConsoleConsumer());
        cwConsume.setWindowConsumer(new WindowConsumer());
        cwConsume.setFunkyCaseConverter(new FunkyCaseConverter());
        consumer = cwConsume;

        String inputLine = textProvider.getText();
        String outputLine = converter.convert(inputLine);
        consumer.showResult(outputLine);


    }
}
