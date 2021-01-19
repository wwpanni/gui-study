package com.wang.lesson03;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestPaint {
    public static void main(String[] args) {
    new MyPaint().loadFrame();
    }
}

class MyPaint extends Frame{
    public void loadFrame(){
        setBounds(200,200,500,500);
        setVisible(true);
    }

    //画笔
    @Override
    public void paint(Graphics g) {
        //画笔，需要有颜色可以画画
        // g.setColor(Color.red);
        //g.drawOval(100,100,100,100);
        //g.fillOval(200,100,100,100);//实心的圆

        g.setColor(Color.GREEN);
        g.drawRect(100,200,100,100);
    }
}
