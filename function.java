// WAP to find out the addition of two number with the help of function
//  and here we will create a function without parameter and without  return value in java

/* 
import java.util.Scanner;

class Addition
{
    int a, b;

    void add()
    {
        int sum = a + b;
        System.out.println("Addition = " + sum);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Addition obj = new Addition();

        System.out.print("Enter the first number:");
        obj.a = sc.nextInt();

        System.out.print("Enter the second number:");
        obj.b = sc.nextInt();

        obj.add();

        sc.close();
    }
}*/


// WAP to find out the addition of two number with the help of function
//  and here we will create a function with parameter and without return value in java

/* 
import java.util.Scanner;
class Addition
{
    void add(int a, int b)
    {
        int sum = a + b;
        System.out.println("Addition = " + sum);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Addition obj = new Addition();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        obj.add(a, b);

        sc.close();
    }
}
*/

// WAP to find out the addition of two number with the help of function and here
//  we will create a function without parameter and with return value in java
/* 
import java.util.Scanner;
class Addition
{
    int a, b;

    int add()
    {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Addition obj = new Addition();

        System.out.print("Enter first number: ");
        obj.a = sc.nextInt();

        System.out.print("Enter second number: ");
        obj.b = sc.nextInt();

        int result = obj.add();

        System.out.println("Addition = " + result);

        sc.close();
    }
}
    */

// WAP to find out the addition of two number with the help of function and here
//  we will create a function with parameter and with return value in java

/* 
import java.util.Scanner;
class Addition
{
    int a, b;
    int add()
    {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Addition obj = new Addition();

        System.out.print("Enter the first number:");
        obj.a = sc.nextInt();

        System.out.print("Enter the second number:");
        obj.b = sc.nextInt();

        int result = obj.add();
        System.out.println("Addition = " + result);

        sc.close();
    }
}
*/
