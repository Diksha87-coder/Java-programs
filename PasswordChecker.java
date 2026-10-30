
import java.util.Scanner;

class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (password.length() >= 8) {
            System.out.println("Password Length is Strong");
        } else {
            System.out.println("Password is Too Short");
        }

        sc.close();
    }
}

// wap to create a class A and this class will containe one static method display without parameter and
//  without return value and thid display method will pritn a msg class A.create another class B and this
//   class will contain main method and from main method call display method of class A.

// WAP to create a class X and this class will contain static block and this static block will print
// a msg Static block. this class also contain main method and main will print a msg Main Method.

//Create a class M and this class will contain two instance variable a and b with int datatype.
// this cass also contain one constructor with two parameter a and b with datatype int this constructor 
// will initialize the instance variable a with constructor parameter a and instance variable b with 
// constructor parameter b.class M also contain display method with no parameter and no return value.
// display method will display instance var a and b class M also contain main method and from main method
//  call display method of class M.