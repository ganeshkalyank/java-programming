class String6 {
  static public void main(String args[]) {
    char ch[] = {'J','a','v','a',' ','P','r','o','g','r','a','m','m','i','n','g'};
    System.out.print("ch is:");
    System.out.println(ch);
    String s1 = new String(ch);
    System.out.println("s1 is "+s1);
    String s2 = "Java Programming";
    System.out.println("s2 is "+s2);
    String s3 = s1+s2;
    System.out.println("s3 is "+s3);
    System.out.println(s1.length());
    System.out.println(s2.length());
    System.out.println(s3.length());

    String year = "2022";
    String s4 = "This year is "+year+".";
    System.out.println(s4);
    // + operator can be used to concatenate strings
  }
}