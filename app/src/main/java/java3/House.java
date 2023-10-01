package java3;

/*Створіть форму розміром 500х500 і намалюйте на ній будиночок, використовуючи
методи drawLine, fillRect або drawPolygon. Окремі елементи будинка мають бути
пофарбованими.*/
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class House extends JFrame {
    public House(String s) {
        super(s);
        setLayout(null);
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocation(100, 100);
    }
    public void paint(Graphics gr){
        gr.setColor(Color.BLACK);
        //лінії
        gr.drawLine(100, 100, 400, 100);
        gr.drawLine(100, 100, 100, 400);
        gr.drawLine(400, 100, 400, 400);
        gr.drawLine(100, 400, 400, 400);
        gr.drawLine(100, 100, 250, 50);
        gr.drawLine(400, 100, 250, 50);
        
        //заливка
        gr.setColor(Color.DARK_GRAY);
        gr.fillRect(100, 100, 300, 300);
        //два вікна
        gr.setColor(Color.BLUE);
        gr.fillRect(150, 150, 50, 50);
        gr.fillRect(300, 150, 50, 50);
        //двері
        gr.setColor(Color.YELLOW);
        gr.fillRect(200, 250, 100, 150);
        
    }
}