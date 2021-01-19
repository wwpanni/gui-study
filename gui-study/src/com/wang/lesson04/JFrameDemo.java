package com.wang.lesson04;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo {
    //init();初始化
    public void init(){
        //顶级窗口
        JFrame frame = new JFrame("这是一个JFrame窗口");
        frame.setVisible(true);
        frame.setBounds(100,100,200,200);
        frame.setBackground(Color.cyan);
        //设置文文字 JLabel
        JLabel label = new JLabel("你好");
        frame.add(label);

        //关闭事件
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        //建立一个窗口
        new JFrameDemo().init();
    }
}
