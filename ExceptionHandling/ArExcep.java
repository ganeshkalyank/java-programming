class ArExcep {
  public static void main(String args[]) {
    int i=0,x;
    try {
      x = 100/i;
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println("Out of try");
  }
}