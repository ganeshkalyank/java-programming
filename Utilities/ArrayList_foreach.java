import java.util.ArrayList;

public class ArrayList_foreach {
  public static void main(String args[]) {
    ArrayList<String> l = new ArrayList<String>();
    l.add("Apple");
    l.add("Banana");
    l.add("Cherry");
    for (String fruit : l)
      System.out.println(fruit);
  }
}