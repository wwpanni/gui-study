package com.wang.lesson01;

import java.awt.*;

public class ExTest {
    public static void main(String[] args) {
        //窗口
        Frame frame = new Frame("练习");
        frame.setLayout(new GridLayout(2,1));

        //布局
        Panel p1 = new Panel(new BorderLayout());
        Panel p2 = new Panel(new GridLayout(2, 1));
        Panel p3 = new Panel(new BorderLayout());
        Panel p4 = new Panel(new GridLayout(2, 2));
        //按钮
        p1.add(new Button ("demo"),BorderLayout.EAST);
        p1.add(new Button("demo"),BorderLayout.WEST);
        p2.add(new Button("demo"));
        p2.add(new Button("demo"));
        p1.add(p2,BorderLayout.CENTER); //把P2的按钮放入P1布局中

        p3.add(new Button("demo"),BorderLayout.EAST);
        p3.add(new Button("demo"),BorderLayout.WEST);
        for (int i = 0; i < 4; i++) {//给p4写按钮
            p4.add(new Button("demo"));
        }
        p3.add(p4,BorderLayout.CENTER);//把p4的按钮放入p3中

        //把布局放入窗口
        frame.add(p1);
        frame.add(p3);
        //设置弹出位置和窗口大小
        frame.setBounds(1000,500,600,500);
        frame.setVisible(true);
    }
}
