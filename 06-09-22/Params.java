import java.util.Scanner;

class Rectangle {
  int l,b;
  int circum;
  int compute(int x,int y) {
    l=x;b=y;
    circum = 2*(l+b);
    return circum;
  }
}

class Params {
  public static void main(String args[]) {
    // int l,b,circum;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter length, breadth: ");
    Rectangle rect = new Rectangle();
    // l=scan.nextInt();
    // b=scan.nextInt();
    // circum = rect.compute(l,b);
    System.out.println("Circumference: "+rect.compute(scan.nextInt(),scan.nextInt()));
  }
}