import java.util.Scanner;

class MaxMin {

  public static void main(String args[]) {

    int x,y,z,max,min;

    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter x: ");
    x = scan.nextInt();

    System.out.println("Enter y: ");
    y = scan.nextInt();

    System.out.println("Enter z: ");
    z = scan.nextInt();

    if (x>y) {
      if (x>z) {
        max=x;
      } else {
        max=z;
      }
    } else {
      if (y>z) {
        max=y;
      } else {
        max=z;
      }
    }
    if (x<y) {
      if (x<z) {
        min=x;
      } else {
        min=z;
      }
    } else {
      if (y<z) {
        min=y;
      } else {
        min=z;
      }
    }

    System.out.println("Max: "+max);
    System.out.println("Min: "+min);

  }

}