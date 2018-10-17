package potenza;

import java.util.Scanner;

public class Potenza {

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        int a = 1;
        int b = 1;
        try {
            System.out.println("Inserire A: ");
            a = scan1.nextInt();
            System.out.println("Inserire B: ");
            b = scan1.nextInt();
        } catch (Exception x) {
            System.out.println("Niente stringhe o negativi!");
        }

        try {
            System.out.println(power(a, b));
        } catch (StackOverflowError e) {
            System.out.println("Pirla");
        }

    }

    public static int power(int b, int e) {
        if (e == 0) {
            System.out.println(b + "\t-\t" + e);
            return 1;
        } else {
            int tmp = b * power(b, e - 1);
            System.out.println(b + "\t-\t" + e);
            return tmp;
        }

    }

    private static class ExceptionParametroSbagliato extends Exception {

        public ExceptionParametroSbagliato() {

        }

    }
}
