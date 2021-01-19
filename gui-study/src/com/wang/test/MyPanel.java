package com.wang.test;

import java.awt.*;
//封装panel方法
public class MyPanel extends Panel {
    public MyPanel(int x,int y,int w,int h,Color color){
        super();
        super.setBounds(x,y,w,h);
        super.setBackground(color);
    }
}
