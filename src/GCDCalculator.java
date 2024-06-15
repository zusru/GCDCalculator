import java.util.Scanner;

public class GCDCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first num: ");
        int a = input.nextInt();

        int c = a;

        System.out.print("Enter second num: ");
        int b = input.nextInt();

        int d = b;



        while (a != b) {

            if (a > b) {
                a = a - b;
            }

            else {
                b = b - a;
            }
        }
        System.out.print("The GCD of " + c + " and " + d + " = " + a);
    }
}