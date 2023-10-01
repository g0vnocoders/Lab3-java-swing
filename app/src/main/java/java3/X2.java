package java3;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class X2 extends JFrame{
    X2(String s){
        super(s);
        setLayout(null);
        setSize(600, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocation(100,100);
    }
    public void paint(Graphics gr){
        int y = 0, j = 0, k = 0;
        gr.setColor(Color.WHITE);
        gr.fillRect(0,0,600,300);
        gr.setColor(Color.lightGray);

        while(j<600){
            gr.drawLine(j,0,j,300);
            j+=30;
        }
        while(k<300){
            gr.drawLine(0,k,600,k);
            k+=30;
        }
        gr.setColor(Color.BLACK);
        gr.drawLine(300,0,300,300);
        gr.drawLine(0,150,600,150);
        gr.drawString("0", 305, 165);
        gr.setColor(Color.RED);
        for(double i=0;i<1000;i++){
            y = -(int)(i*i/300) + 150;
            gr.drawLine((int)i+300,y,(int)i+300,y);
            gr.drawLine(-(int)i+300,y,-(int)i+300,y);
        }
        gr.dispose();

    }
}
