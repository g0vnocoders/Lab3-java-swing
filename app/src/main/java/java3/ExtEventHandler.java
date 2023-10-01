package java3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ExtEventHandler extends JFrame {
    ExtEventHandler(String s){
        super(s);
        setLayout(null);
        setSize(100, 200);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Button b1 = new Button("Перша кнопка");
        b1.setBounds(2,5,96,22);
        add(b1);
        Button b2 = new Button("Друга кнопка");
        b2.setBounds(2,100,96,22);
        add(b2);
        b1.addActionListener(new Handler(b1, b2));
        b2.addActionListener(new Handler(b1, b2));
    }
}
class Handler implements ActionListener{
    private Button ba;
    private Button bb;
    String temp;
    Handler(Button b1, Button b2){
        ba = b1;
        bb = b2;
    }
    public void actionPerformed(ActionEvent e){
        temp = ba.getLabel();
        ba.setLabel(bb.getLabel());
        bb.setLabel(temp);
    }
}