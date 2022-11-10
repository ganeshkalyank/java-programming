class String13 {
  public static void main(String args[]) {
    String s1 = "equals() versus ==";
    String s2 = new String(s1);
    System.out.println(s1.equals(s2));

    System.out.println(s1==s2);
    System.out.println(s1==s1);
    System.out.println(s2==s2);
  }
}