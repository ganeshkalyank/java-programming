import java.util.*;
import javax.swing.*;
import java.awt.event.*;

class Faculty {
    String name;
    int id, n;
    Faculty() {
        n = 0;
        id = 0;
        name = "";
    }
    Faculty(int id, String name, int n) {
        this.id = id;
        this.name = name;
        this.n = n;
    }
}

class Course {
    String name;
    Faculty faculty1, faculty2, faculty3;
    Course() {
        name = "";
        faculty1 = new Faculty();
        faculty2 = new Faculty();
        faculty3 = new Faculty();
    }
    Course(String name, Faculty faculty1, Faculty faculty2, Faculty faculty3) {
        this.name = name;
        this.faculty1 = faculty1;
        this.faculty2 = faculty2;
        this.faculty3 = faculty3;
    }
}

class Student {
    String name,elective1,elective2,faculty1,faculty2;
    int reg_no;
    Student() {
        name = "";
        reg_no = 0;
        elective1 = "";
        elective2 = "";
        faculty1 = "";
        faculty2 = "";
    }
    Student(String name, int reg_no, String elective1, String elective2, String faculty1, String faculty2) {
        this.name = name;
        this.reg_no = reg_no;
        this.elective1 = elective1;
        this.elective2 = elective2;
        this.faculty1 = faculty1;
        this.faculty2 = faculty2;
    }
}

class EmptyFieldException extends Exception {
    EmptyFieldException() {
        super("Empty Field Exception");
    }
}

class StudentElectives {
    JFrame f;
    ArrayList<Course> courses;
    TreeSet<Student> students;

    void addStudent(TreeSet<Student> ts, Student s) throws EmptyFieldException {
        if(s.name.equals("") || s.reg_no == 0)
            throw new EmptyFieldException();
        ts.add(s);
    }

