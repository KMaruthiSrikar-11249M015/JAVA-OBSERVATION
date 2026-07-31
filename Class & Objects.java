import java.util.*;
class Student{
    String name;
    int rollno;
    int marks;

    Student(String name,int rollno,int marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
    char claculateGrade(){
        if (marks>=90)
            return 'A';
        else if (marks>=75)
            return 'B';
        else if (marks>=60)
            return 'C';
        else
            return 'F';
    }
    void display(){
        System.out.println("Name:"+ name);
        System.out.println("Roll no :" + rollno);
        System.out.println("Marks :"+marks);
        System.out.println("Grade :"+ claculateGrade());
        System.out.println();
    }
    public static void main(String args[]){
        Student s1 = new Student("Rahul",101,99);
        Student s2 = new Student("Gokul",107,56);
        s1.display();
        s2.display();
    }
}