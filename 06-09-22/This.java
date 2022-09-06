class Test {
  int a,b;
  void f(int a,int b) {a=a*5;b=b*10;}
  void g(int a,int b) {this.a=a*5;this.b=b*10;}
  void show() {System.out.println("a="+a+"; b="+b);} 
}

class This {
  public static void main(String args[]) {
    Test t = new Test();
    t.a=1;t.b=2;
    t.f(t.a,t.b);
    System.out.println("Without using this pointer: ");
    t.show();
    t.g(t.a,t.b);
    System.out.println("Using this pointer: ");
    t.show();
  }
}