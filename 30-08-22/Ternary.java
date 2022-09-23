
import java.util.Scanner;

public class Ternary {

  public static void main(String args[]) {

    Scanner scan = new Scanner(System.in);
    int x,y,max,min;

    System.out.println("Enter x: ");
    x = scan.nextInt();

    System.out.println("Enter y: ");
    y = scan.nextInt();

    max = (x>y)?x:y;
    min = (x<y)?x:y;

    System.out.println("Max: "+max);
    System.out.println("Min: "+min);

    scan.close();
  }

}