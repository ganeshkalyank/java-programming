class MultiStCatch {
  public static void main(String args[]) {
    int y,l = args.length;
    try {
      if (l==0) {
        y=100/l;
        System.out.println("/ by 0");
      } else if (l==1) {
        int x[] = new int[5];
        x[10] = 15;
        System.out.println("Out of Bounds");
      }
    } catch (ArithmeticException e) {
      System.out.println(e);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e);
    }
  }
}