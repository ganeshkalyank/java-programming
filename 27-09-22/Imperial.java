class Unit {
  double feet,inches;
  Unit() { feet=0.0;inches=0.0; }
  void add(Unit u1, Unit u2) {
    feet = u1.feet+u2.feet;
    inches = u1.inches+u2.inches;
    if(inches>=12) {
      inches-=12;
      feet+=1;
    }
  }
  void display() {
    System.out.println(feet+"'"+inches+"\"");
  }
}

class Imperial {
  public static void main(String args[]) {
    Unit uobj1 = new Unit(), uobj2 = new Unit(), uobj3 = new Unit();
    uobj1.feet = 6;uobj1.inches = 3;
    uobj2.feet = 4;uobj2.inches = 4;
    uobj1.display();
    uobj2.display();
    uobj3.add(uobj1,uobj2);
    uobj3.display();
  }
}