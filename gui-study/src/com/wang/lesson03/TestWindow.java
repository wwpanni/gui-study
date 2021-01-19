package com.wang.lesson03;

import com.sun.javaws.IconUtil;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindow {
    public static void main(String[] args) {
        new WindowFrame();
    }
}

class WindowFrame extends Frame{
    public WindowFrame(){
        setBackground(Color.BLUE);
        setBounds(100,100,200,200);
        setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            //匿名内部类

            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("windowOpened打开");
            }

            //常用 关闭窗口
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("windowClosing正在关闭");
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("windowClosed已经关闭");
            }

            //激活窗口
            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("windowActivated窗口激活");
            }

        });
    }

}