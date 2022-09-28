class TwoD {
  int compute(int s) {
    return s*s;
  }
  int compute(int a,int b) {
    return a*b;
  }
  float compute(float r) {
    return 3.14f*r*r;
  }
  float compute(float a,float b) {
    return 0.5f*a*b;
  }
}

class TwoDEx {
  public static void main(String args[]) {
    TwoD td = new TwoD();
    System.out.println("Area of square of side 4: "+td.compute(4));
    System.out.println("Area of rectangle of dimensions 2,3: "+td.compute(2,3));
    System.out.println("Area of circle of radius 5: "+td.compute(5.0f));
    System.out.println("Area of triangle of base 3 and height 4: "+td.compute(3.0f,4.0f));
  }
}