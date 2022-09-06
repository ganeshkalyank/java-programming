import java.io.*;
import java.util.Scanner;

public class Average {

  public static void main(String args[]) throws IOException {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter x: ");
    int x,y,z; float avg;
    x = scan.nextInt();
    System.out.println("Enter y: ");
    y = scan.nextInt();
    System.out.println("Enter z: ");
    z = scan.nextInt();
    avg = (x+y+z)/3.0f;
    System.out.println("Average: "+avg);
  }

}