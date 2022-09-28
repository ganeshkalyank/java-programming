abstract class Base {
  int a;
  abstract void show();
}

class Extended extends Base {
  Extended() {}
  Extended(int x) {a = x;}
  void show() {
    System.out.println(a);
  }
}

class AbstractEx {
  public static void main(String args[]) {
    Base bref;
    bref = new Extended(5);
    bref.show();
  }
}