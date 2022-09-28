interface Shape {
  double x = 1.5;
  void computeArea();
}

class Circle implements Shape {
  public void computeArea() {
    System.out.println("Area is "+3.14159*x*x);
  }
}

class Square implements Shape {
  public void computeArea() {
    System.out.println("Area is "+x*x);
  }
}

class Rectangle implements Shape {
  double b = 5.0;
  public void computeArea() {
    System.out.println("Area is "+b*x);
  }
}

class ShapeEx {
  public static void main(String args[]) {
    Shape sref;
    Circle cobj = new Circle();
    Square sobj = new Square();
    Rectangle robj = new Rectangle();
    sref = cobj; sref.computeArea();
    sref = sobj; sref.computeArea();
    sref = robj; sref.computeArea();
  }
}