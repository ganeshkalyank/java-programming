class PBVClass {
  int a,b;
  void f(int a, int b) {
    a=a+10;
    b=b-5;
  }
}

class PassByVal {
  public static void main(String args[]) {
    PBVClass p = new PBVClass();
    int a=1,b=2;
    System.out.println("Before call: "+a+" "+b);
    p.f(a,b);
    System.out.println("After call: "+a+" "+b);
  }
}