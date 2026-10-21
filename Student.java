// WAP to create a class student with attribute like student id ,studentname, age and gread.
// it also provide a mathod to set and get their attributes along with a method to display the student details

/* 
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
    */

// WAP to create a class A and this class will contain one method display without parameter and 
// without return value but this method will display one msg BCA 2A Student. create another class 
// B and this class will contain main method . from main method of class B call the display method of class A.
/* 
class A{
    void display(){
   System.out.println(" BCA 2A Student");
}}
class B{
    public static void main(String[] args) {
        A Message = new A();
        Message.display();
    }
}


// WAP with defaut constructor
class Student {
    int id;
    String name;

    // Default Constructor
    Student() {
        id = 101;
        name = "Rahul";
    }

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}*/


// WAP to create a class X and this class will contain one static method print without 
// parameter and without return value but print a msg static method. create another
//  class  and this class will contain method. from mrthod of claas Y call print method of class X


/*
class X {
 
    static void print() {
        System.out.println("Hello Java !");
    }
}
class Y {
    void method() {
        X.print();  
    }
    public static void main(String[] args) {
        Y obj = new Y();
        obj.method();
    }
}*/


//WAP to create a class M and this class ill contain one variable X with value 12.6 .
// reate another class and this class will contaim main method. from main method of class
//N print variable X of class M without crearting the object of class M.

class M {
    static double x = 12.6;
}

class N {
    public static void main(String[] args) {
        System.out.println("Value of X: " + M.x);
    }
}
