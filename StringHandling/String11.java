class String11 {
  static public void main(String args[]) {
    String s1 = "Java Programming";
    String s2 = "JAVA Programming";
    String s3 = "Java Programming - String Handling";
    String s4 = "Java Programming";
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    System.out.println(s1.equals(s4));
    System.out.println(s1.equalsIgnoreCase(s2));
    System.out.println(s1.equalsIgnoreCase(s3));
    System.out.println(s1.equalsIgnoreCase(s4));
  }
}