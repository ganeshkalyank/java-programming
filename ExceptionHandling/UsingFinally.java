
class Thrower {
  void method(int x, int y) {
    int z[] = new int[5];
    try {
      z[y] = 10/x; 
    } catch (ArithmeticException ae) {
      System.out.println(ae);
    } catch (ArrayIndexOutOfBoundsException aie) {
      System.out.println(aie);
    } finally {
      System.out.println("All exception caught (if any)");
    }
  }
}

class UsingFinally {
  public static void main(String args[]) {
    Thrower th = new Thrower();
    th.method(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
  }
}