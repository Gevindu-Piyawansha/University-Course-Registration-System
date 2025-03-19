/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university.course.management.system;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Admin
 */
public class Project extends JFrame implements ActionListener{

    public Project() {
        setSize(1540, 850);
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/main.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(1540, 850, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);
        
        JMenuBar mb = new JMenuBar();
        
//        New Informaton
        JMenu newInformation = new JMenu("New Information");
        mb.add(newInformation);
        
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        newInformation.add(facultyInfo);
        
        JMenuItem studentInfo = new JMenuItem("New Student Information");
        newInformation.add(studentInfo);
        
//        Details
        JMenu details = new JMenu("View Details");
        mb.add(details);
        
        JMenuItem facultyDetails = new JMenuItem("View Faculty Details");
        details.add(facultyDetails);
        
        JMenuItem studentDetails = new JMenuItem("View Student Details");
        details.add(studentDetails);
        
        setJMenuBar(mb);
        
        //        Courses
        JMenu course = new JMenu("Apply Course");
        mb.add(course);
        
        JMenuItem java = new JMenuItem("Java Development");
        course.add(java);
        
        JMenuItem python = new JMenuItem("Phython Development");
       course.add(python);
        
        setJMenuBar(mb);
        
      
         //        Exams
        JMenu exam = new JMenu("Examination");
        mb.add(exam);
        
        JMenuItem examinationDetails = new JMenuItem("Examination Details");
        exam.add(examinationDetails);
        
        JMenuItem enterMarks = new JMenuItem("Enter Marks");
        exam.add(enterMarks);
        
        setJMenuBar(mb);
        
        //        UpdateInfo
        JMenu updateInfo = new JMenu("Update Details");
        mb.add(updateInfo);
        
        JMenuItem updateFacultyInfo = new JMenuItem("Update Faculty Details");
        updateInfo.add(updateFacultyInfo);
        
        JMenuItem updateStudentDetails = new JMenuItem("Update Student Details");
        updateInfo.add(updateStudentDetails);
        
        setJMenuBar(mb);
        
        //        Prerequisites
        JMenu prerequisites = new JMenu("Prerequisites");
        mb.add(prerequisites);
        
        JMenuItem JavaCoursePrerequisites = new JMenuItem("Java development Prerequisites");
        prerequisites.add(JavaCoursePrerequisites );
        
        JMenuItem pythonCoursePrerequisites = new JMenuItem("Python development Prerequisites");
        prerequisites.add(pythonCoursePrerequisites);
        
        setJMenuBar(mb);
        
        //        Exit
        JMenu exit = new JMenu("Exit");
        mb.add(exit);
        
        JMenuItem ex = new JMenuItem("Exit");
        exit.add(ex);
        ex.addActionListener(this);
       
        setJMenuBar(mb);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Project();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = e.getActionCommand();
        if (msg.equals("Exit")) {
            setVisible(false);
        }
    }
    
}
