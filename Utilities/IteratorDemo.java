import java.util.*;

class IteratorDemo {
  public static void main(String args[]) {
    LinkedList<String> ll = new LinkedList<String>();
    ll.add("Hello ");
    ll.add("there! ");
    ll.add("Well, That's ");
    ll.add("a name ");
    ll.add("I haven't heard ");
    ll.add("in a long while. ");
    Iterator <String> itr = ll.iterator();
    while (itr.hasNext()) {
      System.out.print(itr.next());
    }
  }
}