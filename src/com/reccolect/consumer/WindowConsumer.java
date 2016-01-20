package com.reccolect.consumer;

import com.reccolect.consumer.Consumer;

import javax.swing.*;

public class WindowConsumer implements Consumer {
    @Override
    public void showResult(String result) {

        JFrame frame = new JFrame("WTF!!!");
        JOptionPane.showMessageDialog(frame, result);

    }
}
