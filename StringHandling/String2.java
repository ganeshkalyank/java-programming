class String2 {
  static public void main(String args[]) {
    byte b[] = {97,98,99,100,101,102,103,104,105};
    String s1 = new String(b);
    System.out.println(s1);
    String s2 = new String(b,3,5);
    System.out.println(s2);
  }
}