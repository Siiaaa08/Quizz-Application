package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login extends JFrame implements ActionListener {

    JTextField text;
    JButton Next, Back;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz1.jpg"));
        Image i = i1.getImage().getScaledInstance(550,500,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(450,0,550,400);
        add(image);

        JLabel heading = new JLabel("QUIZ TEST");
        heading.setBounds(120,60,300,45);
        heading.setFont(new Font("Vinear Hand ITC",Font.BOLD,50));
        heading.setForeground(Color.BLACK);
        add(heading);

        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(160,150,300,20);
        name.setFont(new Font("Mangolian Baiti", Font.BOLD,20));
        name.setForeground (Color.BLACK);
        add(name);

        text = new JTextField();
        text.setBounds(80,200,300,25);
        text.setFont(new Font("Times new Roman",Font.BOLD,20));
        add(text);

        Next = new JButton("NEXT");
        Next.setBounds(100,270,120,27);
        Next.setBackground(Color.BLACK);
        Next.setForeground(Color.WHITE);
        Next.addActionListener(this);
        add(Next);

        Back = new JButton("BACK");
        Back.setBounds(250,270,120,27);
        Back.setBackground(Color.BLACK);
        Back.setForeground(Color.WHITE);
        Back.addActionListener(this);
        add(Back);

        setSize(1000,500);
        setLocation(175,140);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Next){
          String name = text.getText();
          setVisible(false);
          new Rules(name);
        }
        else if(e.getSource() == Back){
            System.exit(100);
        }
    }

    public static void main(String[] args) {

        new Login();
    }
}
