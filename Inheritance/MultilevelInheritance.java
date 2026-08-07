import java.util.Scanner;

class Student {
    int rollNo;
    String name;

    void getStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();
    }
}

class Marks extends Student {
    int[] marks = new int[5];

    void getMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of 5 Subjects:");
        for (int i = 0; i < 5; i++)
            marks[i] = sc.nextInt();
    }
}

class Result extends Marks {
    int total = 0;
    double average;
    char grade;

    void calculate() {
        for (int i = 0; i < 5; i++)
            total += marks[i];

        average = total / 5.0;

        if (average >= 90)
            grade = 'A';
        else if (average >= 75)
            grade = 'B';
        else if (average >= 60)
            grade = 'C';
        else if (average >= 40)
            grade = 'D';
        else
            grade = 'F';
    }

    void display() {
        System.out.println("\nRoll No : " + rollNo);
        System.out.println("Name : " + name);
        System.out.println("Total : " + total);
        System.out.println("Average : " + average);
        System.out.println("Grade : " + grade);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Result r = new Result();
        r.getStudent();
        r.getMarks();
        r.calculate();
        r.display();
    }
}