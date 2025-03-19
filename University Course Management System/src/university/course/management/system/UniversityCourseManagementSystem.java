/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package university.course.management.system;

import university.course.management.system.Login;
/**
 * 
 * @author Admin
 */
import java.awt.Image;
import javax.swing.*;

public class UniversityCourseManagementSystem extends JFrame {

    UniversityCourseManagementSystem() {

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        setVisible(true);

        for (int i = 0; i < 600; i++) {
            setSize(2 * i, i);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new UniversityCourseManagementSystem();
        new Login();
        
        
        // TODO code application logic here
    }

}
