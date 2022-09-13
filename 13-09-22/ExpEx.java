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
    fact = 1;
    if (isPos()) {
      if (n==0) fact=1;
      else { for (int j=1;j<=n;j++) { fact=fact*j; } }
      System.out.println("Factorial is "+fact);
    } else {
      System.out.println("n is -ve");
    }
  }
}

class Exp extends Factorial {
  int x; float val=0.0f;
  int pow(int a, int b) {
    if (b==0) return 1;
    int val=1;
    for (int i=0;i<b;i++) {
      val = val*a;
    }
    return val;
  }
  void calcExp() {
    for(int i=0;i<=10;i++) {
      n = i;
      findFact();
      val += pow(x,i)/(float)fact;
    }
    System.out.println("Exp of "+x+" is "+val);
  }
}

class ExpEx {
  public static void main(String args[]) {
    Exp e = new Exp();
    e.x = 5;
    e.calcExp();
  }
}