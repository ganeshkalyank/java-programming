class Time {
  int hrs,mins,secs;
  Time() {hrs=mins=secs=0;}
  Time(int a,int b,int c) {hrs=a;mins=b;secs=c;}
  Time addTime(Time s, Time t) {
    Time temp = new Time();
    temp.secs = (s.secs+t.secs)%60;
    temp.mins = (s.mins+t.mins+(s.secs+t.secs)/60)%60;
    temp.hrs = s.hrs+t.hrs+(s.mins+t.mins+(s.secs+t.secs)/60)/60;
    return temp;
  }
  void disp() {
    System.out.println(hrs+":"+mins+":"+secs);
  }
}

class TimeEx {
  static public void main(String args[]) {
    Time t1 = new Time(3,50,20);
    Time t2 = new Time(5,40,50);
    Time t3 = new Time();
    t3 = t3.addTime(t1,t2);
    t1.disp();t2.disp();t3.disp();
  }
}