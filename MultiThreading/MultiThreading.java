
class A extends Thread {
  public void run() {
    System.out.println("In class A");
  }
}

class B extends Thread {
  public void run() {
    System.out.println("In class B");
  }
}

class C extends Thread {
  public void run() {
    System.out.println("In class C");
  }
}

class MultiThreading {
  public static void main(String args[]) {
    A aobj = new A();
    B bobj = new B();
    C cobj = new C();
    aobj.start();
    bobj.start();
    cobj.start();
  }
}