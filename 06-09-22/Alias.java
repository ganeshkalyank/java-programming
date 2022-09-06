import java.util.Scanner;

class Circle {
  float rad,area;
  void compute() {
    area = 3.14f*rad*rad;
  }
  void getData() {
    System.out.println("Enter radius: ");
    Scanner scan = new Scanner(System.in);
    rad = scan.nextInt();
  }
  void showData() {
    System.out.println("Area: "+area);
  }
}

public class Alias {
  public static void main(String args[]) {
    Circle circ = new Circle(),circ2;
    circ2 = circ;
    circ.getData();
    circ2.compute();
    circ.showData();
  }
}