package com.reccolect.consumer;

import javax.swing.*;

public class WindowConsumer implements Consumer {
    @Override
    public void showResult(String result) {

        JFrame frame = new JFrame("WTF!!!");
        JOptionPane.showMessageDialog(frame, result);
        System.exit(0);

    }
}
