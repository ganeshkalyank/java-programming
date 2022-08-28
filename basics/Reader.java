import java.io.*;

public class Reader {
    public static void main(String args[]) throws IOException {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter x, y, z: ");
        int x,y,z;
        float avg;
        x = Integer.parseInt(bobj.readLine());
        y = Integer.parseInt(bobj.readLine());
        z = Integer.parseInt(bobj.readLine());
        avg = (x+y+z)/3.0f;
        System.out.println("Average: "+avg);
    }
}
