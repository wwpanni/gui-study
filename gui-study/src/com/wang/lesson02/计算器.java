package com.wang.lesson02;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class 计算器 {
    public static void main(String[] args) {
new frame();
    }
}
class frame extends Frame{
    public frame() throws HeadlessException {
        super("计算器");
        //文本框
        TextField n1 = new TextField();
        TextField n2 = new TextField();
        TextField n3 = new TextField();
        //按钮
        Mya mya = new Mya(n1);
        Button an1 = new Button("1");
        an1.addActionListener(mya);
        Button an2 = new Button("2");
        an2.addActionListener(mya);
        Button an3 = new Button("3");
        an3.addActionListener(mya);
        Button an4 = new Button("4");
        an4.addActionListener(mya);
        Button an5 = new Button("5");
        an5.addActionListener(mya);
        Button an6 = new Button("6");
        an6.addActionListener(mya);
        Button an7 = new Button("7");
        an7.addActionListener(mya);
        Button an8 = new Button("8");
        an8.addActionListener(mya);
        Button an9 = new Button("9");
        an9.addActionListener(mya);
        Button jia = new Button("+");
        jia.addActionListener(new jia(n1));
        Button jian = new Button("-");
        Button sheng= new Button("*");
        Button chu= new Button("/");
        Button an0= new Button("0");
        an0.addActionListener(mya);
        Button deng= new Button("=");
        //窗口
        setLayout(new GridLayout(2,1));
        //布局
        Panel p1 = new Panel(new GridLayout(4,4));
        p1.add(an7);
        p1.add(an8);
        p1.add(an9);
        p1.add(sheng);
        p1.add(an4);
        p1.add(an5);
        p1.add(an6);
        p1.add(jian);
        p1.add(an1);
        p1.add(an2);
        p1.add(an3);
        p1.add(jia);
        p1.add(chu);
        p1.add(an0);
        p1.add(new Label(""));
        p1.add(deng);

        add(n1);
        add(p1);

        setVisible(true);
        exit(this);
        setBounds(500,200,400,600);
    }
    //退出事件
    private static void exit(frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
class Mya implements ActionListener{
    TextField n1;
    public Mya(TextField n1) {
        this.n1 = n1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int i= Integer.parseInt(e.getActionCommand());
        n1.setText(""+(i));
    }
}
class jia implements ActionListener{
    TextField n1;
    public jia(TextField n1) {
        this.n1 = n1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       int i = Integer.parseInt(n1.getText());

       int b = Integer.parseInt(n1.getText());
       n1.setText(""+(i+b));

    }
}