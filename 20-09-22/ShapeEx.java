abstract class Shape {
  double a; String s;
  Shape() {}
  Shape(double x,String t) { a=x;s=t; }
  abstract void computeVolume();
  void disp() {
    System.out.println("Volume of "+s+" is ");
  }
}

class Cube extends Shape {
  Cube() {}
  Cube (double a, String t) { super(a,t); }
  void computeVolume() { disp();System.out.print(a*a*a); }
}

class Cuboid extends Shape {
  double b,c;
  Cuboid() {}
  Cuboid(double a,double x,double y,String t) { super(a,t);b=x;c=y; }
  void computeVolume() { disp();System.out.print(a*b*c); }
}

class Cylinder extends Shape {
  double b;
  Cylinder() {}
  Cylinder(double a, double b, String t) { super(a,t); this.b=b;}
  void computeVolume() { disp();System.out.print(3.14159*a*a*b); }
}

class Cone extends Shape {
  double b;
  Cone() {}
  Cone(double a, double b, String t) { super(a,t); this.b=b;}
  void computeVolume() { disp();System.out.print(0.33333*3.14159*a*a*b); }
}

class Sphere extends Shape {
  Sphere() {}
  Sphere(double a,String t) {super(a,t);}
  void computeVolume() { disp();System.out.print(1.33333*3.14159*a*a*a); }
}

class Hemisphere extends Shape {
  Hemisphere() {}
  Hemisphere(double a,String t) {super(a,t);}
  void computeVolume() { disp();System.out.print(0.66666*3.14159*a*a*a); }
}

class ShapeEx {
  static public void main(String args[]) {
    Shape sref;
    Cube cobj = new Cube(2.5,"cube");
    Cuboid cuobj = new Cuboid(1.2,2.3,3.5,"cuboid");
    Cylinder cyobj = new Cylinder(1.2,2.3,"cylinder");
    Cone coobj = new Cone(1.2,2.3,"cone");
    Sphere sobj = new Sphere(1.2,"sphere");
    Hemisphere hobj = new Hemisphere(1.2,"hemisphere");
    sref = cobj;
    sref.computeVolume();
    System.out.println();
    sref = cuobj;
    sref.computeVolume();
    System.out.println();
    sref = cyobj;
    sref.computeVolume();
    System.out.println();
    sref = coobj;
    sref.computeVolume();
    System.out.println();
    sref = sobj;
    sref.computeVolume();
    System.out.println();
    sref = hobj;
    sref.computeVolume();
    System.out.println();
  }
}