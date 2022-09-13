class IntCheck {
  int n;
  boolean isPos() {
    if (n<0) return false;
    else return true;
  }
}

class Factorial extends IntCheck {
  int fact=1;
  void findFact() {
    if (isPos()) {
      if (n==0) fact=1;
      else { for (int j=1;j<=n;j++) { fact=fact*j; } }
      System.out.println("Factorial is "+fact);
    } else {
      System.out.println("n is -ve");
    }
  }
}

class FactorialEx {
  public static void main(String args[]) {
    IntCheck iobj = new IntCheck();
    iobj.n=5;
    if (iobj.isPos()) {
      System.out.println("n is non -ve");
    } else {
      System.out.println("n is -ve");
    }
    Factorial fobj = new Factorial();
    fobj.n=6;
    fobj.findFact();
  }
}