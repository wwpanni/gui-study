package com.wang.lesson01;

import java.awt.*;

public class TestFrame2 {
    public static void main(String[] args) {
        //展示多个窗口
        myframe myframe1 = new myframe(100, 100, 300, 300, Color.RED);


    }
}
//方法封装
class myframe extends Frame{
    static int id = 0;//可能存在多个窗口，我们需要一个记数器
    public myframe(int x,int y,int w ,int h,Color color){
        super("Myframe+"+(++id));
        //设置可见性
        setVisible(true);

        //等价于设置弹出的初识位置和窗口大小
        setBounds(x,y,w,h);

        //设置颜色
        setBackground(color);

    }
}
