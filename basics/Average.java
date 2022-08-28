import java.util.Scanner;

public class Average {
    public static void main(String args[]) {
        int x,y,z,avg;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        scanner.close();
        avg = (x+y+z)/3;
        System.out.println("Average: "+avg);
    }
}
