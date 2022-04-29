import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.*;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class App {
    public static void main(String[] args) throws Exception {
        double first;
        double second;
        double result;
        String operation;
        String answer;


        JButton but;
        JButton but0;
        JButton but2;
        JButton but3;
        JButton but4;
        JButton but5;
        JButton but6;
        JButton but7;
        JButton but8;
        JButton but9;
        JButton butreiz;
        JButton butdal;
        JButton butplus;
        JButton butminus;
        JButton butkomats;
        JButton butzimmaina;
        JFrame frame = new JFrame("Autoplaca vadibas panelis profesionaliem");
        JTextField textfield; 
        textfield = new JTextField(" ");
        textfield.setBounds(50, 150, 200, 30);
        textfield.setLocation(20,20);
        frame.add(textfield);
        
        butminus = new JButton("-");
        butminus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)            {
                String nummber = textfield.getText()+butminus.getText();
                textfield.setText(nummber);
            }
        }); 
        but = new JButton("1");
        but.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)            {
                String nummber = textfield.getText()+but.getText();
                textfield.setText(nummber);
            }
        }); 
        but0 = new JButton("0");
        but0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)            {
           {
                        String nummber = textfield.getText()+but0.getText();
                        textfield.setText(nummber);
                    }
                ; 
            }
        }); 
        but2 = new JButton("2");
        but2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)            {
                String nummber = textfield.getText()+but2.getText();
                textfield.setText(nummber);
            }
        }); 
        but3 = new JButton("3");
        but3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)            {
                String nummber = textfield.getText()+but3.getText();
                textfield.setText(nummber);
            }
        }); 
        but4 = new JButton("4");
        but4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)            {
                String nummber = textfield.getText()+but4.getText();
                textfield.setText(nummber);
            }
        }); 
        but5 = new JButton("5");
        but5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)            {
                String nummber = textfield.getText()+but5.getText();
                        textfield.setText(nummber);
            }
        }); 
        but6 = new JButton("6");
        but6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)            {
                String nummber = textfield.getText()+but6.getText();
                textfield.setText(nummber);
            }
        }); 
        but7 = new JButton("7");
        but7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)            {
                String nummber = textfield.getText()+but7.getText();
                        textfield.setText(nummber);
            }
        }); 
        but8 = new JButton("8");
        but8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)            {
                String nummber = textfield.getText()+but8.getText();
                textfield.setText(nummber);
            }
        }); 
        but9 = new JButton("9");
        but9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)            {
                String nummber = textfield.getText()+but9.getText();
                textfield.setText(nummber);
            }
        }); 
        butzimmaina = new JButton("+/-");
        butzimmaina.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)            {
                System.out.println("You clicked the button zimmaina");
            }
        }); 
        butkomats = new JButton(".");
        butkomats.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)            {
                System.out.println("You clicked the button komats");
            }
        }); 
        butreiz = new JButton("×");
        butreiz.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)            {
                System.out.println("You clicked the button reiz");
            }
        }); 
        butdal = new JButton(":");
        butdal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)            {
                  Double first = Double.parseDouble(textfield.getText());
                textfield.setText("");
                String operation =":";
            }
        }); 
        butplus = new JButton("+");
        butplus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)            {
               Double first = Double.parseDouble(textfield.getText());
                textfield.setText("");
                String operation ="+";
            }
        }); 
        butzimmaina.setBounds(50,50,50,50);
        butminus.setBounds(50,50,50,50);
        butkomats.setBounds(50,50,50,50);
        but0.setBounds(50,50,50,50);
        but.setBounds(50,50,50,50);
        but2.setBounds(50,50,50,50);
        but3.setBounds(50,50,50,50);
        but4.setBounds(50,50,50,50);
        but5.setBounds(50,50,50,50);
        but6.setBounds(50,50,50,50);
        but7.setBounds(50,50,50,50);
        but8.setBounds(50,50,50,50);
        but9.setBounds(50,50,50,50);
        butreiz.setBounds(50,50,50,50);
        butdal.setBounds(50,50,50,50);
        butplus.setBounds(50,50,50,50);
        butzimmaina.setLocation(20,260);
        but0.setLocation(80,260);
        butkomats.setLocation(140,260);
        butminus.setLocation(200,260);
        but.setLocation(20,80);
        but2.setLocation(80,80);
        but3.setLocation(140,80);
        but4.setLocation(20,140);
        but5.setLocation(80,140);
        but6.setLocation(140,140);
        but7.setLocation(20,200);
        but8.setLocation(80,200);
        but9.setLocation(140,200);
        butreiz.setLocation(200,80);
        butdal.setLocation(200,140);
        butplus.setLocation(200,200);
        frame.add(but);
        frame.add(butkomats);
        frame.add(but0);
        frame.add(but2);
        frame.add(but3);
        frame.add(but4);
        frame.add(but5);
        frame.add(but6);
        frame.add(but7);
        frame.add(but8);
        frame.add(but9);
        frame.add(butreiz);
        frame.add(butdal);
        frame.add(butplus);
        frame.add(butminus);
        frame.add(butzimmaina);
     frame.setSize(800, 800);
     frame.setLayout(null);
     frame.setVisible(true);
    }
}
