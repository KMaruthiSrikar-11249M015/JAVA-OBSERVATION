import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double basicSalary;

    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
    }
}

class PermanentEmployee extends Employee {
    double hra, da, grossSalary;

    void calculateSalary() {
        hra = basicSalary * 0.20;
        da = basicSalary * 0.10;
        grossSalary = basicSalary + hra + da;
    }

    void display() {
        System.out.println("\nEmployee ID : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("HRA : " + hra);
        System.out.println("DA : " + da);
        System.out.println("Gross Salary : " + grossSalary);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        PermanentEmployee p = new PermanentEmployee();
        p.getDetails();
        p.calculateSalary();
        p.display();
    }
}