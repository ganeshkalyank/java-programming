class A extends Thread {
  int sum = 0;
  public void run() {
    for (int i=0;i<=100;i+=10)
      System.out.println("i in A: "+i);
    compute();
    System.out.println("End of child thread in class A");
  }
  void compute() {
    for(int i=0;i<=100;i+=10) sum+=i;
    System.out.println("sum="+sum);
  }
}

class B extends Thread {
  public void run() {
    for (int j=1000;j<=2000;j+=100) System.out.println("j in B: "+j);
    System.out.println("End of child thread in class B");
  }
}

class C extends Thread {
  public void run() {
    for (int k=7000;k<=10000;k+=1000) System.out.println("k in C: "+k);
    System.out.println("End of child thread in class C");
  }
}

class MTSum {
  public static void main(String args[]) throws InterruptedException {
    A a = new A();
    B b = new B();
    C c = new C();
    Thread.sleep(1000);
    a.start();
    b.start();
    Thread.sleep(5000);
    c.start();
    System.out.println("End of main thread");
  }
}