package QuizApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rules extends JFrame implements ActionListener {
    String name;
    JLabel rules;
    JButton back,start;
    rules(String name){
        this.name=name;

        if(name==null){
            this.name="User";
        }
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome "+name+" to Quizomania");
        heading.setBounds(10,5,1000,50);
        heading.setFont(new Font("Times New Roman",Font.BOLD,40));
        heading.setForeground(new Color(100, 153, 213));
        add(heading);

        rules = new JLabel();
        rules.setBounds(20,50,1000,400);
        rules.setFont(new Font("Tahoma",Font.PLAIN,15));
        rules.setText(
                "<html>"+
                        "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                        "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                        "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                        "4. Crying is allowed but please do so quietly." + "<br><br>" +
                        "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                        "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                        "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                        "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
                        "<html>"
        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(400,450,90,30);
        back.setForeground(Color.black);
        back.setBackground(new Color(100, 153, 213));
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(550,450,90,30);
        start.setForeground(Color.black);
        start.setBackground(new Color(100, 153, 213));
        start.addActionListener(this);
        add(start);

        setSize(1050,700);
        setLocation(250,80);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(back==e.getSource()){
            setVisible(false);
            new login();
        }
        else if(start==e.getSource()){
            setVisible(false);
            new Start(name);
        }
    }

    public static void main(String[] args) {
        new rules("User");
    }
}
