import java.awt.*;
import java.awt.event.*;

public class AWTCForm extends Frame implements ActionListener {
  TextField name,email,msg;
  Label forname,foremail,formsg,response;
  Button send;
  AWTCForm() {
    name = new TextField();
    email = new TextField();
    msg = new TextField();
    forname = new Label();
    foremail = new Label();
    formsg = new Label();
    response = new Label();
    send = new Button("Send!");
    forname.setText("Name: ");
    foremail.setText("Email: ");
    formsg.setText("Message: ");
    forname.setBounds(20,30,200,20);
    name.setBounds(20,60,200,20);
    foremail.setBounds(20,90,200,20);
    email.setBounds(20,120,200,20);
    formsg.setBounds(20,150,200,20);
    msg.setBounds(20,180,200,20);
    send.setBounds(20,210,200,20);
    response.setBounds(20,240,200,20);
    send.addActionListener(this);
    add(forname);
    add(name);
    add(foremail);
    add(email);
    add(formsg);
    add(msg);
    add(send);
    add(response);
    setSize(300,300);
    setLayout(null);
    setVisible(true);
  }
  public void actionPerformed(ActionEvent e) {
    System.out.println("\""+name.getText()+"\"");
    if (name.getText().equals("")) {
      response.setText("Please enter your name!");
    } else if (email.getText().equals("")) {
      response.setText("Please enter your email!");
    } else if (msg.getText().equals("")) {
      response.setText("Please enter some message!");
    } else {
      response.setText("Form submitted successfully!");
    }
  }
  public static void main(String args[]) {
    new AWTCForm();
  }
}