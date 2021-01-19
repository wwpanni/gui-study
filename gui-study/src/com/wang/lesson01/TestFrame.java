package com.wang.lesson01;

import java.awt.*;

//Gui的第一个界面
public class TestFrame {
    public static void main(String[] args) {

        //Frame
        Frame frame = new Frame("我的第一个Java图像界面窗口");

        //设置可见性
        frame.setVisible(true);

        //设置窗口大小
        frame.setSize(400,400);

        //设置背景颜色 Color
        frame.setBackground(new Color(199, 46, 46));

        //弹出的初识位置
        frame.setLocation(200,200);

        //设置大小固定
        frame.setResizable(false);//true不固定 false为固定

        

    }
}
