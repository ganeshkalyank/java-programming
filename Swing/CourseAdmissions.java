import java.awt.event.*;
import javax.swing.*;

class StudentDetails {
    String courseId, courseLevel, applicantName, mailId, mobileNo;
    int marks[];
    StudentDetails(String courseId, String courseLevel, String applicantName, String mailId, String mobileNo, int marks[]) {
        this.courseId = courseId;
        this.courseLevel = courseLevel;
        this.applicantName = applicantName;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        this.marks = marks;
    }
}

class TopTextAnimator extends Thread {
    JLabel toptext;
    TopTextAnimator(JLabel toptext) {
        this.toptext = toptext;
    }
    public void run() {
        while (true) {
            toptext.setBounds(toptext.getX() - 1, 20, 200, 30);
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e);
            }
            if (toptext.getX() == -200) {
                toptext.setBounds(500, 20, 200, 30);
            }
        }
    }
}

public class CourseAdmissions {
    JFrame f;
    CourseAdmissions() {
        f = new JFrame("Course Admissions");

        JLabel toptext = new JLabel("Welcome to Online Programmes");
        toptext.setBounds(500, 20, 200, 30);
        f.add(toptext);

        TopTextAnimator tta = new TopTextAnimator(toptext);
        tta.start();

        JLabel namelabel = new JLabel("Applicant Name");
        namelabel.setBounds(20, 60, 200, 30);
        f.add(namelabel);

        JTextField namefield = new JTextField(50);
        namefield.setBounds(20, 90, 200, 30);
        f.add(namefield);

        JLabel maillabel = new JLabel("Mail Id");
        maillabel.setBounds(20, 130, 200, 30);
        f.add(maillabel);

        JTextField mailfield = new JTextField();
        mailfield.setBounds(20, 160, 200, 30);
        f.add(mailfield);

        JLabel mobilelabel = new JLabel("Mobile No");
        mobilelabel.setBounds(20, 200, 200, 30);
        f.add(mobilelabel);

        JTextField mobilefield = new JTextField();
        mobilefield.setBounds(20, 230, 200, 30);
        f.add(mobilefield);

        JLabel courselabel = new JLabel("Course Id");
        courselabel.setBounds(20, 270, 200, 30);
        f.add(courselabel);

        String[] courses = {"101BCA", "201MCA", "301MBA"};

        JComboBox<String> coursecombo = new JComboBox<String>(courses);
        coursecombo.setBounds(20, 300, 200, 30);
        f.add(coursecombo);

        JLabel courselevellabel = new JLabel("Course Level");
        courselevellabel.setBounds(20, 340, 200, 30);
        f.add(courselevellabel);

        String[] courselevels = {"Under Graduate", "Post Graduate"};

        JComboBox<String> courselevelcombo = new JComboBox<String>(courselevels);
        courselevelcombo.setBounds(20, 370, 200, 30);
        f.add(courselevelcombo);

        JLabel markslabel = new JLabel("Marks");
        markslabel.setBounds(240, 60, 200, 30);
        f.add(markslabel);

        JLabel mark1label = new JLabel("Mark 1");
        mark1label.setBounds(240, 100, 200, 30);
        f.add(mark1label);

        JTextField mark1field = new JTextField();
        mark1field.setBounds(240, 130, 200, 30);
        f.add(mark1field);

        JLabel mark2label = new JLabel("Mark 2");
        mark2label.setBounds(240, 170, 200, 30);
        f.add(mark2label);

        JTextField mark2field = new JTextField();
        mark2field.setBounds(240, 200, 200, 30);
        f.add(mark2field);

        JLabel mark3label = new JLabel("Mark 3");
        mark3label.setBounds(240, 240, 200, 30);
        f.add(mark3label);

        JTextField mark3field = new JTextField();
        mark3field.setBounds(240, 270, 200, 30);
        f.add(mark3field);

        JLabel mark4label = new JLabel("Mark 4");
        mark4label.setBounds(240, 310, 200, 30);
        f.add(mark4label);

        JTextField mark4field = new JTextField();
        mark4field.setBounds(240, 340, 200, 30);
        f.add(mark4field);

        JLabel mark5label = new JLabel("Mark 5");
        mark5label.setBounds(240, 380, 200, 30);
        f.add(mark5label);

        JTextField mark5field = new JTextField();
        mark5field.setBounds(240, 410, 200, 30);
        f.add(mark5field);

        JButton submitbutton = new JButton("Submit");
        submitbutton.setBounds(120, 450, 200, 30);
        f.add(submitbutton);

        JTextArea resultarea = new JTextArea();
        resultarea.setBounds(20, 500, 400, 200);
        f.add(resultarea);

        submitbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String courseId = coursecombo.getSelectedItem().toString();
                String courseLevel = courselevelcombo.getSelectedItem().toString();
                String applicantName = namefield.getText();
                String mailId = mailfield.getText();
                String mobileNo = mobilefield.getText();
                int marks[] = new int[5];

                try {
                    marks[0] = Integer.parseInt(mark1field.getText());
                    marks[1] = Integer.parseInt(mark2field.getText());
                    marks[2] = Integer.parseInt(mark3field.getText());
                    marks[3] = Integer.parseInt(mark4field.getText());
                    marks[4] = Integer.parseInt(mark5field.getText());
                } catch (Exception ex) {
                    resultarea.setText("Invalid marks!");
                    return;
                }

                try {
                    if (marks[0] < 0 | marks[1] < 0 | marks[2] < 0 | marks[3] < 0 | marks[4] < 0 | marks[0] > 100 | marks[1] > 100 | marks[2] > 100 | marks[3] > 100 | marks[4] > 100) {
                        throw new Exception("Marks should be between 0 and 100");
                    }
                    if (mobileNo.length() != 10) {
                        throw new Exception("Mobile No should be 10 digits");
                    }
                } catch (Exception ex) {
                    resultarea.setText(ex.getMessage());
                    return;
                }

                resultarea.setText("");

                StudentDetails sd = new StudentDetails(courseId, courseLevel, applicantName, mailId, mobileNo, marks);
                resultarea.append("Course Id: " + sd.courseId);
                resultarea.append("\n Course Level: " + sd.courseLevel);
                resultarea.append("\n Applicant Name: " + sd.applicantName);
                resultarea.append("\n Mail Id: " + sd.mailId);
                resultarea.append("\n Mobile No: " + sd.mobileNo);
                resultarea.append("\n Marks: " + sd.marks[0] + " " + sd.marks[1] + " " + sd.marks[2] + " " + sd.marks[3] + " " + sd.marks[4]);
                if (sd.marks[0] < 50 | sd.marks[1] < 50 | sd.marks[2] < 50 | sd.marks[3] < 50 | sd.marks[4] < 50) {
                    resultarea.append("\n Status: NOT APPLIED");
                } else {
                    resultarea.append("\n Status: APPLIED");
                }
                return;
            }
        });

        f.setSize(500, 800);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]) {
        new CourseAdmissions();
    }
}
