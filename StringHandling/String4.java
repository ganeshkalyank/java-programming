class String4 {
  public static void main(String args[]) {
    char ch[] = {'J','a','v','a',' ','P','r','o','g','r','a','m','m','i','n','g'};
    System.out.print("ch is: ");
    System.out.println(ch);
    String s1 = new String(ch,5,11);
    String s2 = new String(ch,0,4);
    System.out.println("s1 is "+s1);
    System.out.println("s2 is "+s2);
    String s3 = new String(ch);
    System.out.println("s3 is "+s3);
    String s4 = new String(s3);
    System.out.println("s4 is "+s4);

    System.out.println(s1.length());
    System.out.println(s2.length());
    System.out.println(s3.length());
    System.out.println(s4.length());

    System.out.println("Some random text".length());
  }
}