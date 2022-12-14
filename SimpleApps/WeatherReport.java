import javax.swing.*;
import java.awt.event.*;

class WeatherReport {
  JFrame f;
  String days[] = {"1","2","3"};
  String months[] = {"1","2","3"};
  String years[] = {"1","2","3"};
  int mindata[][][] = new int[3][3][3];
  int maxdata[][][] = new int[3][3][3];
  WeatherReport() {
    f = new JFrame("Weather Report");
    JComboBox<String> day = new JComboBox<String>(days);
    JComboBox<String> month = new JComboBox<String>(months);
    JComboBox<String> year = new JComboBox<String>(years);
    JButton set = new JButton("Set"), get = new JButton("Get");
    JLabel maxtemplab = new JLabel("Max temp: ");
    JTextField maxtemp = new JTextField();
    JLabel mintemplab = new JLabel("Min temp: ");
    JTextField mintemp = new JTextField();
    JLabel resp = new JLabel();
    JTable data = new JTable();
    day.setBounds(30,30,50,25);
    month.setBounds(100,30,50,25);
    year.setBounds(170,30,50,25);
    set.setBounds(240,30,70,25);
    get.setBounds(330,30,70,25);
    maxtemplab.setBounds(30,75,100,25);
    maxtemp.setBounds(30, 95, 100, 25);
    mintemplab.setBounds(150, 75, 100, 25);
    mintemp.setBounds(150, 95, 100, 25);
    resp.setBounds(30,120,150,25);
    data.setBounds(30, 165, 200, 300);
    set.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          int minval,maxval;
          minval = Integer.parseInt(mintemp.getText());
          maxval = Integer.parseInt(maxtemp.getText());
          int dayval = day.getSelectedIndex();
          int monval = month.getSelectedIndex();
          int yrval = year.getSelectedIndex();
          mindata[yrval][monval][dayval] = minval;
          maxdata[yrval][monval][dayval] = maxval;
          resp.setText("Data set successfully!");
        } catch (Exception ex) {
          resp.setText("Temperatures invalid!");
        }
      }
    });
    get.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          int minval,maxval;
          int dayval = day.getSelectedIndex();
          int monval = month.getSelectedIndex();
          int yrval = year.getSelectedIndex();
          minval = mindata[yrval][monval][dayval];
          maxval = maxdata[yrval][monval][dayval];
          maxtemp.setText(Integer.toString(maxval)); mintemp.setText(Integer.toString(minval));
        } catch (Exception ex) {
          resp.setText("Invalid dates!");
        }
      }
    });
    f.add(day);f.add(month);f.add(year);f.add(set);f.add(get);
    f.add(maxtemplab);f.add(maxtemp);f.add(mintemplab);f.add(mintemp);f.add(resp);
    f.setLayout(null);
    f.setVisible(true);
    f.setSize(500,500);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public static void main(String args[]) {
    new WeatherReport();
  }
}