    StudentElectives() {
        f = new JFrame("Student Electives");
        courses = new ArrayList<Course>();
        students = new TreeSet<Student>(new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.reg_no - s2.reg_no;
            }
        });

        Faculty f1 = new Faculty(1, "Faculty 1", 10);
        Faculty f2 = new Faculty(2, "Faculty 2", 10);
        Faculty f3 = new Faculty(3, "Faculty 3", 10);
        Course java = new Course("Java",f1,f2,f3);
        courses.add(java);

        Faculty f4 = new Faculty(4, "Faculty 4", 10);
        Faculty f5 = new Faculty(5, "Faculty 5", 10);
        Faculty f6 = new Faculty(6, "Faculty 6", 10);
        Course python = new Course("Python",f4,f5,f6);
        courses.add(python);

        JLabel courselabel1 = new JLabel("Select Course 1: ");
        courselabel1.setBounds(50, 50, 100, 30);
        f.add(courselabel1);

        String list[] = {"Java Faculty 1", "Java Faculty 2", "Java Faculty 3", "Python Faculty 4", "Python Faculty 5", "Python Faculty 6"};
        JComboBox<String> course1 = new JComboBox<String>(list);
        course1.setBounds(150, 50, 200, 30);
        f.add(course1);

        JLabel courselabel2 = new JLabel("Select Course 2: ");
        courselabel2.setBounds(50, 100, 100, 30);
        f.add(courselabel2);

        JComboBox<String> course2 = new JComboBox<String>(list);
        course2.setBounds(150, 100, 200, 30);
        f.add(course2);

        JLabel selectedcourseslabel = new JLabel("Selected Courses: ");
        selectedcourseslabel.setBounds(20, 150, 130, 30);
        f.add(selectedcourseslabel);

        JTextArea selectedcourses = new JTextArea();
        selectedcourses.setBounds(150, 150, 200, 70);
        f.add(selectedcourses);

        JButton showbtn = new JButton("Show Result");
        showbtn.setBounds(150, 250, 200, 30);
        f.add(showbtn);

        showbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int course1index = course1.getSelectedIndex();
                int course2index = course2.getSelectedIndex();

                int course1rem = 0, course2rem = 0;

                switch(course1index) {
                    case 0:
                        course1rem = f1.n;
                        break;
                    case 1:
                        course1rem = f2.n;
                        break;
                    case 2:
                        course1rem = f3.n;
                        break;
                    case 3:
                        course1rem = f4.n;
                        break;
                    case 4:
                        course1rem = f5.n;
                        break;
                    case 5:
                        course1rem = f6.n;
                        break;
                }

                switch (course2index) {
                    case 0:
                        course2rem = f1.n;
                        break;
                    case 1:
                        course2rem = f2.n;
                        break;
                    case 2:
                        course2rem = f3.n;
                        break;
                    case 3:
                        course2rem = f4.n;
                        break;
                    case 4:
                        course2rem = f5.n;
                        break;
                    case 5:
                        course2rem = f6.n;
                        break;
                }

                if (course1rem == 0 || course2rem == 0) {
                    selectedcourses.setText("No Seats Available");
                } else {
                    String course1name = course1.getSelectedItem().toString();
                    String course2name = course2.getSelectedItem().toString();
                    selectedcourses.setText(course1name + "\n" + course2name);
                }
            }
        });

        JLabel studentname = new JLabel("Enter Student Name: ");
        studentname.setBounds(20, 300, 130, 30);
        f.add(studentname);

        JTextField studentnamefield = new JTextField();
        studentnamefield.setBounds(150, 300, 200, 30);
        f.add(studentnamefield);

        JLabel studentregno = new JLabel("Enter Reg No: ");
        studentregno.setBounds(20, 350, 130, 30);
        f.add(studentregno);

        JTextField studentregnofield = new JTextField();
        studentregnofield.setBounds(150, 350, 200, 30);
        f.add(studentregnofield);

        JButton submitbtn = new JButton("Submit");
        submitbtn.setBounds(150, 400, 200, 30);
        f.add(submitbtn);

        submitbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = studentnamefield.getText();
                int reg_no;
                try {
                    reg_no = Integer.parseInt(studentregnofield.getText());
                } catch(Exception ex) {
                    selectedcourses.setText("Invalid Reg No");
                    return;
                }
                int course1index = course1.getSelectedIndex();
                int course2index = course2.getSelectedIndex();

                Faculty faculty1 = null, faculty2 = null;

                switch(course1index) {
                    case 0:
                        faculty1 = f1;
                        break;
                    case 1:
                        faculty1 = f2;
                        break;
                    case 2:
                        faculty1 = f3;
                        break;
                    case 3:
                        faculty1 = f4;
                        break;
                    case 4:
                        faculty1 = f5;
                        break;
                    case 5:
                        faculty1 = f6;
                        break;
                }

                switch (course2index) {
                    case 0:
                        faculty2 = f1;
                        break;
                    case 1:
                        faculty2 = f2;
                        break;
                    case 2:
                        faculty2 = f3;
                        break;
                    case 3:
                        faculty2 = f4;
                        break;
                    case 4:
                        faculty2 = f5;
                        break;
                    case 5:
                        faculty2 = f6;
                        break;
                }

                // Course elective1 = courses.get(course1index/3);
                // Course elective2 = courses.get(course2index/3);

                Course elective1,elective2;

                if (course1index == 0 || course1index == 1 || course1index == 2)
                    elective1 = courses.get(0);
                else
                    elective1 = courses.get(1);

                if (course2index == 0 || course2index == 1 || course2index == 2)
                    elective2 = courses.get(0);
                else
                    elective2 = courses.get(1);
                
                Student s = new Student(name, reg_no, elective1.name, elective2.name, faculty1.name, faculty2.name);

                try {
                    if (faculty1.n == 0 || faculty2.n == 0)
                        throw new Exception("No Seats Available");
                    addStudent(students, s);
                    faculty1.n--;
                    faculty2.n--;
                    selectedcourses.setText("Student Added Successfully");
                } catch (Exception ex) {
                    selectedcourses.setText(ex.getMessage());
                }
            }
        });

        JButton showstudentsbtn = new JButton("Show Students");
        showstudentsbtn.setBounds(150, 450, 200, 30);
        f.add(showstudentsbtn);

        showstudentsbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String studentslist = "";
                for (Student s : students) {
                    studentslist += s.name + " " + s.reg_no + " " + s.elective1 + " " + s.elective2 + " " + s.faculty1 + " " + s.faculty2 + "\n";
                }
                selectedcourses.setText(studentslist);
            }
        });

        f.setSize(500, 600);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new StudentElectives();
    }
}