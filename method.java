import java.util.Scanner;

class MethodExample {

    int add(int a, int b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        MethodExample obj = new MethodExample();

        System.out.println("Addition = " + obj.add(a, b));
        System.out.println("Multiplication = " + obj.multiply(a, b));

        sc.close();
    }
}