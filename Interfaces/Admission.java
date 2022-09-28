import java.util.Scanner;

abstract class University {
  int i;
  String name;
  String depts[] = new String[5];
  int max[] = new int[5];
  University(String n, String d[], int m[]) { name = n; depts=d; max = m; }
  abstract void display();
}

class SoC extends University {
  SoC() {
    super("Sastra",new String[]{"CSE","IT","ICT"},new int[]{30,30,30});
  }
  void display() {
    System.out.println(name+"University");
    System.out.println("Departments(Seats): ");
    for (i=0;i<3;i++) {
      System.out.println(depts[i]+"("+max[i]+")");
    }
  }
}

class SEEE extends University {
  SEEE() {
    super("Sastra",new String[]{"ECE","EEE","EIE"},new int[]{30,30,30});
  }
  void display() {
    System.out.println(name+"University");
    System.out.println("Departments(Seats): ");
    for (i=0;i<3;i++) {
      System.out.println(depts[i]+"("+max[i]+")");
    }
  }
}

class Student {
  int stuid;
  String sname;
  double mark;
  University school;
  void getData() {
    System.out.println("Enter student id: ");
    Scanner scan = new Scanner(System.in);
    stuid = scan.nextInt();
    scan.nextLine();
    System.out.println("Enter name: ");
    sname = scan.nextLine();
    System.out.println("Enter mark: ");
    mark = scan.nextDouble();
  }
}

class Admission {
  public static void main(String args[]) {
    int i;
    Student stu[] = new Student[5];
    for (i=0;i<5;i++) {
      stu[i] = new Student();
    }
    SoC socobj = new SoC(); SEEE seeeobj = new SEEE();
    for (i=0;i<5;i++) {
      stu[i].getData();
      if (stu[i].mark>=9.0) {
        stu[i].school = socobj;
        socobj.max[0]--;
        System.out.println("Admitted in CSE");
      } else if (stu[i].mark>=8.5) {
        stu[i].school = socobj;
        socobj.max[1]--;
        System.out.println("Admitted in IT");
      } else if (stu[i].mark>=8.0) {
        stu[i].school = seeeobj;
        seeeobj.max[0]--;
        System.out.println("Admitted in ECE");
      } else if (stu[i].mark>=7.5) {
        stu[i].school = socobj;
        socobj.max[2]--;
        System.out.println("Admitted in ICT");
      } else if (stu[i].mark>=7.0) {
        stu[i].school = seeeobj;
        socobj.max[1]--;
        System.out.println("Admitted in EEE");
      } else if (stu[i].mark>=6.0) {
        stu[i].school = seeeobj;
        socobj.max[2]--;
        System.out.println("Admitted in EIE");
      } else {
        System.out.println("Not admitted!");
      }
    }
    socobj.display();seeeobj.display();
  }
}