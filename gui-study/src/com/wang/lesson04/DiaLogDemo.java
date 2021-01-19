package com.wang.lesson04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//住窗口
public class DiaLogDemo extends JFrame {
    public DiaLogDemo(){
        this.setVisible(true);
        this.setSize(700,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //JFrame放东西需要一个容易
        Container container = this.getContentPane();
        //绝对布局
        container.setLayout(null);

        //按钮
        JButton button = new JButton("点击弹出一个对话框");//创建
        button.setBounds(30,30,200,50);
        //点击这个按钮弹出一个弹框
        button.addActionListener(new ActionListener() {//监听器
            @Override
            public void actionPerformed(ActionEvent e) {
                //弹窗
                new MyDialogDemo();
            }
        });

        container.add(button);
    }

    public static void main(String[] args) {
    new DiaLogDemo();
    }
}

//弹窗的窗口
class MyDialogDemo extends JDialog{
    public MyDialogDemo() {
        this.setVisible(true);
        this.setBounds(100,100,500,500);
        //this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(null);
        container.add(new Label("这是弹窗"));
    }
}
