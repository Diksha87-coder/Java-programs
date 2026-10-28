// wap to create a class A and this class will containe one static method display without parameter and
//  without return value and this display method will pritn a msg class A.create another class B and this
//   class will contain main method and from main method call display method of class A.

/* class A {
    static void display() {
        System.out.println("This is class A");
    }
}

class B {
        public static void main(String[] args) {
        A.display();
    }
*/



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
}*/


//Create a class M and this class will contain two instance variable a and b with int datatype.
// this cass also contain one constructor with two parameter a and b with datatype int this constructor 
// will initialize the instance variable a with constructor parameter a and instance variable b with 
// constructor parameter b.class M also contain display method with no parameter and no return value.
// display method will display instance var a and b class M also contain main method and from main method
//  call display method of class M.

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
}