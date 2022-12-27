import java.util.*;
import javax.swing.*;
import java.awt.event.*;

class citizenOfIndia {
  int aadharCardNo,scheme1Score,scheme2Score,scheme3Score;
  citizenOfIndia(int aadharCardNo) {
    this.aadharCardNo = aadharCardNo;
    scheme1Score = scheme2Score = scheme3Score = 0;
  }
}

class SurveyOfIndia {
  ArrayList<citizenOfIndia> clist = new ArrayList<citizenOfIndia>();
  void schemeScore(citizenOfIndia coi, String schemeName1, String schemeName2, String schemeName3) {
    if (schemeName1.equals("Self-Reliant"))
      coi.scheme1Score = 1;
    if (schemeName2.equals("Digital Empowerment"))
      coi.scheme2Score = 1;
    if (schemeName3.equals("Energy Efficient Scheme"))
      coi.scheme3Score = 1;
    clist.add(coi);
  }
  int aggregateScore(int scheme) {
    int totalScore = 0;
    for (int i=0;i<clist.size();i++) {
      if (scheme == 1 && clist.get(i).scheme1Score == 1) {
        totalScore++;
      }
      if (scheme == 2 && clist.get(i).scheme2Score == 1) {
        totalScore++;
      }
      if (scheme == 3 && clist.get(i).scheme3Score == 1) {
        totalScore++;
      }
    }
    return totalScore;
  }
}

class SchemeSurvey {
  JFrame f;
  SurveyOfIndia soi;
  SchemeSurvey() {
    f = new JFrame("Scheme Survey");
    soi = new SurveyOfIndia();

    JLabel aadharlabel = new JLabel("Aadhar Card No: ");
    aadharlabel.setBounds(20,20,300,30);
    f.add(aadharlabel);

    JTextField aadharno = new JTextField();
    aadharno.setBounds(20,50,300,30);
    f.add(aadharno);

    String schemeList[] = {"Self-Reliant","Digital Empowerment","Energy Efficient Scheme"};

    JLabel aathmanirb = new JLabel("Aathmanirbhar");
    aathmanirb.setBounds(20,90,300,30);
    f.add(aathmanirb);

    JComboBox<String> aathmanirbin = new JComboBox<String>(schemeList);
    aathmanirbin.setBounds(20,120,300,30);
    f.add(aathmanirbin);

    JLabel digind = new JLabel("Digital India");
    digind.setBounds(20,160,300,30);
    f.add(digind);

    JComboBox<String> digindin = new JComboBox<String>(schemeList);
    digindin.setBounds(20,190,300,30);
    f.add(digindin);

    JLabel ujyoj = new JLabel("Ujala Yojana");
    ujyoj.setBounds(20,230,300,30);
    f.add(ujyoj);

    JComboBox<String> ujyojin = new JComboBox<String>(schemeList);
    ujyojin.setBounds(20,260,300,30);
    f.add(ujyojin);

    JButton submit = new JButton("Submit");
    submit.setBounds(20,300,300,30);
    f.add(submit);

    JLabel resp = new JLabel();
    resp.setBounds(20,340,300,30);
    f.add(resp);

    JTextArea dets = new JTextArea();
    dets.setBounds(20,380,300,90);
    f.add(dets);

    submit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          citizenOfIndia newcit = new citizenOfIndia(Integer.parseInt(aadharno.getText()));
          soi.schemeScore(newcit,aathmanirbin.getSelectedItem().toString(),digindin.getSelectedItem().toString(),ujyojin.getSelectedItem().toString());
          resp.setText("Submitted Successfully!"); 
        } catch(Exception ex) {
          resp.setText("There was an error: "+ex.getMessage());
        }
        String resu = "";
        resu = "Aathmanirbar: "+soi.aggregateScore(1) + "\nDigital India: " + soi.aggregateScore(2) + "\nUjala Yojana: " + soi.aggregateScore(3);
        dets.setText(resu);
      }
    });

    f.setSize(360,550);
    f.setLayout(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
  public static void main(String args[]) {
    new SchemeSurvey();
  }
}