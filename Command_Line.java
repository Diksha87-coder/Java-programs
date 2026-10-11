// command line argument code
/* 
class Command_Line {
    public static void main(String args[]) {
        System.out.println("Command line arguments:");

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
    */

// addition of two number with command line argument
public class Command_Line {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int sum = a + b;

        System.out.println("Addition = " + sum);
    }
}

