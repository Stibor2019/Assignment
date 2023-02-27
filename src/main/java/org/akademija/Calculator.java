package org.akademija;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Calculator {
    public static void main(String[] args) {


    Frame f = new Frame("Calculator");
        f.setLayout(new

    FlowLayout());
        f.setSize(500,400);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing (WindowEvent e){
            System.exit(0);
        }
    });
    Label header = new Label("Mini AWT calculator");
    Label l1 = new Label("Enter First Number:");
    Label l2 = new Label("Enter Second Number:");
    Label l3 = new Label("Result:");
    Label l4 = new Label("Operations:");

    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();
    header.setBounds(150,50,200,20);
    l1.setBounds(50,100,120,25);
    l2.setBounds(50,140,120,25);
    l3.setBounds(50,240,120,25);
    l4.setBounds(50,180,120,25);

    t1.setBounds(200,100,120,20);
    t2.setBounds(200,140,120,20);
    t3.setBounds(200,240,120,30);

    Choice myChoice = new Choice();
    myChoice.add("+");
    myChoice.add("-");
    myChoice.add("*");
    myChoice.add("/");
    myChoice.setBounds(200,180,120,20);
    myChoice.setBackground(new

    Color(224,224,224));
    Button b1 = new Button("Calculate");

    b1.setBounds(200,208,120,25);
    b1.setBackground(new Color(255,51,51));
    t1.setBackground(new Color(224,224,224));
    t2.setBackground(new Color(224,224,224));
    t3.setBackground(new Color(224,224,224));
    f.setBackground(new Color(255,153,153));
    f.setLayout(null);

    f.add(myChoice);
    f.add(header);
    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(l4);
    f.add(t1);
    f.add(t2);
    f.add(t3);
    f.add(myChoice);
    f.add(b1);

    b1.addActionListener(new

    ActionListener() {
        @Override
        public void actionPerformed (ActionEvent event){

            float number1 = Float.parseFloat((t1.getText()));
            float number2 = Float.parseFloat((t2.getText()));

            String s = myChoice.getSelectedItem();

            if (event.getSource() == b1 && s.equals("+")) {
                t3.setText(String.valueOf(number1 + number2));
            }

            if (event.getSource() == b1 && s.equals("-")) {
                t3.setText(String.valueOf(number1 - number2));
            }

            if (event.getSource() == b1 && s.equals("*")) {
                t3.setText(String.valueOf(number1 * number2));
            }

            if (event.getSource() == b1 && s.equals("/")) try {
                t3.setText(String.valueOf(number1 / number2));
            } catch (ArithmeticException ae) {
                System.out.println("Division by zero,error...");
            }
         /*   {
                System.exit(0);
            }*/
        }
        public static void main (String...s)
        {
            new Calculator();
        }
    });
   }
}
