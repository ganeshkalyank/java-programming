import java.util.Scanner;

class Time {
  int hrs,mins,secs;
  Time() {hrs=mins=secs=0;}
  Time(int a) {hrs=mins=secs=a;}
  Time(int a,int b,int c) {hrs=a;mins=b;secs=c;}
  void show() {
    System.out.println(hrs+":"+mins+":"+secs);
  }
}

class TimeEx {
  public static void main(String args[]) {
    Time t1,t2,t3;
    t1 = new Time();
    t2 = new Time(3);
    t3 = new Time(11,45,15);
    t1.show();
    t2.show();
    t3.show();
  }
}