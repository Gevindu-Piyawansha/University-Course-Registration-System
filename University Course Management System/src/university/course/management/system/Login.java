/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university.course.management.system;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class Login extends JFrame implements ActionListener {

    JButton login, cancel;

    public Login() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 20, 100, 20);
        add(lblusername);

        JTextField tfusername = new JTextField();
        tfusername.setBounds(150, 20, 200, 20);
        add(tfusername);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40, 50, 100, 20);
        add(lblpassword);

        JPasswordField tfpassword = new JPasswordField();
        tfpassword.setBounds(150, 50, 200, 20);
        add(tfpassword);

        login = new JButton("Login");
        login.setBounds(40, 100, 100, 20);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        login.setFont(new Font("Tahoma", BOLD, 16));

        add(login);

        cancel = new JButton("Cancel");
        cancel.setBounds(180, 100, 100, 20);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", BOLD, 16));
        add(cancel);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);

        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {

        } else if (e.getSource() == cancel) {
            setVisible(false);
        }
    }

}

