import java.awt.*;

public class AWTExample1 extends Frame {

  AWTExample1() {
    Button b = new Button("Click me!");
    b.setBounds(30,100,80,30);
    add(b);
    setSize(300,300);
    setTitle("Basic AWT Example");
    setLayout(null);
    setVisible(true);
  }

  public static void main(String args[]) {
    AWTExample1 f = new AWTExample1();
  }

}