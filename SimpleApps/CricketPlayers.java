import java.util.*;
import java.awt.event.*;
import javax.swing.*;

class Person {
    String name;
    int match_count,user_id;
    static int id = 0;
    Person(String name, int match_count) {
        this.name = name;
        this.match_count = match_count;
        this.user_id = id++;
    }
}

class Batsman extends Person {
    int runs_scored, striking_rate;
    Batsman(String name, int match_count, int runs_scored) {
        super(name, match_count);
        this.runs_scored = runs_scored;
        this.striking_rate = runs_scored/match_count;
    }
}

class Bowler extends Person {
    int wickets_taken;
    Bowler(String name, int match_count, int wickets_taken) {
        super(name, match_count);
        this.wickets_taken = wickets_taken;
    }
}

class CricketPlayers {
    JFrame f;
    ArrayList<Batsman> batsmen;
    ArrayList<Bowler> bowlers;
    CricketPlayers() {
        f = new JFrame("Cricket Players");
        batsmen = new ArrayList<Batsman>();
        bowlers = new ArrayList<Bowler>();

        JLabel type = new JLabel("Type");
        type.setBounds(20, 20, 100, 25);
        f.add(type);

        ButtonGroup tbg = new ButtonGroup();

        JRadioButton batsman = new JRadioButton("Batsman");
        batsman.setBounds(20, 45, 100, 25);
        tbg.add(batsman);

        JRadioButton bowler = new JRadioButton("Bowler");
        bowler.setBounds(130, 45, 100, 25);
        tbg.add(bowler);

        f.add(batsman);
        f.add(bowler);

        JLabel name = new JLabel("Name");
        name.setBounds(20, 80, 200, 25);
        f.add(name);

        JTextField name_input = new JTextField();
        name_input.setBounds(20, 105, 200, 25);
        f.add(name_input);

        JLabel match_count = new JLabel("Match Count");
        match_count.setBounds(20, 140, 200, 25);
        f.add(match_count);

        JTextField match_count_input = new JTextField();
        match_count_input.setBounds(20, 165, 200, 25);
        f.add(match_count_input);

        JLabel runsorwicket = new JLabel("Runs Scored / Wicket Count");
        runsorwicket.setBounds(20, 200, 200, 25);
        f.add(runsorwicket);

        JTextField runsorwicket_input = new JTextField();
        runsorwicket_input.setBounds(20, 225, 200, 25);
        f.add(runsorwicket_input);

        JButton add = new JButton("Add");
        add.setBounds(20, 260, 200, 25);
        f.add(add);

        JLabel search_label = new JLabel("ID: ");
        search_label.setBounds(20, 310, 20, 25);
        f.add(search_label);

        JTextField search_input = new JTextField();
        search_input.setBounds(50, 310, 170, 25);
        f.add(search_input);
        
        JButton search = new JButton("Search");
        search.setBounds(20, 345, 90, 25);
        f.add(search);

        JButton topthree = new JButton("Top 3");
        topthree.setBounds(130, 345, 90, 25);
        f.add(topthree);

        JTextArea output = new JTextArea();
        output.setBounds(250, 20, 200, 300);
        output.setLineWrap(true);
        f.add(output);

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (name_input.getText().equals("") || match_count_input.getText().equals("") || runsorwicket_input.getText().equals("")) {
                    output.setText("One of the fields is empty");
                    return;
                }
                if (batsman.isSelected()) {
                    Batsman b = new Batsman(name_input.getText(), Integer.parseInt(match_count_input.getText()), Integer.parseInt(runsorwicket_input.getText()));
                    batsmen.add(b);
                    output.setText("Added Successfully with ID: " + b.user_id);
                    return;
                } else if (bowler.isSelected()) {
                    Bowler b = new Bowler(name_input.getText(), Integer.parseInt(match_count_input.getText()), Integer.parseInt(runsorwicket_input.getText()));
                    bowlers.add(b);
                    output.setText("Added Successfully with ID: " + b.user_id);
                    return;
                }
                output.setText("One of the fields is empty");
            }
        });

        search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (search_input.getText().equals("")) {
                    output.setText("ID field is empty");
                    return;
                }
                int id = Integer.parseInt(search_input.getText());
                for (Batsman b : batsmen) {
                    if (b.user_id == id) {
                        output.setText("Name: " + b.name + " Total Runs: " + b.runs_scored + " Striking Rate: " + b.striking_rate + "\n");
                        return;
                    }
                }
                for (Bowler b : bowlers) {
                    if (b.user_id == id) {
                        output.setText("Name: " + b.name + " Total Wickets: " + b.wickets_taken + "\n");
                        return;
                    }
                }
                output.setText("No player with ID: " + id);
            }
        });

        topthree.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (batsman.isSelected()) {
                    Collections.sort(batsmen, new Comparator<Batsman>() {
                        public int compare(Batsman b1, Batsman b2) {
                            return b2.striking_rate - b1.striking_rate;
                        }
                    });
                    output.setText("");
                    for (int i = 0; i < 3; i++) {
                        output.append("Name: " + batsmen.get(i).name + " Total Runs: " + batsmen.get(i).runs_scored + " Striking Rate: " + batsmen.get(i).striking_rate + "\n");
                    }
                    return;
                } else if (bowler.isSelected()) {
                    Collections.sort(bowlers, new Comparator<Bowler>() {
                        public int compare(Bowler b1, Bowler b2) {
                            return b2.wickets_taken - b1.wickets_taken;
                        }
                    });
                    output.setText("");
                    for (int i = 0; i < 3; i++) {
                        output.append("Name: " + bowlers.get(i).name + " Total Wickets: " + bowlers.get(i).wickets_taken + "\n");
                    }
                    return;
                }
                output.setText("One of the fields is empty");
            }
        });

        f.setSize(500, 450);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new CricketPlayers();
    }
}