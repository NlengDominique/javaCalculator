import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculator implements ActionListener {

    JFrame frame;
    JLabel l;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bmul,bdiv,bsub,bmod,bneg,bpt,bback,bclr,beq;
    double num1,num2,xd,check;

    public Calculator(){

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(360, 520);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.DARK_GRAY);
        l = new JLabel();
        l.setBounds(50,20,260,100);
        l.setOpaque(true);
        l.setFont(new Font("Tahoma",Font.BOLD,20));
        l.setHorizontalAlignment(JLabel.RIGHT);
        l.setBackground(Color.darkGray);
        l.setForeground(Color.white);
        l.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        frame.add(l);

        bclr=new JButton("CE");
        bclr.setBounds(50,160,50,50);
        bclr.setFocusable(false);
        bclr.setBackground(Color.RED);
        bclr.setForeground(Color.white);
        bclr.setFont(new Font("Arial",Font.BOLD,13));
        frame.add(bclr);

        bmod=new JButton("M");
        bmod.setBounds(120,160,50,50);
        bmod.setFocusable(false);
        frame.add(bmod);


        bneg=new JButton("-/+");
        bneg.setBounds(190,160,50,50);
        bneg.setFocusable(false);
        frame.add(bneg);

        bback=new JButton("BC");
        bback.setBounds(260,160,50,50);
        bback.setBackground(Color.cyan);
        bback.setFocusable(false);
        frame.add(bback);

        b7=new JButton("7");
        b7.setBounds(50,220,50,50);
        b7.setFocusable(false);
        frame.add(b7);

        b8=new JButton("8");
        b8.setBounds(120,220,50,50);
        b8.setFocusable(false);
        frame.add(b8);

        b9=new JButton("9");
        b9.setBounds(190,220,50,50);
        b9.setFocusable(false);
        frame.add(b9);

        bdiv=new JButton("/");
        bdiv.setBounds(260,220,50,50);
        bdiv.setFocusable(false);
        bdiv.setFont(new Font("Arial",Font.BOLD,20));
        bdiv.setBackground(Color.yellow);
        frame.add(bdiv);




        b4=new JButton("4");
        b4.setBounds(50,280,50,50);
        b4.setFocusable(false);
        frame.add(b4);

        b5=new JButton("5");
        b5.setBounds(120,280,50,50);
        b5.setFocusable(false);
        frame.add(b5);

        b6=new JButton("6");
        b6.setBounds(190,280,50,50);
        b6.setFocusable(false);
        frame.add(b6);

        bmul=new JButton("x");
        bmul.setBounds(260,280,50,50);
        bmul.setFocusable(false);
        bmul.setFont(new Font("Arial",Font.BOLD,20));
        bmul.setBackground(Color.yellow);
        frame.add(bmul);

        b1=new JButton("1");
        b1.setBounds(50,340,50,50);
        b1.setFocusable(false);
        frame.add(b1);

        b2=new JButton("2");
        b2.setBounds(120,340,50,50);
        b2.setFocusable(false);
        frame.add(b2);

        b3=new JButton("3");
        b3.setBounds(190,340,50,50);
        b3.setFocusable(false);
        frame.add(b3);

        bsub=new JButton("-");
        bsub.setBounds(260,340,50,50);
        bsub.setFocusable(false);
        bsub.setFont(new Font("Arial",Font.BOLD,25));
        bsub.setBackground(Color.yellow);
        frame.add(bsub);

        b0=new JButton("0");
        b0.setBounds(50,400,50,50);
        b0.setFocusable(false);
        frame.add(b0);

        bpt=new JButton(".");
        bpt.setBounds(120,400,50,50);
        bpt.setFocusable(false);
        bpt.setFont(new Font("Arial",Font.BOLD,25));
        frame.add(bpt);

        badd=new JButton("+");
        badd.setBounds(190,400,50,50);
        badd.setFont(new Font("Arial",Font.BOLD,25));
        badd.setFocusable(false);
        badd.setBackground(Color.darkGray);
        badd.setForeground(Color.white);
        frame.add(badd);

        beq=new JButton("=");
        beq.setBounds(260,400,50,50);
        beq.setFont(new Font("Arial",Font.BOLD,25));
        beq.setBackground(Color.yellow);
        beq.setFocusable(false);
        frame.add(beq);

        frame.setVisible(true);

        

        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this); 
        b8.addActionListener(this); 
        b9.addActionListener(this);  

        bpt.addActionListener(this);  
        bneg.addActionListener(this);
        bback.addActionListener(this);
        

        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        bmod.addActionListener(this);
        beq.addActionListener(this);
        bclr.addActionListener(this);









        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String z,zt;

        if(e.getSource() == b0){
            zt = l.getText();
            z = zt+"0";
            l.setText(z);  
        }

        if(e.getSource() == b1){
            zt = l.getText();
            z = zt+"1";
            l.setText(z);  
        }
        if(e.getSource() == b2){
            zt = l.getText();
            z = zt+"2";
            l.setText(z);  
        }

        if(e.getSource() == b3){
            zt = l.getText();
            z = zt+"3";
            l.setText(z);  
        }
        if(e.getSource() == b4){
            zt = l.getText();
            z = zt+"4";
            l.setText(z);  
        }
        if(e.getSource() == b5){
            zt = l.getText();
            z = zt+"5";
            l.setText(z);  
        }
        if(e.getSource() == b6){
            zt = l.getText();
            z = zt+"6";
            l.setText(z);  
        }
        if(e.getSource() == b7){
            zt = l.getText();
            z = zt+"7";
            l.setText(z);  
        }
        if(e.getSource() == b8){
            zt = l.getText();
            z = zt+"8";
            l.setText(z);  
        }
        if(e.getSource() == b9){
            zt = l.getText();
            z = zt+"9";
            l.setText(z);  
        }
        if(e.getSource() == bneg){
            zt = l.getText();
            z = "-"+zt;
            l.setText(z);  
        }
        if(e.getSource() == bpt){
            zt = l.getText();
            z = zt+".";
            l.setText(z);  
        }

        if(e.getSource() == badd){
            try{
                num1 = Double.parseDouble(l.getText());
            }
            catch(NumberFormatException ex){
                l.setText("Entrer un nombre valide");
                return;
            }

            z ="";
            l.setText(z);
            check = 1;
            
        }
        if(e.getSource() == bsub){
            try{
                num1 = Double.parseDouble(l.getText());
            }
            catch(NumberFormatException ex){
                l.setText("Entrer un nombre valide");
                return;
            }

            z ="";
            l.setText(z);
            check = 2;
            
        }
        if(e.getSource() == bmul){
            try{
                num1 = Double.parseDouble(l.getText());
            }
            catch(NumberFormatException ex){
               l.setText("Entrer un nombre valide");
                return;
            }

            z ="";
            l.setText(z);
            check = 3;
            
        }
        if(e.getSource() == bdiv){
            try{
                num1 = Double.parseDouble(l.getText());
            }
            catch(NumberFormatException ex){
               l.setText("Entrer un nombre valide");
                return;
            }

            z ="";
            l.setText(z);
            check = 4;
            
        }
        if(e.getSource() == bmod){
            try{
                num1 = Double.parseDouble(l.getText());
            }
            catch(NumberFormatException ex){
               l.setText("Entrer un nombre valide");
                return;
            }

            z ="";
            l.setText(z);
            check = 5;
            
        }
        if(e.getSource() == beq){
            try{
                num2 = Double.parseDouble(l.getText());
            }
            catch(Exception ex){
               l.setText("Entrer un premier nombre :");
                return;
            }

            if(check == 1){
                xd = num1 + num2;
                z = String.valueOf(xd);
                l.setText(z);
            }
            if(check == 2){
                xd = num1 - num2;
                z = String.valueOf(xd);
                l.setText(z);
            }
            if(check == 3){
                xd = num1 * num2;
                z = String.valueOf(xd);
                l.setText(z);
            }

            if(check == 4){
                try{
                    xd = num1/num2;
                    z = String.valueOf(xd);
                    l.setText(z);
                }
                catch(ArithmeticException x){
                    l.setText("Division impossible"+x.getMessage());
                }
            }

            if(check == 5){
                xd = num1 % num2;
                z = String.valueOf(xd);
                l.setText(z);
            }
            
        }

        if(e.getSource() == bback){
            zt = l.getText();
            z = zt.substring(0,zt.length()-1);
            l.setText(z);
        }

        if(e.getSource() == bclr){
            num1=0;
            num2=0;
            xd=0;
            z="";
            l.setText(z);
        }
        
    }

    public static void main(String[] args) {
        new Calculator();
    }

    
    
}
