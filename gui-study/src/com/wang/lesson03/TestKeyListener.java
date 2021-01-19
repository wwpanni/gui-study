package com.wang.lesson03;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

//键
public class TestKeyListener {
    public static void main(String[] args) {
    new KeyFrame();
    }
}

class KeyFrame extends Frame{
    public KeyFrame(){
        super();
        setBounds(1,2,300,400);
        setVisible(true);
        this.addKeyListener(new KeyAdapter() {
            //键盘按下
            @Override
            public void keyPressed(KeyEvent e) {
                //获得键盘按下的哪一个键
                int keyCode = e.getKeyCode();//获取键码
                System.out.println(keyCode);//不需要去记录这个数值，直接使用静态属性就可以了VK_XXX
                if (keyCode == KeyEvent.VK_UP){
                    System.out.println("你按下的是上键");
                }
                //根据按下的不同操作，产生不同结果
            }
        });

    }
}