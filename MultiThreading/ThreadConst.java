class NewThread extends Thread {
  public void run() {
    try {
      for (int i=0;i<=100;i+=10) {
        System.out.println("Child Thread: "+i);
        Thread.sleep(5000);
      }
    } catch (InterruptedException e) {
      System.out.println("Child interrupted");
    }
    System.out.println("Exiting child thread...");
  }
}

class ThreadConst {
  public static void main(String args[]) {
    NewThread nt = new NewThread();
    Thread t = new Thread(nt,"custom thread by extending thread class");
    System.out.println("Child thread: "+t);
    t.start();
    try {
      for (int i=0;i<=100;i+=10) {
        System.out.println("Main Thread: "+i);
        Thread.sleep(10000);
      }
    } catch (InterruptedException e) {
      System.out.println("Main thread is interrupted");
    }
    System.out.println("Main thread is exiting...");
  }
}