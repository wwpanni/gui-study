package com.wang.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestTest01 {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
    }
}
class MyFrame extends Frame{
    public MyFrame() throws HeadlessException {
        TextField textField = new TextField();
        add(textField);

        //监听这个文本框输入的文字
        MyActionListener1 myActionListener1 = new MyActionListener1();
        //按下enter 就会触发这个输入框的事件
        textField.addActionListener(myActionListener1);

        //设置替换编码 隐藏显示
        //textField.setEchoChar('*');

        setVisible(true);
        pack();
        windowexit(this);

    }
    private static void windowexit(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}

class MyActionListener1 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
       TextField field = (TextField) e.getSource();//获得一些资源，返回了一个对象
        System.out.println(field.getText());//获得输入框的文本
        field.setText("");
    }
}