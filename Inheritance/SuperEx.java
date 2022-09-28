class First {
  int a;
  First(int x) {a=x;}
}

class Second extends First {
  int b;
  Second(int x,int y) {
    super(x);b=y;
  }
}

class SuperEx {
  public static void main(String args[]) {
    Second s = new Second(1,2);
    System.out.println(s.a);
    System.out.println(s.b);
  }
}