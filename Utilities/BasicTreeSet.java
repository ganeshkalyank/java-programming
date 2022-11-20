import java.util.*;

class BasicTreeSet {
  public static void main(String args[]) {
    SortedSet<String> ts = new TreeSet<String>();
    String dummy = new String();
    Scanner scan = new Scanner(System.in);
    while (!dummy.equals("exit")) {
      System.out.println("Enter data: ");
      dummy = scan.nextLine();
      if (!dummy.equals("exit")) {
        ts.add(dummy);
      }
    }
    Iterator<String> itr = ts.iterator();
    while(itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}