// even odd with function
/* 
import java.util.Scanner;
class EvenOdd {

    // Function to check even or odd
    static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        checkEvenOdd(n);  // Function call

        sc.close();
    }
}*/



/* 

import java.util.Scanner;
class SumDigits {

    static int sumOfDigits(int num) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = sumOfDigits(n);
        System.out.println("Sum of digits = " + result);

        sc.close();
    }
}*/

