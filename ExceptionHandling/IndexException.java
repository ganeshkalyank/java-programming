class IndexException {
  public static void main(String args[]) {
    int arr[] = new int[5];
    try {
      int x = arr[10];
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println("Out of try");
  }
}