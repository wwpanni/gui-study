package com.wang.lesson01;

import java.awt.*;

public class TestGridLatout {
    public static void main(String[] args) {
        Frame frame = new Frame();

        Button a = new Button("按钮A");
        Button b = new Button("按钮B");
        Button c = new Button("按钮C");
        Button d = new Button("按钮D");
        Button e = new Button("按钮E");
        Button f = new Button("按钮F");

        frame.setLayout(new GridLayout(3,2));
        frame.add(a);
        frame.add(b);
        frame.add(c);
        frame.add(d);
        frame.add(e);
        frame.add(f);

        //java函数自动给你尺寸大小
        frame.pack();
        //frame.setSize(500,500);
        frame.setVisible(true);

    }
}
