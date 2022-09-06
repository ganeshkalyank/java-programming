import java.util.Scanner;

class Sigma {

  public static void main (String args[]) {

    int n,sum=0,dummy,i;

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter number of integers: ");
    n = scan.nextInt();

    System.out.println("Enter integers: ");
    for (i=0;i<n;i++) {
      dummy = scan.nextInt();
      sum += dummy;
    }

    System.out.println("Sum: "+sum);

  }

}