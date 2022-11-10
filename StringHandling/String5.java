class String5 {
  static public void main(String args[]) {
    char ch[] = {'J','a','v','a',' ','P','r','o','g','r','a','m','m','i','n','g'};
    System.out.print("ch is: ");
    System.out.println(ch);
    String s1 = new String(ch);
    System.out.println("s1 is"+s1);
    String s2 = ("Java Programming");
    System.out.println("s2 is "+s2);
    System.out.println(s1.length());
    System.out.println(s2.length());
    System.out.println("Java Programming".length());
    System.out.println(ch.length);
  }
}