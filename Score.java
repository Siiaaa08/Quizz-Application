package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarFile;

public class Score extends JFrame {
    Score(String name, int score){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Quiz8.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,150,200,200);
        add(image);

        JLabel heading = new JLabel("Thank you " + name + " for playing QUIZ Test");
        heading.setBounds(100,80,700,30);
        heading.setFont(new Font("Tahoma",Font.BOLD,26));
        add(heading);

        JLabel Score = new JLabel("Your Score is " + score);
        Score.setBounds(460,200,300,30);
        Score.setFont(new Font("Tahoma",Font.BOLD,26));
        add(Score);

        JButton exit = new JButton("EXIT");
        exit.setBounds(500,270,120,30);
        exit.setBackground(Color.BLACK);
        exit.setForeground(Color.WHITE);
        add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Login();
            }
        });

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz18.jpg"));
        Image i22 = i11.getImage().getScaledInstance(950,550, Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i22);
        JLabel imagee = new JLabel(i33);
        imagee.setBounds(0,0,950,550);
        add(imagee);

        setSize(950,550);
        setLocation(200,100);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Score("User",0);
    }
}
