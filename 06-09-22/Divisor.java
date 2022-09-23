import java.util.Scanner;

class DivisorClass {
  int num;
  void compute() {
    int i;
    for (i=1;i<=num;i++) {
      if (num%i==0) {
        System.out.println(i);
      }
    }
  }
  void getData() {
    System.out.println("Enter a num: ");
    Scanner scan = new Scanner(System.in);
    num = scan.nextInt();
    scan.close();
  }
}

class Divisor {
  public static void main(String args[]) {
    DivisorClass d = new DivisorClass();
    d.getData();
    d.compute();
  }
}