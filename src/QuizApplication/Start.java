package QuizApplication;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Start extends JFrame implements ActionListener{

    ImageIcon img;
    JLabel qno,question;
    JRadioButton opt1,opt2,opt3,opt4;
    ButtonGroup btngrp;
    JButton submit,lifeline,next;

    public static int time=15 ,count=0 ,score=0;
    public static int ans_given = 0;
    String questions[][]= new String[10][5];
    String answers[][]= new String[10][2];
    String User_ans[][]=new String[10][1];
    String name;
    Start(String name){
        this.name=name;
        setLayout(null);

        img = new ImageIcon(ClassLoader.getSystemResource("QuizApplication/Icons/quiz.jpg"));
        JLabel image = new JLabel(img);
        image.setBounds(0,0,1440,400);
        add(image);

        qno = new JLabel();
        qno.setBounds(85,200,50,500);
        qno.setFont(new Font("Times New Roman",Font.PLAIN,20));
        add(qno);

        question = new JLabel();
        question.setBounds(120,200,800,500);
        question.setFont(new Font("Times New Roman",Font.PLAIN,20));
        add(question);

        submit = new JButton("Submit");
        submit.setBounds(1250,630,100,30);
        submit.setBackground(new Color(100, 153, 213));
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);

        lifeline = new JButton("50 - 50");
        lifeline.setBounds(1250,470,100,30);
        lifeline.setBackground(new Color(100, 153, 213));
        lifeline.addActionListener(this);
        add(lifeline);

        next = new JButton("Next");
        next.setBounds(1250,550,100,30);
        next.setBackground(new Color(100, 153, 213));
        next.addActionListener(this);
        add(next);

        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";

        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";

        opt1 = new JRadioButton("option 1");
        opt1.setBounds(120,530,800,22);
        opt1.setFont(new Font("Times New Roman",Font.PLAIN,20));
        opt1.setBackground(Color.white);
        add(opt1);

        opt2 = new JRadioButton("option 1");
        opt2.setBounds(120,580,800,22);
        opt2.setFont(new Font("Times New Roman",Font.PLAIN,20));
        opt2.setBackground(Color.white);
        add(opt2);

        opt3 = new JRadioButton("option 1");
        opt3.setBounds(120,630,800,22);
        opt3.setFont(new Font("Times New Roman",Font.PLAIN,20));
        opt3.setBackground(Color.white);
        add(opt3);

        opt4 = new JRadioButton("option 1");
        opt4.setBounds(120,680,800,22);
        opt4.setFont(new Font("Times New Roman",Font.PLAIN,20));
        opt4.setBackground(Color.white);
        add(opt4);

        btngrp = new ButtonGroup();
        btngrp.add(opt1);
        btngrp.add(opt2);
        btngrp.add(opt3);
        btngrp.add(opt4);

        start(count);

        getContentPane().setBackground(Color.white);
        setBounds(30,50,1440,780);
        setVisible(true);
    }

    public void paint(Graphics g){
        super.paint(g);
        String timer = "Time Left - "+ time +" seconds";
        g.setFont(new Font("Tahoma",Font.BOLD,20));
        g.setColor(Color.RED);

        if(time>0){
            g.drawString(timer,1150,460);
        }
        else {
            String timeup = "Times Up !!";
            g.drawString(timeup,1150,460);
        }
        time--;
        try{             // for 1 second
            Thread.sleep(1000);
            repaint();
        }catch (Exception e){
            System.out.println(e);
        }
        //Answer is given by User
        if(ans_given==1){
            ans_given=0;
            time=15;
        }
        else if(time<0) {
            time = 15;

            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            if (count == 9) {
                if (btngrp.getSelection() == null) {
                    User_ans[count][0] = "";
                } else {
                    User_ans[count][0] = btngrp.getSelection().getActionCommand();
                }
                for (int i = 0; i < User_ans.length; i++) {
                    if (User_ans[i][0] == answers[i][1]) {
                        score += 10;
                    }
                }
                setVisible(false);

                //Score class
                new Score(name,score);
            }
            else {

                if (btngrp.getSelection() == null) {
                    User_ans[count][0] = "";
                } else {
                    User_ans[count][0] = btngrp.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }
        }

    }

    public void start(int count){
        qno.setText(" "+(count+1)+". ");
        question.setText(questions[count][0]);

        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        btngrp.clearSelection();

    }

    public void actionPerformed(ActionEvent e){

        if(next == e.getSource()){  //next button

            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            repaint();
            ans_given=1;

            if(btngrp.getSelection()==null){
                User_ans[count][0]="";
            }else {
                User_ans[count][0]=btngrp.getSelection().getActionCommand();
            }
            if(count==8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            count++;
            start(count);

        }else if(lifeline==e.getSource()){     //lifeline button

            if(count==2||count==4||count==6||count==8||count==9){
                opt1.setEnabled(false);
                opt3.setEnabled(false);
            }else {
                opt2.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);

        }else {
            //submit button
            if (btngrp.getSelection() == null) {
                User_ans[count][0] = "";
            } else {
                User_ans[count][0] = btngrp.getSelection().getActionCommand();
            }
            for (int i = 0; i < User_ans.length; i++) {
                if (User_ans[i][0] == answers[i][1]) {
                    score += 10;
                }
            }
            setVisible(false);
            new Score(name,score);
        }
    }

    public static void main(String[] args) {
        new Start("User");
    }
}
