// WAP to create a class student with attribute like student id ,studentname, age and gread.
// it also provide a mathod to set and get their attributes along with a method to display the student details


import java.util.Scanner;

public class Student {

    int studentId;
    String studentName;
    int age;
    String grade;

    // Method to set attributes
    void setData(int id, String name, int a, String g) {
        studentId = id;
        studentName = name;
        age = a;
        grade = g;
    }

    // Methods to get attributes
    int getStudentId() {
        return studentId;
    }

    String getStudentName() {
        return studentName;
    }

    int getAge() {
        return age;
    }

    String getGrade() {
        return grade;
    }

    // Method to display student details
    void display() {
        System.out.println("Student ID: " + getStudentId());
        System.out.println("Student Name: " + getStudentName());
        System.out.println("Age: " + getAge());
        System.out.println("Grade: " + getGrade());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student obj = new Student();

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();

        obj.setData(id, name, age, grade);

        System.out.println("\n--- Student Details ---");
        obj.display();

        sc.close();
    }
}

