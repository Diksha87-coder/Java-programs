// WAP to create a class book and this class will contain the attributes like title author and price.
// make this program with the help of non parameterised constructor and parameterised constructor.
// this class also contain one display method without parameter and without return value and display 
// method will print the all attribute(variables)

//PARAMITERISED
/*import java.util.Scanner;
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
*/
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