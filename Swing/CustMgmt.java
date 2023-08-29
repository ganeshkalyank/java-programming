import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;

class Customer {
  String CustomerName;
  int CustomerNumber;
  String City;
  String State;
  int Pincode;
  Customer() {}
  Customer(String name,int num,String city,String state,int pin) {
    this.CustomerName = name;
    this.CustomerNumber = num;
    this.City = city;
    this.State = state;
    this.Pincode = pin;
  }
}

class CustomerManagement {
  ArrayList<Customer> custlist;
  CustomerManagement() {
    custlist = new ArrayList<Customer>();
  }
  void addCustomer(Customer newcust) {
    custlist.add(newcust);
  }
  Customer searchCustomer(int custid) {
    for (int i=0;i<custlist.size();i++) {
      if (custlist.get(i).CustomerNumber == custid) {
        return custlist.get(i);
      }
    }
    // Iterator<Customer> itr = custlist.iterator();
    // while(itr.hasNext()) {
    //   if (itr.next().CustomerNumber == custid) {
    //     return itr.next();
    //   }
    // }
    return null;
  }
}

class CustMgmt {
  JFrame f = new JFrame();
  JFrame addcustf = new JFrame();
  JFrame custlistf = new JFrame();
  JFrame getcustf = new JFrame();
  CustMgmt() {

    CustomerManagement cm = new CustomerManagement();

    JButton addcust = new JButton("Add customer");
    addcust.setBounds(25, 25, 225, 25);

    JButton searchcust = new JButton("Search customer");
    searchcust.setBounds(25, 60, 225, 25);

    JButton dispcust = new JButton("Display customers");
    dispcust.setBounds(25,95,225,25);
    
    JLabel response = new JLabel();
    response.setBounds(25,130,225,25);

    addcust.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e) {
        addcustf.setVisible(true);
      }
    });

    searchcust.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e) {
        getcustf.setVisible(true);
      }
    });

    JLabel custnamelabel = new JLabel("Customer name: ");
    custnamelabel.setBounds(25, 25, 225, 30);
    JTextField custname = new JTextField();
    custname.setBounds(25, 55, 225, 30);

    JLabel custidlabel = new JLabel("Customer ID: ");
    custidlabel.setBounds(25, 95, 225, 30);
    JTextField custid = new JTextField();
    custid.setBounds(25,125,225,30);

    JLabel custcitylabel = new JLabel("Customer city: ");
    custcitylabel.setBounds(25, 165, 225, 30);
    JTextField custcity = new JTextField();
    custcity.setBounds(25,195,225,30);

    JLabel custstatelabel = new JLabel("Customer state: ");
    custstatelabel.setBounds(25, 235, 225, 30);
    JTextField custstate = new JTextField();
    custstate.setBounds(25,265,225,30);

    JLabel custpinlabel = new JLabel("Customer pincode: ");
    custpinlabel.setBounds(25, 305, 225, 30);
    JTextField custpin = new JTextField();
    custpin.setBounds(25,335,225,30);

    JButton addcustsbt = new JButton("Add customer");
    addcustsbt.setBounds(25,375,225,30);

    addcustsbt.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          Customer newcust = new Customer(custname.getText(),Integer.parseInt(custid.getText()),custcity.getText(),custstate.getText(),Integer.parseInt(custpin.getText()));
          cm.addCustomer(newcust);
          addcustf.setVisible(false);
          response.setText("Customer added successfully!");
        } catch (Exception exc) {
          addcustf.setVisible(false);
          response.setText("Error adding customer!");
        }
      }
    });

    JTable custlist = new JTable();
    custlist.setBounds(25,25,225,300);

    dispcust.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e) {

        DefaultTableModel dtm = new DefaultTableModel(0,0);
        String header[] = new String[] { "Name", "Number", "City", "State", "Pincode" };
        dtm.setColumnIdentifiers(header);

        for (int i=0;i<cm.custlist.size();i++) {
          dtm.addRow(new Object[] {
            cm.custlist.get(i).CustomerName,
            Integer.toString(cm.custlist.get(i).CustomerNumber),
            cm.custlist.get(i).City,
            cm.custlist.get(i).State,
            Integer.toString(cm.custlist.get(i).Pincode)
          });
        }

        custlist.setModel(dtm);
        custlistf.setVisible(true);
      }
    });

    JLabel custnolab = new JLabel("Customer number: ");
    custnolab.setBounds(25,25,225,30);

    JTextField custno = new JTextField();
    custno.setBounds(25, 55, 175, 30);

    JButton getcustbtn = new JButton("Get");
    getcustbtn.setBounds(210, 55, 60, 30);

    JLabel custdet = new JLabel();
    custdet.setBounds(25,95,175,200);

    getcustbtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          // System.out.println(custno.getText());
          Customer reqcust = cm.searchCustomer(Integer.parseInt(custno.getText()));
          custdet.setText("<html>Name: "+reqcust.CustomerName+"<br>City: "+reqcust.City+"<br>State: "+reqcust.State+"<br>PIN: "+reqcust.Pincode);
        } catch (Exception ex) {
          custdet.setText("There was an error!");
        }
      }
    });

    addcustf.add(custnamelabel);
    addcustf.add(custname);
    addcustf.add(custidlabel);
    addcustf.add(custid);
    addcustf.add(custcitylabel);
    addcustf.add(custcity);
    addcustf.add(custstatelabel);
    addcustf.add(custstate);
    addcustf.add(custpinlabel);
    addcustf.add(custpin);
    addcustf.add(addcustsbt);

    addcustf.setSize(300,500);
    addcustf.setLayout(null);
    addcustf.setVisible(false);
    addcustf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    custlistf.add(custlist);

    custlistf.setSize(300,300);
    custlistf.setLayout(null);
    custlistf.setVisible(false);
    custlistf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    getcustf.add(custnolab);
    getcustf.add(custno);
    getcustf.add(getcustbtn);
    getcustf.add(custdet);

    getcustf.setLayout(null);
    getcustf.setVisible(false);
    getcustf.setSize(300,300);

    f.add(addcust);
    f.add(searchcust);
    f.add(dispcust);
    f.add(response);

    f.setSize(300,200);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public static void main(String args[]) {
    new CustMgmt();
  }
}