import java.util.Scanner;

class Array {
  int arr[] = new int[5],elem;
  Scanner scan = new Scanner(System.in);
  void getData() {
    for (int i=0;i<5;i++) {
      System.out.println("Enter element "+(i+1)+" : ");
      arr[i]=scan.nextInt();
    }
  }
  void search() {
    System.out.println("Enter element to find: ");
    elem = scan.nextInt();
    for (int i=0;i<5;i++) {
      if (elem == arr[i]) {
        System.out.println("Element found at index: "+i);
        return;
      }
    }
    System.out.println("Element not found!");
  }
}

class ArrayEx {
  public static void main(String args[]) {
    Array arr = new Array();
    arr.getData();
    arr.search();
  }
}