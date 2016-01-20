package com.reccolect.consumer;

import com.reccolect.consumer.Consumer;

public class ConsoleConsumer implements Consumer {
    @Override
    public void showResult(String result) {
        System.out.println(result);
    }
}
