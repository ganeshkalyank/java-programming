import java.util.Scanner;

class Circle {

  float rad,circ,ar;

  void getData() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter radius of circle: ");
    rad = scan.nextInt();
    scan.close();
  }

  void compute() {
    circ = 2.0f*3.14f*rad;
    ar = 3.14f*rad*rad;
  }

  void showData() {
    System.out.println("Circumference: "+circ);
    System.out.println("Area: "+ar);
  }

}

class CircleEx {

  public static void main(String args[]) {
    Circle c = new Circle();
    c.getData();
    c.compute();
    c.showData();
  }

}