// wap to create a class A and this class will containe one static method display without parameter and
//  without return value and this display method will pritn a msg class A.create another class B and this
//   class will contain main method and from main method call display method of class A.
/* 
 class A {
    static void display() {
        System.out.println("This is class A");
    }
}

class B {
        public static void main(String[] args) {
        A.display();
    }*/




// WAP to create a class X and this class will contain static block and this static block will print
// a msg Static block. this class also contain main method and main will print a msg Main Method.

/* 
class X {
    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }
}
*/

//Create a class M and this class will contain two instance variable a and b with int datatype.
// this cass also contain one constructor with two parameter a and b with datatype int this constructor 
// will initialize the instance variable a with constructor parameter a and instance variable b with 
// constructor parameter b.class M also contain display method with no parameter and no return value.
// display method will display instance var a and b class M also contain main method and from main method
//  call display method of class M.
/* `
import java.util.Scanner;
class M {
    int a, b;
    M(int a, int b) {
        this.a = a;
        this.b = b;
    }
    void display() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int x = sc.nextInt();
        System.out.print("Enter b: ");
        int y = sc.nextInt();

        M obj = new M(x, y);
        obj.display();

        sc.close();
    }
}*/

// wap to create a class A and class A will contain one method display without parameter and
// withot returnvalue and this method will print a msg class A. create another class B and 
// this class will inherit the property of class A and also contain one method print without 
// parameter and without returnvalue and print a msg class B. class b also contain main method 
// and from main method call all the methods of class B
//SINGLE INHERITENCE
/* 
class A {
    void display() {
        System.out.println("Class A");
    }
}
class B extends A {
    void Print() {
        System.out.println("Class B");
    }
    public static void main(String args[]) {
        B obj = new B();
        obj.display();
        obj.Print();
    }
}*/

// types of inheritence 
// on the basis of class there are three types of inheritence 
// 1. Single :the class which inherit only one class will that is called sinle inheritence
// 2. Multilavel
// 3. Hierarchical


// wap to create a class a and this class will contain one method display without
// parameter and without return value and print a msg class a.create another class b
// and this claass will onherit the property of class a. class b also contain print 
// method without parameter and without return value and print a msg class b.then
// create another class class c and this class will inherit the property of class b
// class c also contain one method println without parameter and without return value
// and print a msg class c.class c also contain main method and from main method 
// of class c call all the methods of class c.

// MULTILAVEL INHERITENNCE
/* 
class A {
    void display() {
        System.out.println("Class A");
    }
}
class B extends A {
    void Print() {
        System.out.println("Class B");
    }
}
class C extends B {
    void println() {
        System.out.println("Class C");
    }
    public static void main(String args[]) {
        C obj = new C();
        obj.display();
        obj.Print();
        obj.println();
    }
}*/

//WAP of Hierarchical inheritance 
// HIERARCHECAL INHERITANCE
class A {
    void display() {
        System.out.println("Class A");
    }
}
class B extends A {
    void print() {
        System.out.println("Class B");
    }
}
class C extends A {
    void println() {
        System.out.println("Class C");
    }
    public static void main(String args[]) {
        B obj1 = new B();
        C obj2 = new C();
        obj1.display();
        obj1.print();

        obj2.display();
        obj2.println();
    }
}

