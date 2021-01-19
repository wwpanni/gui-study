package com.wang.lesson04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;

public class JFrameDemo02 {
    public static void main(String[] args) {
    new MyJFrame().init();
    }
}

class MyJFrame extends JFrame{
    public MyJFrame() throws HeadlessException {
        super("这是一个JFrame窗");
    }

    //init();初始化
    public void init(){
        this.setVisible(true);
        this.setBounds(10,10,200,300);
        //获得一个容器
        Container container = this.getContentPane();
        //窗口颜色
        container.setBackground(Color.BLUE);
        //文本标签
        JLabel label = new JLabel("你好");
        this.add(label);

        //让我们的文本标签居中
        label.setHorizontalAlignment(SwingConstants.CENTER);


        //关闭事件
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}