import javax.swing.*;
import java.awt.event.*;

class MobilesList extends JFrame {
    JFrame f;
    String mobiles[][] = {
        {"Samsung","Realme","Poco"},
        {"M53","9 Pro+","M4 Pro"},
        {"20000","27000","16000"},
        {"2021","2022","2022"}
    };
    MobilesList() {
        f = new JFrame("Mobiles List");
        JComboBox dropdown = new JComboBox(mobiles[0]);
        JButton show = new JButton("Show");
        JLabel brand = new JLabel();
        JLabel model = new JLabel();
        JLabel cost = new JLabel();
        JLabel year = new JLabel();
        dropdown.setBounds(50,50,100,20);
        show.setBounds(170,50,70,20);
        show.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                int i = dropdown.getSelectedIndex();
                brand.setText("Brand: "+mobiles[0][i]);
                model.setText("Model: "+mobiles[1][i]);
                cost.setText("Cost: "+mobiles[2][i]);
                year.setText("Year: "+mobiles[3][i]);
            }
        });
        brand.setBounds(50,70,100,20);
        model.setBounds(50,90,100,20);
        cost.setBounds(50,110,100,20);
        year.setBounds(50,130,100,20);
        f.add(dropdown);
        f.add(show);
        f.add(brand);
        f.add(model);
        f.add(cost);
        f.add(year);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[]) {
        new MobilesList();
    }
}