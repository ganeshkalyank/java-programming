class A extends Thread {
  public void run() {
    System.out.println("In A");
  }
}

class B extends Thread {
  public void run() {
    System.out.println("In B");
  }
}

class C extends Thread {
  public void run() {
    System.out.println("In C");
  }
}

class MultiThreading {
  public static void main(String args[]) throws InterruptedException {
    A aobj = new A();
    B bobj = new B();
    C cobj = new C();
    Thread.sleep(5000);
    aobj.start();
    bobj.start();
    cobj.start();
  }
}