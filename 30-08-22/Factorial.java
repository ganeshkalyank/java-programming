import java.util.Scanner;

public class Factorial {

  static long fact(long n) {
    if (n==0 || n==1) return 1;
    return n*fact(n-1);
  }

  public static void main(String args[]) {

    long n,factval;
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a number: ");
    n = scan.nextLong();
    factval = fact(n);

    System.out.println("Factorial of "+n+" is "+factval);
    scan.close();
    
  }

}