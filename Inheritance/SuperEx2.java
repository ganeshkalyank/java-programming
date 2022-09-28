class Sample {
  int a=1,b=2;
  void f() {System.out.println("Inside sample f()");}
  void g() {System.out.println("Inside sample g()");}
  void h() {System.out.println("Inside sample h()");}
}

class Extended extends Sample {
  int a=5;
  void f() {
    System.out.println("Inside extended f()");
    super.f();
  }
  void g() { super.g(); }
  void h(int c) {
    System.out.println(c); h();
    System.out.println("a="+a+" b="+b);
    System.out.println("a in super class is: "+super.a);
  }
}

class SuperEx2 {
  public static void main(String args[]) {
    Sample s = new Sample();
    System.out.println(s.a+" "+s.b);
    s.f();s.g();s.h();
    Extended e = new Extended();
    e.f(); e.g(); e.h(3);
  }
}