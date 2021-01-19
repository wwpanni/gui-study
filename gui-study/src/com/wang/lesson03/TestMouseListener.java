package com.wang.lesson03;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

//鼠标监听事件
public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("画图");
    }
}

//自己的类
class MyFrame extends Frame{
    ArrayList points;
    //画画需要画笔，需要监听鼠标当前的位置，需要集合来存储这个点
    public MyFrame(String title){
        super(title);
        setBounds(200,200,400,300);

        //存鼠标点击的一个点
        points =new ArrayList<>();

        setVisible(true);
        //鼠标监听器，针对这个窗口
        this.addMouseListener(new MyMouseListener());
    }

    //重写画笔方法
    public void paint(Graphics g) {
        //画画需要监听鼠标的事件
        Iterator iterator = points.iterator();
        while(iterator.hasNext()){
            Point point = (Point) iterator.next();
            g.setColor(Color.BLUE);
            g.fillOval(point.x,point.y,10,10);
        }
    }
    //添加一个点到界面上
    public void  addPaint(Point point){
        points.add(point);
    }

    //适配器模式
    private class  MyMouseListener extends MouseAdapter{
        //鼠标 按下，弹起，按住不放

        @Override
        //按压事件方法
        public void mousePressed(MouseEvent e) {
            MyFrame myFrame = (MyFrame) e.getSource();
            //这里我们点击的时候 就会在界面上产生一个点
            //这个点就是鼠标的点
            myFrame.addPaint(new Point(e.getX(),e.getY()));

            //每次点击鼠标都需要重新画一遍
            myFrame.repaint();//刷新 帧率
        }
    }
}