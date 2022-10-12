class NewThread extends Thread {
  NewThread() {
    super("Custom thread by extending thread class");
    System.out.println("Child thread: "+this);
    start();
  }
  public void run() {
    try {
      for (int i=5;i>0;i--) {
        System.out.println("Child thread: "+i);
        Thread.sleep(500);
      }
    } catch (InterruptedException e) {
      System.out.println("Child thread interrupted");
    }
    System.out.println("Exiting child thread");
  }
}

class CustomThread {
  public static void main(String args[]) {
    new NewThread();
    try {
      for (int i=5;i>0;i--) {
        System.out.println("Main thread: "+i);
        Thread.sleep(2000);
      }
    } catch (InterruptedException e) {
      System.out.println("Main thread interrupted");
    }
    System.out.println("Exiting main thread...");
  }
}