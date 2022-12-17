import javax.swing.*;
import java.util.*;
import java.awt.event.*;

class Feedback {
    String course_code,course_name,nature_qp,std_qs;
    boolean req_data,out_of,time_suff;
    Feedback(String cc,String cn,String nqp,String sqs,boolean rd,boolean oof,boolean ts) {
        this.course_code = cc;
        this.course_name = cn;
        this.nature_qp = nqp;
        this.std_qs = sqs;
        this.req_data = rd;
        this.out_of = oof;
        this.time_suff = ts;
    }
}

class FeedbackManagement {
    ArrayList<Feedback> fbs;
    FeedbackManagement() {
        fbs = new ArrayList<Feedback>();
    }
    void addFeedback(Feedback f) {
        if (f.course_code.equals(""))
            throw new IllegalArgumentException("Course Code cannot be empty");
        fbs.add(f);
    }
    String displayFeedback() {
        String res = "";
        for(Feedback f : fbs) {
            res += "Course Code: " + f.course_code + "Course Name: " + f.course_name + "Nature of Question Paper: " + f.nature_qp + "Standard of Questions: " + f.std_qs + "Required Data: " + f.req_data + "Out of Syllabus: " + f.out_of + "Time Sufficient: " + f.time_suff + "\n";
        }
        return res;
    }
}

class ExamFeedback {
    JFrame f;
    FeedbackManagement fm;
    ExamFeedback() {
        f = new JFrame();
        fm = new FeedbackManagement();

        JLabel cclabel = new JLabel("Course Code");
        cclabel.setBounds(20, 20, 225, 25);

        JTextField course_code = new JTextField();
        course_code.setBounds(20, 50, 225, 25);

        JLabel dglabel = new JLabel("Whether all the required data are given?");
        dglabel.setBounds(20, 85, 225, 25);

        ButtonGroup dgbg = new ButtonGroup();

        JRadioButton dgyes = new JRadioButton("Yes");
        dgyes.setBounds(25, 110, 75, 25);

        JRadioButton dgno = new JRadioButton("No");
        dgno.setBounds(125, 110, 75, 25);

        dgbg.add(dgyes);
        dgbg.add(dgno);

        JLabel oslabel = new JLabel("Is any question out of syllabus?");
        oslabel.setBounds(25, 145, 225, 25);

        ButtonGroup osbg = new ButtonGroup();

        JRadioButton osyes = new JRadioButton("Yes");
        osyes.setBounds(25, 170, 75, 25);

        JRadioButton osno = new JRadioButton("No");
        osno.setBounds(125, 170, 75, 25);

        osbg.add(osyes);
        osbg.add(osno);

        JLabel nqlabel = new JLabel("Nature of Question Paper");
        nqlabel.setBounds(20, 205, 225, 25);

        ButtonGroup nqbg = new ButtonGroup();

        JRadioButton nqeasy = new JRadioButton("Easy");
        nqeasy.setBounds(25, 230, 75, 25);

        JRadioButton nqmod = new JRadioButton("Moderate");
        nqmod.setBounds(125, 230, 75, 25);

        JRadioButton nqdiff = new JRadioButton("Difficult");
        nqdiff.setBounds(225, 230, 75, 25);

        nqbg.add(nqeasy);
        nqbg.add(nqmod);
        nqbg.add(nqdiff);

        JLabel sqslabel = new JLabel("Standard of Questions");
        sqslabel.setBounds(20, 265, 225, 25);

        ButtonGroup sqsbg = new ButtonGroup();

        JRadioButton sqseasy = new JRadioButton("Easy");
        sqseasy.setBounds(25, 290, 75, 25);

        JRadioButton sqsmod = new JRadioButton("Moderate");
        sqsmod.setBounds(125, 290, 75, 25);

        JRadioButton sqsdiff = new JRadioButton("Difficult");
        sqsdiff.setBounds(225, 290, 75, 25);

        sqsbg.add(sqseasy);
        sqsbg.add(sqsmod);
        sqsbg.add(sqsdiff);

        JLabel tsufflabel = new JLabel("Time Sufficient?");
        tsufflabel.setBounds(20, 325, 225, 25);

        ButtonGroup tsuffbg = new ButtonGroup();

        JRadioButton tsuffyes = new JRadioButton("Yes");
        tsuffyes.setBounds(25, 350, 75, 25);

        JRadioButton tsuffno = new JRadioButton("No");
        tsuffno.setBounds(125, 350, 75, 25);

        tsuffbg.add(tsuffyes);
        tsuffbg.add(tsuffno);

        JLabel cnamelabel = new JLabel("Course Name");
        cnamelabel.setBounds(20, 385, 225, 25);

        JTextField course_name = new JTextField();
        course_name.setBounds(20, 410, 225, 25);

        JButton submit = new JButton("Submit");
        submit.setBounds(20, 445, 75, 25);

        JButton display = new JButton("Display");
        display.setBounds(100, 445, 75, 25);

        JTextArea tares = new JTextArea();
        tares.setBounds(300, 20, 450, 450);
        tares.setEditable(false);
        tares.setLineWrap(true);

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String cc = course_code.getText();
                String cn = course_name.getText();
                String nqp = "";
                String sqs = "";
                boolean rd = false;
                boolean oof = false;
                boolean ts = false;

                if (dgyes.isSelected()) {
                    rd = true;
                } else if (dgno.isSelected()) {
                    rd = false;
                }

                if (osyes.isSelected()) {
                    oof = true;
                } else if (osno.isSelected()) {
                    oof = false;
                }

                if (nqeasy.isSelected()) {
                    nqp = "Easy";
                } else if (nqmod.isSelected()) {
                    nqp = "Moderate";
                } else if (nqdiff.isSelected()) {
                    nqp = "Difficult";
                }

                if (sqseasy.isSelected()) {
                    sqs = "Easy";
                } else if (sqsmod.isSelected()) {
                    sqs = "Moderate";
                } else if (sqsdiff.isSelected()) {
                    sqs = "Difficult";
                }

                if (tsuffyes.isSelected()) {
                    ts = true;
                } else if (tsuffno.isSelected()) {
                    ts = false;
                }

                Feedback f = new Feedback(cc, cn, nqp, sqs, rd, oof, ts);
                try {
                    fm.addFeedback(f);
                    tares.setText("Feedback Submitted");
                } catch (Exception e1) {
                    tares.setText(e1.getMessage());
                }
                course_code.setText("");
                course_name.setText("");
                dgbg.clearSelection();
                osbg.clearSelection();
                nqbg.clearSelection();
                sqsbg.clearSelection();
                tsuffbg.clearSelection();
            }
        });

        display.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tares.setText(fm.displayFeedback());
            }
        });

        f.add(cclabel);
        f.add(course_code);
        f.add(dglabel);
        f.add(dgno);
        f.add(dgyes);
        f.add(oslabel);
        f.add(osyes);
        f.add(osno);
        f.add(nqlabel);
        f.add(nqeasy);
        f.add(nqmod);
        f.add(nqdiff);
        f.add(sqslabel);
        f.add(sqseasy);
        f.add(sqsmod);
        f.add(sqsdiff);
        f.add(tsufflabel);
        f.add(tsuffyes);
        f.add(tsuffno);
        f.add(cnamelabel);
        f.add(course_name);
        f.add(submit);
        f.add(tares);
        f.add(display);

        f.setLayout(null);
        f.setSize(800,600);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]) {
        new ExamFeedback();
    }
}