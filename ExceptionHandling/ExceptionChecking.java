class Thrower {
  void method() throws IllegalAccessException {
    throw new IllegalAccessException("Custom illlegal access exception");
  }
}

class ExceptionChecking {
  public static void main(String args[]) {
    Thrower th = new Thrower();
    try {
      th.method();
    } catch (IllegalAccessException iae) {
      System.out.println(iae);
    }
  }
}