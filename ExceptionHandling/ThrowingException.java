class Thrower {
  void method() {
    try {
      throw new NullPointerException("Custom null pointer exception");
    } catch (NullPointerException ne) {
      System.out.println("Inside custom catch block");
      throw ne;
    }
  }
}

class ThrowingException {
  public static void main(String args[]) {
    Thrower th = new Thrower();
    try {
      th.method();
    } catch (NullPointerException ne) {
      System.out.println(ne);
    }
  }
}