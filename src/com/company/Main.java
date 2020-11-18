package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.DrbgParameters;

public class Main {

    public static void main(String[] args) {

        JFrame frame1 = new JFrame("EGC");
        JFrame frame2 = new JFrame( "Главное меню");
        frame1.setBounds(500,200, 400, 400 );
        frame1.setVisible(true);
        frame2.setBounds(500, 200, 400, 400);


        Container contentPane = frame1.getContentPane();
        Container contentPane1 = frame2.getContentPane();

        contentPane.setPreferredSize(new Dimension(800,700));
        contentPane1.setPreferredSize(new Dimension(1800,1700));

        SpringLayout layout = new SpringLayout();
        SpringLayout layout1 = new SpringLayout();

        contentPane.setLayout(layout);
        contentPane1.setLayout(layout1);







        JButton button = new JButton("ВХОД");
        JButton button1 = new JButton("777");
        JButton button2 = new JButton ("888");
        JButton button3 = new JButton("999");

        Component label = new JLabel("Логин");
        JTextField field = new JTextField();

        Component label1 = new JLabel("Пароль");
        JTextField field1 = new JTextField();

        field.setPreferredSize(new Dimension(100,25));
        field1.setPreferredSize(new Dimension(100,25));
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {
                if (field.getText().equals("admin") && field1.getText().equals("admin"))
                    frame2.setVisible(true);
            }
        });
        frame1.add(button);



        contentPane.add(label);
        contentPane.add(field);
        layout.putConstraint(SpringLayout.WEST , label, 70,
                SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH, label, 120,
                SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.NORTH, field, 120,
                SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST , field, 19,
                SpringLayout.EAST , label      );

        contentPane.add(button);
        contentPane.add(label1);
        contentPane.add(field1);
        layout.putConstraint(SpringLayout.WEST , button, 155,
                SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH, button, 185,
                SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST , label1, 70,
                SpringLayout.WEST , contentPane);
        layout.putConstraint(SpringLayout.NORTH, label1, 150,
                SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.NORTH, field1, 148,
                SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST , field1, 9,
                SpringLayout.EAST , label1      );


        frame1.setSize(400, 400);
        frame1.setVisible(true);



        Component label2 = new JLabel ("ГЛАВНОЕ МЕНЮ");
        frame2.add(label2);

        contentPane1.add(label2);
        contentPane1.setLayout(layout1);
        layout1.putConstraint(SpringLayout.WEST , label2, 145,
                SpringLayout.WEST , contentPane1);
        layout1.putConstraint(SpringLayout.NORTH, label2, 5,
                SpringLayout.NORTH, contentPane1);


        frame2.add(button1);
        frame2.add(button2);

        contentPane1.add(button1);
        contentPane1.setLayout(layout1);
        layout1.putConstraint(SpringLayout.WEST , button1, 165,
                SpringLayout.WEST , contentPane);
        layout1.putConstraint(SpringLayout.NORTH, button1, 100,
                SpringLayout.NORTH, contentPane);
        layout1.putConstraint(SpringLayout.WEST, button2, 165,
                SpringLayout.WEST, contentPane);
        layout1.putConstraint(SpringLayout.NORTH, button2, 140,
                SpringLayout.NORTH, contentPane);




    }
}
