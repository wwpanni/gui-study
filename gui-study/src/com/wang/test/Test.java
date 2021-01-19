package com.wang.test;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test {
    public static void main(String[] args) {
        //生成一个窗口
        MyFrame test = new MyFrame("test", 200, 200, 400, 400, new Color(0xF2F2F8));

        //生成一个布局
        MyPanel myPanel = new MyPanel(0, 0, 400, 50, new Color(1));

        //把布局放入test窗口中
        test.add(myPanel);


        //监听事件，监听窗口关闭事件 System.exit(0)
        //适配器模式
        new exit(test);
    }
}
//封装 关闭窗口方法
class exit{
    public exit(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            //窗口点击关闭的时候需要做的事情
            public void windowClosing(WindowEvent e) {
                //结束程序
                System.exit(0);
            }
        });
    }
}
