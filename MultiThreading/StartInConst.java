class NewThread implements Runnable {
  String name;
  NewThread(String s) {
    name = s;
    Thread t = new Thread(this,name);
    System.out.println("Child thread: "+t);
    t.start();
  }
  public void run() {
    try {
      for (int i=5;i>0;i--) {
        System.out.println("Child thread: "+name+i);
        Thread.sleep(2000);
      }
    } catch (InterruptedException e) {
      System.out.println("Child interrupted");
    }
    System.out.println("Exiting child thread...");
  }
}

class StartInConst {
  public static void main(String args[]) {
    new NewThread("one");
    new NewThread("two");
    new NewThread("three");
    try {
      for (int i=5;i>0;i--) {
        System.out.println("Main thread: "+i);
        Thread.sleep(3500);
      }
    } catch (InterruptedException e) {
        System.out.println("Main thread interrupted");
    }
    System.out.println("Main thread exiting...");
  }
}