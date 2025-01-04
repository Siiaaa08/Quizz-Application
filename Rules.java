package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {

    JButton start, back;
    String name;

    Rules(String name){

        this.name = name;

        JLabel heading = new JLabel("Welcome" + name + "to QUIZ TEST");
        heading.setBounds(150,80,700,30);
        heading.setFont(new Font("Vinear Hand ITC",Font.BOLD,28));
        heading.setForeground(Color.BLACK);
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(70,70,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setForeground(Color.BLACK);
        rules.setText(
                "<html>"+
                        "1. Participation in the quiz is free and open to all above 18 years."+"<br><br>"+
                        "2. There are total 10 questions."+"<br><br>"+
                        "3. You have only 15 seconds to answer a question."+"<br><br>"+
                        "4. It is advised to complete the quiz in a single chance, if you switch tab in between or exit, your progress will be lost."+"<br><br"+
                        "<html>"

        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(300,400,100,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(450,400,100,30);
        start.setBackground(Color.BLACK);
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz18.jpg"));
        Image i = i1.getImage().getScaledInstance(1000,500,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(0,0,1000,500);
        add(image);

        setSize(1000,500);
        setLocation(175,140);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
         if(e.getSource()==start){
             setVisible(false);
             new Quiz(name);
         }
         else{
             setVisible(false);
             new Login();
         }
    }

    public static void main(String[] args) {

        new Rules("User");
    }
}
