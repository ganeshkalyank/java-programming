class Shape {
  int area,circ;
}

class Square extends Shape {
  int s;
  Square(int s) {this.s = s;}
  void calcProps() {
    super.area = s*s;
    super.circ = 4*s;
  }
}

class Rectangle extends Shape {
  int l,b;
  Rectangle(int l,int b){this.l=l;this.b=b;}
  void calcProps() {
    super.area = l*b;
    super.circ = 2*(l+b);
  }
}

class ExecAr {
  public static void main(String args[]) {
    Square s = new Square(4);
    Rectangle r = new Rectangle(2,3);
    s.calcProps();r.calcProps();
    System.out.println("Area of square: "+s.area);
    System.out.println("Circumference of square: "+s.circ);
    System.out.println("Area of rectangle: "+r.area);
    System.out.println("Circumference of rectangle: "+r.circ);
  }
}