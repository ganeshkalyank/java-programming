import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Iteration {
  public static void main(String args[]) {
    HashSet<String> names = new HashSet<String>();
    names.add("Ganesh");
    names.add("Kalyan");
    Iterator it = names.iterator();
    while(it.hasNext())
      System.out.print(it.next()+" ");
  }
}