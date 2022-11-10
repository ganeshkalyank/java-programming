import java.util.ArrayList;

public class ArrayList_Basics {
  public static void main(String args[]) {
    ArrayList<String> l = new ArrayList<String>();
    l.add("Ganesh");
    l.add("Kalyan");
    for(int i=0;i<l.size();i++)
      System.out.print(l.get(i)+" ");
    System.out.println();
    l.add("Kommisetti");
    for(int i=0;i<l.size();i++)
      System.out.print(l.get(i)+" ");
    System.out.println();
    l.set(2,"K");
    for(int i=0;i<l.size();i++)
      System.out.print(l.get(i)+" ");
    System.out.println();
    l.remove(2);
    for(int i=0;i<l.size();i++)
      System.out.print(l.get(i)+" ");
    System.out.println();
    l.clear();
    for(int i=0;i<l.size();i++)
      System.out.print(l.get(i)+" ");
    System.out.println();
  }
}