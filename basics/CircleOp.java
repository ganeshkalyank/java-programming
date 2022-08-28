import java.util.Scanner;

class Circle {

    float r,ar,cr;

    void getData() {
        System.out.println("Enter radius  of the circle: ");
        Scanner scan = new Scanner(System.in);
        r = scan.nextInt();
        scan.close();
    }

    void compute() {
        ar = 3.14f*r*r;
        cr = 2.0f*3.14f*r;
    }

    void showData() {
        System.out.println("Area: "+ar);
        System.out.println("Circumference: "+cr);
    }

}

class CircleOp {
 
    public static void main(String args[]) {
        Circle circ = new Circle();

        circ.getData();

        circ.compute();

        circ.showData();
    }
}
