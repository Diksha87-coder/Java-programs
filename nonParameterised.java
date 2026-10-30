// WAP to create a class book and this class will contain the attributes like title author and price.
// make this program with the help of non parameterised constructor and parameterised constructor.
// this class also contain one display method without parameter and without return value and display 
// method will print the all attribute(variables)
/* 
import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;

    // Non-parameterized constructor
    Book() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for Book 1:");

        System.out.print("Enter title: ");
        title = sc.nextLine();

        System.out.print("Enter author: ");
        author = sc.nextLine();

        System.out.print("Enter price: ");
        price = sc.nextDouble();
    }

    // Parameterized constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // Display method
    void display() {
        System.out.println("\nBook Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Object using non-parameterized constructor
        Book b1 = new Book();
        b1.display();

        // Input for parameterized constructor
        System.out.println("Enter details for Book 2:");

        System.out.print("Enter title: ");
        String t = sc.nextLine();

        System.out.print("Enter author: ");
        String a = sc.nextLine();

        System.out.print("Enter price: ");
        double p = sc.nextDouble();

        // Object using parameterized constructor
        Book b2 = new Book(t, a, p);
        b2.display();

        sc.close();
    }
}
*/


//WAP of constructor overloading

import java.util.Scanner;

class Student {
    int id;
    String name;

    // Non-parameterized constructor
    Student() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter student name: ");
        name = sc.nextLine();
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
        Scanner sc = new Scanner(System.in);

        // Object using non-parameterized constructor
        System.out.println("Enter details for Student 1:");
        Student s1 = new Student();

        // Object using one-parameter constructor
        System.out.println("Enter ID for Student 2:");
        int i = sc.nextInt();
        Student s2 = new Student(i);

        // Object using two-parameter constructor
        System.out.println("Enter details for Student 3:");
        System.out.print("Enter student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        Student s3 = new Student(id, name);

        System.out.println("\nStudent Details:");
        s1.display();
        s2.display();
        s3.display();

        sc.close();
    }
}
