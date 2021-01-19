package com.wang.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Panel 可以看成是一个空间,但是不能单独存在
public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();
        //布局的概念
        Panel panel = new Panel();

        //设置布局
        frame.setLayout(null);

        //坐标
        //设置弹出的位置和窗口的大小
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(0xEFECEC));//窗口的背景颜色

        //Panel设置坐标，相对于Frame
        panel.setBounds(0,0,500,50);
        panel.setBackground(new Color(0x091313));

        //Frame.add()
        frame.add(panel);

        frame.setVisible(true);

        //监听事件，监听窗口关闭事件 System.exit(0)
        //适配器模式
        frame.addWindowListener(new WindowAdapter() {
            //窗口点击关闭的时候需要做的事情
            @Override
            public void windowClosing(WindowEvent e) {
                //结束程序
                System.exit(0);
            }
        });


    }
}
