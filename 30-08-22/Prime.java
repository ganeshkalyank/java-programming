import java.util.Scanner;

class Prime {

  static int isPrime(int n) {

    int i,flag=1;

    for (i=2;i<=n/2;i++) {

      if (n%i==0) flag=0;

    }

    return flag;

}

  public static void main(String args[]) {

    int i;

    for (i=2;i<Integer.parseInt(args[0]);i++) {
        if (isPrime(i)==1) System.out.println(i);
    }

  }

}