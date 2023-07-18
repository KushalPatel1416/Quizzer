package QuizApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class login extends JFrame implements ActionListener {

    JButton rules,Exit;
    JLabel name;
    JTextField textField;
    login(){

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Quizomania");
        heading.setBounds(380,80,600,200);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,50));
        heading.setForeground(new Color(100, 153, 213));
        add(heading);

        name = new JLabel("Enter your name");
        name.setBounds(460,180,600,200);
        name.setFont(new Font("Times New Roman",Font.BOLD,20));
        name.setForeground(new Color(100, 153, 213));
        add(name);

         textField = new JTextField();
        textField.setBounds(460,300,150,30);
        textField.setFont(new Font("Times New Roman",Font.BOLD,20));
        textField.setForeground(Color.white);
        textField.setOpaque(false);
        add(textField);

        rules = new JButton("Rules");
        rules.setBounds(400,400,100,30);
        rules.setForeground(Color.black);
        rules.setBackground(new Color(100, 153, 213));
        rules.addActionListener(this);
        add(rules);

        Exit = new JButton("Exit");
        Exit.setBounds(600,400,100,30);
        Exit.setForeground(Color.black);
        Exit.setBackground(new Color(100, 153, 213));
        Exit.addActionListener(this);
        add(Exit);

        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("QuizApplication/Icons/download.jpg"));
        JLabel image = new JLabel(img1);
        image.setBounds(0,0,1060,900);
        add(image);

        setSize(1050,700);
        setLocation(250,80);
        setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(rules==e.getSource()){
            String str = textField.getText();
            setVisible(false);
            new rules(str);
        }
        else if(Exit==e.getSource()){
//           setVisible(false);
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new login();
    }
}
