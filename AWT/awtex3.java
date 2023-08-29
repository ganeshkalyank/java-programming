import java.awt.*;
import java.awt.event.*;
class awtex3 extends Frame implements ActionListener
{
       Button b1, b2, b3, b4;
       String  buttonMsg="";
       awtex3()
       {
             setLayout(new FlowLayout());
             b1 = new Button ("Add");
             b2 = new Button ("Subtract");
             b3 = new Button ("Multiply");
             b4 = new Button ("Divide");
             // add b1, b2, b3, b4 to the frame window...
           
           // b1.setBounds(100, 50, 50, 50); b2.setBounds(100, 100, 50, 50);
            //b3.setBounds(100, 150, 50, 50); b4.setBounds(100, 200, 50, 50);
               add(b1); add(b2); add(b3); add(b4);
             //addTypeListener()

             b1.addActionListener(this);
             b2.addActionListener(this);
             b3.addActionListener(this);
             b4.addActionListener(this);

             addWindowListener(new WindowAdapter()
             {
                   public void windowClosing(WindowEvent we)
                   {
                       System.exit(0);
                   }
             });
       } // end of constr.

       public void paint(Graphics g)
       {
          g.drawString(buttonMsg, 500, 200);
       }

       public void actionPerformed(ActionEvent ae)
       {
           String s = ae.getActionCommand();

           System.out.println(s+" button is pressed");
           if (s.equals("Add"))
           {
                 buttonMsg = "Pressed the Add button..";
                 b1.disable();
           }
           else if (s.equals("Subtract"))
                 buttonMsg = "Pressed the Subtract button..";
           else if (s.equals("Multiply"))
                 buttonMsg = "Pressed the Multiply button..";
           else
                  buttonMsg = "Pressed the Divide button..";
           repaint();  // refresh the frame window... calls paint() method
       }

       static public void main(String args[])
       { 
            awtex3 obj = new awtex3();
            obj.setSize(new Dimension(800, 800));
            obj.setTitle("Creating Buttons using AWT");
            obj.setVisible(true);
       } 

}
