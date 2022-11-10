class String9 {
  static public void main(String x[]) {
    char ch;
    String s1 = "String handling in java";
    ch = s1.charAt(5);
    System.out.println("String handling in Java".charAt(5));
    System.out.println(ch);
    int start=1,end =12;
    char temp[] = new char[end-start];
    s1.getChars(start,end,temp,0);
    System.out.println(temp);
  }
}