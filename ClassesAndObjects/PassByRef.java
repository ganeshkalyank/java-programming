class PBRClass {
  int a,b;
  void f(PBRClass temp) {
    temp.a=temp.a+10;
    temp.b=temp.b-5;
  }
}

class PassByRef {
  public static void main(String args[]) {
    PBRClass p = new PBRClass();
    p.a=1; p.b=2;
    System.out.println("Before call: "+p.a+" "+p.b);
    p.f(p);
    System.out.println("After call: "+p.a+" "+p.b);
  }
}