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

        System.out.println(" Student Details ");
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
}
*/

// WAP to create a class X and this class will contain one static method print without 
// parameter and without return value but print a msg static method. create another class 
// and this class will contain method. from mrthod of claas Y call print method of class X


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

/*class M {
    static double x = 12.6;
}

class N {
    public static void main(String[] args) {
        System.out.println("Value of X: " + M.x);
    }
}*/

// WAP to create a class book and this class will contain the attributes like title author and price.
// make this program with the help of non parameterised constructor and parameterised constructor.
// this class also contain one display method without parameter and without return value and display 
// method will print the all attribute(variables)

//PARAMITERISED
import java.util.Scanner;
class book{
    Scanner sc = new Scanner(System.in);
    int price;
    String title, author;
   book(){
     System.out.print("Enter price :");
         price = sc.nextInt();
        System.out.print("Enter author :");
        author = sc.next();
        System.out.print("Enter title : ");
        title = sc.next();
   }
    void display(){
        System.out.println("price =" + price);
        System.out.println("author =" + author);
        System.out.println("title =" + title);

    }
    public static void main (String args[]){
        book obj = new book();
        obj.display();
    }
}

//NON-PARAMETERISED
/* 
import java.util.Scanner;

class book {
    int price;
    String title, author;

    // Parameterized constructor
    book(int p, String t, String a) {
        price = p;
        title = t;
        author = a;
    }

    void display() {
        System.out.println("Price = " + price);
        System.out.println("Author = " + author);
        System.out.println("Title = " + title);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price: ");
        int price = sc.nextInt();

        System.out.print("Enter author: ");
        String author = sc.next();

        System.out.print("Enter title: ");
        String title = sc.next();

        book obj = new book(price, title, author);
        obj.display();

        sc.close();
    }
}
*/


//WAP of constructor overloading

/* 
class Student {
    int id;
    String name;

    // Default constructor
    Student() {
        id = 1;
        name = "Rahul";
    }

    // Parameterized constructor with one parameter
    Student(int i) {
        id = i;
        name = "Unknown";
    }

    // Parameterized constructor with two parameters
    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID = " + id);
        System.out.println("Name = " + name);
        
    }

    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student(2);
        Student s3 = new Student(3, "Amit");

        s1.display();
        s2.display();
        s3.display();
    }
}
*/

//WAP of method overloading

/* 
class Addition {

    // Method with two integer parameters
    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    // Method with three integer parameters
    void add(int a, int b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }

    // Method with two double parameters
    void add(double a, double b) {
        System.out.println("Sum = " + (a + b));
    }

    public static void main(String args[]) {
        Addition obj = new Addition();

        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.add(5.5, 4.5);
    }
}
*/
// if a same class will contain more than one constructor 
// with same name but different parameter is calles constructor overloading.
// different parameters means the number of parameteres will be diffrent or if number 
// of parameters are same then datatype of parameter will be diffrent .