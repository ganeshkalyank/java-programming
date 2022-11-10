import java.util.HashSet;

public class HashSet_ForEach {
  public static void main(String args[]) {
    HashSet<String> hs = new HashSet<String>();
    hs.add("Anakin");
    hs.add("Obi Wan");
    hs.add("Luke");
    hs.add("Leia");
    hs.add("Organa");
    for (String name : hs)
      System.out.println(name);
    System.out.println(hs);
  }
}