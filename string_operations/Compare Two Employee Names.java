import java.util.Scanner;

class EmployeeName {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first employee name: ");
        String emp1 = sc.nextLine();

        System.out.print("Enter second employee name: ");
        String emp2 = sc.nextLine();

        if (emp1.equalsIgnoreCase(emp2))
            System.out.println("Same employee name.");
        else
            System.out.println("Different employee names.");

        System.out.println("Length of first name: " + emp1.length());
        System.out.println("Uppercase: " + emp1.toUpperCase());
    }
}