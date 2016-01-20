package com.reccolect.consumer;

import com.reccolect.converter.Converter;

public class CWConsumer implements Consumer {

    private Consumer windowConsumer;
    private Consumer consoleConsumer;
    private Converter funkyCaseConverter;

    @Override
    public void showResult(String result) {
        consoleConsumer.showResult(funkyCaseConverter.convert(result));
        windowConsumer.showResult(result);
    }

    public void setWindowConsumer(Consumer windowConsumer) {
        this.windowConsumer = windowConsumer;
    }

    public void setConsoleConsumer(Consumer consoleConsumer) {
        this.consoleConsumer = consoleConsumer;
    }

    public void setFunkyCaseConverter(Converter funkyCaseConverter) {
        this.funkyCaseConverter = funkyCaseConverter;
    }
}
