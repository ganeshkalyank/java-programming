import tstpkg.*;

public class PackageEx {
  public static void main(String args[]) {
    Adder a = new Adder();
    Subtractor s = new Subtractor();
    Displayer d = new Displayer();
    d.show(a.add(5,6));
    d.show(s.subtract(7,3));
  }
}