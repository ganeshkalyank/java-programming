class NotEligibleException extends Exception {
  int x;
  NotEligibleException(int a) {x=a;}
  public String toString() {
    return x+" is not an eligible mark";
  }
}

class Admit {
  int mark;
  Admit(int a) {mark=a;}
  void proceed() throws NotEligibleException {
    if (mark<50) throw new NotEligibleException(mark);
    else System.out.println("Admitted!");
  }
}

class UserDefinedException {
  public static void main(String args[]) {
    Admit a1 = new Admit(75);
    Admit a2 = new Admit(36);
    try {
      a1.proceed();
    } catch (NotEligibleException e) {
      System.out.println(e);
    }
    try {
      a2.proceed();
    } catch (NotEligibleException e) {
      System.out.println(e);
    }
  }
}