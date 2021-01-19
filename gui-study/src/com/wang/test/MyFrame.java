package com.wang.test;

import java.awt.*;
//封装frame方法
public class MyFrame extends Frame {

    public MyFrame(String name,int x,int y,int w,int h,Color color){
        //窗口名称
        super(name);
        //是否可见
        super.setVisible(true);
        //布局
        super.setLayout(null);
        //弹出位置 窗口大小
        super.setBounds(x,y,w,h);
        //设置颜色
        super.setBackground(color);
    }

}
