class NestedTry {
  public static void main(String args[]) {
    int x[] = new int[10];
    try {
      int y = x[Integer.parseInt(args[0])];
      try {
        y/=Integer.parseInt(args[1]);
      } catch (ArithmeticException e) {
        System.out.println(e);
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e);
    }
    System.out.println("Out of nested try");
  }
}