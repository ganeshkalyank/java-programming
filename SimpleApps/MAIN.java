import javax.swing.*;
import javax.swing.plaf.synth.SynthSeparatorUI;

import java.awt.Color;
import java.awt.event.*;
import java.util.*;

class feedback
{
    String name,course,all_datas_given,Out_of_syllabus,standard,time,nature;
    feedback(String n,String c, String d, String o,String s,String t,String nat)
    {
        name=n;
        course=c;
        all_datas_given=d;
        Out_of_syllabus=o;
        standard=s;
        time=t;
        nature=nat;        
    }
}

class GUI implements ActionListener
{
    String standarr[]={"Good","Medium","Low"};
    String suffarr[]= {"Sufficient","Insufficient"};
    String tougharr[]={"Tough","Normal","Easy"};

    ArrayList<feedback> al= new ArrayList<feedback>();
    JFrame window= new JFrame("feedback");

    JLabel nameL= new JLabel("Enter Name:");
    JTextField nameT= new JTextField();

    JLabel courseL= new JLabel("Enter Course:");
    JTextField courseT= new JTextField();

    JLabel dataL= new JLabel("Were all datas given in the questions?");
    JRadioButton rad1 = new JRadioButton("Yes");
    JRadioButton rad2= new JRadioButton("No");
    ButtonGroup grp1 = new ButtonGroup();

    JLabel outL= new JLabel("Were questions out of syllabus?");
    JRadioButton rad3= new JRadioButton("Yes");
    JRadioButton rad4 = new JRadioButton("No");
    ButtonGroup grp2= new ButtonGroup();

    JLabel standardL= new JLabel("Standard of question paper:");
    JList<String> stanList= new JList<String>(standarr);

    JLabel timeL= new JLabel("Is time alloted sufficient?");
    JList<String> timelist= new JList<String>(suffarr);

    JLabel natureL= new JLabel("How was the question paper");
    JList<String> natLst= new JList<String>(tougharr);

    JButton addButton= new JButton("Add");
    JButton displayButton= new JButton("Display");

    JTextArea ta= new JTextArea();
    


    GUI()
    {
        window.setSize(1000,1000);
        window.setLayout(null);
        window.setVisible(true);
        //window.getContentPane().setBackground(Color.darkGray);

        window.add(nameL);
        nameL.setBounds(10,10,100,40);
        window.add(nameT);
        nameT.setBounds(10,50,150,40);

        window.add(courseL);
        courseL.setBounds(175,10,100,40);
        window.add(courseT);
        courseT.setBounds(175,50,150,40);

        window.add(dataL);
        dataL.setBounds(50,150,250,40);
        window.add(rad1);
        rad1.setBounds(50,180,60,40);
        window.add(rad2);
        rad2.setBounds(50,210,60,40);
        grp1.add(rad1);
        grp1.add(rad2);

        window.add(outL);
        outL.setBounds(350,150,250,40);
        window.add(rad3);
        rad3.setBounds(350,180,250,40);
        window.add(rad4);
        rad4.setBounds(350,210,250,40);
        grp2.add(rad3);
        grp2.add(rad4);

        window.add(standardL);
        standardL.setBounds(350,10,200,40);
        window.add(stanList);
        stanList.setBounds(350,40,100,70);


        window.add(timeL);
        timeL.setBounds(550,10,200,40);
        window.add(timelist);
        timelist.setBounds(550,40,100,50);

        window.add(natureL);
        natureL.setBounds(720,10,200,40);
        window.add(natLst);
        natLst.setBounds(720,40,100,70);

        window.add(addButton);
        addButton.setBounds(600,150,100,40);
        window.add(displayButton);
        displayButton.setBounds(600,200,100,40);

        addButton.addActionListener(this);
        displayButton.addActionListener(this);

        window.add(ta);
        ta.setBounds(10,400,800,500);
    }
    public void actionPerformed(ActionEvent ex)
    {
        if(ex.getSource()==addButton)
        {
            String newname="";
            String newcourse="";
            String newStan="";
            String newtough="";
            String newtime="";
            String newdata="";
            String newout="";
            int flag=0;
            try
            {
                newname= nameT.getText();
                newcourse= courseT.getText();
                newStan=standarr[stanList.getSelectedIndex()];
                newtough= tougharr[natLst.getSelectedIndex()];
                newtime= suffarr[timelist.getSelectedIndex()];
                if(rad1.isSelected())
                {
                    newdata="Yes";
                    flag=1;
                }
                if(rad2.isSelected())
                {
                    newdata="No";
                    flag=1;
                }

                if(rad3.isSelected())
                {
                    newout="Yes";
                    flag=1;
                }
                if(rad4.isSelected())
                {
                    newout="No";
                    flag=1;
                }
                
                
            }
            catch(Exception e)
            {
                try
                {
                    throw new Exception("Enter all the detials");
                }
                catch(Exception e1)
                {
                    System.out.println(e1);
                }
            }
            if(flag==1)
            {
                al.add(new feedback(newname, newcourse,newdata,newout,newStan, newtough, newtime));
                nameT.setText("");
                courseT.setText("");
                natLst.clearSelection();
                timelist.clearSelection();
                stanList.clearSelection();
                grp1.clearSelection();
                grp2.clearSelection();
            }
        }
        if(ex.getSource()==displayButton)
        {
            System.out.println(al);
            ta.setText("NAME\tCOURSE\tDATAS GIVEN?\tOUT OF SYLLABUS\tStandard\tNATURE\tTIME\n");
            for(int i=0;i<al.size();i++)
            {
            
                String text= al.get(i).name+ "\t" + al.get(i).course+ "\t" + al.get(i).all_datas_given+"\t" +al.get(i).Out_of_syllabus+"\t\t" + al.get(i).standard +"\t" +al.get(i).nature+"\t" +al.get(i).time; 
                ta.append(text+"\n");
            }
        }
    }
}

class MAIN
{
    public static void main(String[] args) 
    {
         new GUI();
    }
}