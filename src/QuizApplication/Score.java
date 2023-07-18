package QuizApplication;

import javax.swing.*;
import java.awt.*;

public class Score extends JFrame {
    JLabel heading,lscore;
    Score(String name, int score){
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("QuizApplication/Icons/score.png"));
        Image img2 = img1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image = new JLabel(img3);
        image.setBounds(0,0,1060,900);
        add(image);

        heading = new JLabel("Thankyou "+name+" for Playing this Quiz");
        heading.setBounds(150,40,900,200);
        heading.setFont(new Font("Tahoma",Font.BOLD,40));
        heading.setForeground(new Color(100, 153, 213));
        add(heading);

        lscore = new JLabel("Your Score is : "+score);
        lscore.setBounds(460,180,600,200);
        lscore.setFont(new Font("Times New Roman",Font.BOLD,20));
        lscore.setForeground(new Color(100, 153, 213));
        add(lscore);

        setSize(1050,700);
        setLocation(250,80);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Score("User",0);
    }
}
