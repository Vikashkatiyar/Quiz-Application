
package quiz.application;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author vikash katiyar
 */
public class Login extends JFrame implements ActionListener{
     
    
     JButton rules,back;
     JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        JLabel image=new JLabel(i1);
        
        image.setBounds(0,0,600,500);
        add(image);
        
//      //first label
        JLabel heading=new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(Color.red);
        add(heading);
        
        
        //second JLabel
        JLabel name=new JLabel("Enter your name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        name.setForeground(Color.BLUE);
        add(name);
        
        // JTextField-> for input box
         tfname=new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times new Roman",Font.BOLD,20));
        add(tfname);
        
        
        // JButton -> for making the Button
        rules=new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(Color.pink);
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        
         back=new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(Color.pink);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        
        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);
    }
    
    public static void main(String []args){
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==rules){
            String name=tfname.getText();
            
            setVisible(false);
            new Rules(name);
        }else if(e.getSource()==back){
            setVisible(false);
        }
    }
}
