package com.wang.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionTwo {
    public static void main(String[] args) {
        //两个按钮 实现一个监听
        //开始 停止
        Frame frame = new Frame("开始 停止");
        Button start = new Button("start");
        Button stop = new Button("stop");

        //可以显示的定义触发会返回的命令，如果不显示定义，则会走默认的值！
        //可以多个按钮只写一个监听类
        stop.setActionCommand("stop");
        a a = new a();
        start.addActionListener(a);
        stop.addActionListener(a);

        frame.add(start,BorderLayout.NORTH);
        frame.add(stop,BorderLayout.SOUTH);

        frame.setBounds(300,300,400,400);
        frame.setVisible(true);
        windowexit(frame);

    }
    private static void windowexit(Frame frame)
    {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
class a implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        //e.getActionCommand获取按钮信息
        System.out.println(e.getActionCommand());
    }
}