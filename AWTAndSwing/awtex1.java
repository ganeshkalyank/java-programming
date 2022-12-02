import java.awt.*; // Abstract Window Toolkit
class awtex1 extends Frame
{
    // define methods...   event handling code....
    // define variables...
    // to add controls into the Frame window       

    public static void main(String args[])
    {
           awtex1 obj = new awtex1();
           obj.setSize(500, 800);
           obj.setTitle("Frame window using AWT");
           obj.setVisible(true);
    }
}
