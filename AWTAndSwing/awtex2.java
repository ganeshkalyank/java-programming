import java.awt.*;
import java.awt.event.*;
class awtex2 extends Frame
{
     Label l1, l2, l3;
     awtex2()
     {
          setLayout(new FlowLayout());
          l1 = new Label("C");
          l2 = new Label("C++");
          l3 = new Label("Java");
          // add labels ... to the Frame window
          add(l1); add(l2); add(l3);    

        addWindowListener(new WindowAdapter()
        {public void windowClosing(WindowEvent we)
            {
                  System.out.println("window is closed");
                  System.exit(0);          
            }
         });    
       } // end of constr.

       public void paint(Graphics g)  // Component class
         {
              g.drawString("Inside frame window", 600, 200);
         }

    static public void main(String args[])
    {
        awtex2 obj2 = new awtex2();
        obj2.setSize(new Dimension(500, 800));
        obj2.setTitle ("GUI with Labels");
        obj2.setVisible(true);
    }
}
