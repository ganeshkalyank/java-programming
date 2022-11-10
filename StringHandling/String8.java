class Rectangle {
  int l,b;
  Rectangle(int x,int y) {l=x;b=y;}
  public String toString() { return "Length: "+l+" Breadth: "+b; }
}

class String8 {
  public static void main(String args[]) {
    Rectangle r = new Rectangle(100,80);
    System.out.println(r);
    String s1 = "Rectangle r: "+r;
    System.out.println(s1);
  }
}