import java.util.HashSet;
import java.util.ArrayList;

public class HashSet_Basics {
  public static void main(String args[]) {
    HashSet<ArrayList> hs = new HashSet<ArrayList>();
    ArrayList<Integer> l1 = new ArrayList<Integer>();
    ArrayList<Integer> l2 = new ArrayList<Integer>();
    l1.add(1);
    l1.add(2);
    l2.add(1);
    l2.add(2);
    hs.add(l1);
    hs.add(l2);
    System.out.println(hs.size());
    System.out.println(hs);
  }
}